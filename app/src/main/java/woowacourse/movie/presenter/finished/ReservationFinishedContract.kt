package woowacourse.movie.presenter.finished

import woowacourse.movie.model.Movie

interface ReservationFinishedContract {
    fun showMovieInformation(movie: Movie)

    fun showReservationHistory(
        ticketCount: Int,
        price: Int,
    )
}
