package woowacourse.movie.view.reservation

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import woowacourse.movie.R
import woowacourse.movie.db.SeatsDao
import woowacourse.movie.model.Grade
import woowacourse.movie.model.Seat
import woowacourse.movie.model.Ticket
import woowacourse.movie.presenter.reservation.SeatSelectionContract
import woowacourse.movie.presenter.reservation.SeatSelectionPresenter
import java.io.Serializable

class SeatSelectionActivity : AppCompatActivity(), SeatSelectionContract.View {
    private val presenter: SeatSelectionPresenter = SeatSelectionPresenter(this, SeatsDao())

    private val seatTableLayout: TableLayout by lazy { findViewById(R.id.table_layout_seat_selection) }
    private val confirmButton: Button by lazy { findViewById(R.id.button_seat_selection_confirm) }
    private lateinit var seats: List<Button>
    private lateinit var ticket: Ticket

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)

        ticket = intent.intentSerializable(ReservationDetailActivity.TICKET, Ticket::class.java) ?: Ticket()

        seats =
            seatTableLayout.children.filterIsInstance<TableRow>().flatMap { it.children }
                .filterIsInstance<Button>().toList()
        presenter.loadSeatNumber()
    }

    override fun showSeatNumber(
        index: Int,
        seat: Seat,
    ) {
        seats[index].apply {
            text = getString(R.string.select_seat_number).format(seat.row, seat.column)
            setTextColor(setUpSeatColorByGrade(seat.grade))
            setOnClickListener {
                val seatsCount = seats.count { seat -> seat.isSelected }
                if (seatsCount < ticket.count || it.isSelected) {
                    updateSeatSelectedState(index, isSelected)
                    val updatedSeatsCount = seats.count { seat -> seat.isSelected }
                    setConfirmButtonEnabled(updatedSeatsCount)
                }
            }
        }
    }

    override fun setUpSeatColorByGrade(grade: Grade): Int {
        return when (grade) {
            Grade.B -> getColor(R.color.purple_500)
            Grade.S -> getColor(R.color.teal_700)
            Grade.A -> getColor(R.color.blue)
        }
    }

    override fun updateSeatSelectedState(
        index: Int,
        isSelected: Boolean,
    ) {
        seats[index].isSelected = !isSelected
    }

    override fun setConfirmButtonEnabled(count: Int) {
        confirmButton.isEnabled = count >= ticket.count
    }

    private fun <T : Serializable> Intent.intentSerializable(
        key: String,
        clazz: Class<T>,
    ): T? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            this.getSerializableExtra(key, clazz)
        } else {
            this.getSerializableExtra(key) as T?
        }
    }
}
