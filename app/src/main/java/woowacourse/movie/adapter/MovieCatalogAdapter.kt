package woowacourse.movie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import woowacourse.movie.R
import woowacourse.movie.model.Movie

class MovieCatalogAdapter(
    private val context: Context,
    private val movies: List<Movie>,
    val movie: (Movie) -> Unit,
) : BaseAdapter() {
    override fun getCount(): Int = movies.size

    override fun getItem(position: Int): Any = movies[position]

    override fun getItemId(position: Int): Long = 0

    override fun getView(
        position: Int,
        view: View?,
        parent: ViewGroup?,
    ): View {
        val convertView: View = view ?: LayoutInflater.from(context).inflate(R.layout.item_movie_catalog, null)
        val title = convertView.findViewById<TextView>(R.id.item_movie_catalog_text_view_title)
        val poster = convertView.findViewById<ImageView>(R.id.item_movie_catalog_image_view_poster)
        val screeningDate = convertView.findViewById<TextView>(R.id.item_movie_catalog_text_view_screening_date)
        val runningTime = convertView.findViewById<TextView>(R.id.item_movie_catalog_text_view_running_time)
        val reservationButton = convertView.findViewById<Button>(R.id.item_movie_catalog_button_reservation)

        val item: Movie = movies[position]
        title.text = item.title
        poster.setImageResource(item.posterId)
        screeningDate.text = item.screeningDate
        runningTime.text = item.runningTime
        reservationButton.setOnClickListener {
            movie(item)
        }

        return convertView
    }
}
