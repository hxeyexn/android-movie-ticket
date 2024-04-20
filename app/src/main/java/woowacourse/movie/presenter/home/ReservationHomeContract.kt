package woowacourse.movie.presenter.home

import woowacourse.movie.model.Movie

interface ReservationHomeContract {
    interface View {
        fun navigateToDetail(movieId: Int)
    }

    interface Presenter {
        fun loadMovie(movie: Movie)
    }
}
