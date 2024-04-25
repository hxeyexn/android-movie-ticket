package woowacourse.movie.view.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import woowacourse.movie.R
import woowacourse.movie.adapter.AdvertisementViewHolder
import woowacourse.movie.adapter.MovieViewHolder

@RunWith(AndroidJUnit4::class)
class ReservationHomeActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(ReservationHomeActivity::class.java)

    @Test
    fun `영화_목록을_보여준다`() {
        onView(withId(R.id.recycler_view_reservation_home)).check(matches(isDisplayed()))
    }

    @Test
    fun `영화_목록의_아이템은_제목을_보여준다`() {
        onView(withId(R.id.item_movie_catalog_text_view_title)).check(matches(isDisplayed()))
    }

    @Test
    fun `영화_목록의_아이템은_포스터를_보여준다`() {
        onView(withId(R.id.item_movie_catalog_image_view_poster)).check(matches(isDisplayed()))
    }

    @Test
    fun `영화_목록의_아이템은_상영기간을_보여준다`() {
        onView(withId(R.id.item_movie_catalog_text_view_screening_date)).check(matches(isDisplayed()))
    }

    @Test
    fun `영화_목록의_아이템은_보여준다`() {
        onView(withId(R.id.item_movie_catalog_text_view_running_time)).check(matches(isDisplayed()))
    }

    @Test
    fun `영화_목록의_3번째_아이템은_영화가_보여진다`() {
        onView(withId(R.id.recycler_view_reservation_home)).check(
            matches(
                object :
                    TypeSafeMatcher<View>() {
                    override fun describeTo(description: Description) {
                        description.appendText("Checking ViewHolder at position $2")
                    }

                    override fun matchesSafely(view: View): Boolean {
                        if (view !is RecyclerView) return false
                        val viewHolder = view.findViewHolderForAdapterPosition(2)
                        return viewHolder != null && MovieViewHolder::class.java.isInstance(viewHolder)
                    }
                },
            ),
        )
    }

    @Test
    fun `영화_목록의_4번째_아이템은_광고가_보여진다`() {
        onView(withId(R.id.recycler_view_reservation_home)).check(
            matches(
                object :
                    TypeSafeMatcher<View>() {
                    override fun describeTo(description: Description) {
                        description.appendText("Checking ViewHolder at position $3")
                    }

                    override fun matchesSafely(view: View): Boolean {
                        if (view !is RecyclerView) return false
                        val viewHolder = view.findViewHolderForAdapterPosition(3)
                        return viewHolder != null &&
                            AdvertisementViewHolder::class.java.isInstance(
                                viewHolder,
                            )
                    }
                },
            ),
        )
    }
}
