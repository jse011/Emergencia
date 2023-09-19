package pe.com.sedapal.emergencia.navigation

import androidx.compose.ui.graphics.vector.ImageVector
//import com.google.samples.apps.nowinandroid.core.designsystem.icon.NiaIcons
//import com.google.samples.apps.nowinandroid.feature.bookmarks.R as bookmarksR
//import com.google.samples.apps.nowinandroid.feature.foryou.R as forYouR
//import com.google.samples.apps.nowinandroid.feature.interests.R as interestsR

/**
 * Type for the top level destinations in the application. Each of these destinations
 * can contain one or more screens (based on the window size). Navigation from one screen to the
 * next within a single destination will be handled directly in composables.
 */
enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
) {
    FOR_YOU(
        selectedIcon = NiaIcons.Upcoming,
        unselectedIcon = NiaIcons.UpcomingBorder,
        iconTextId = forYouR.string.for_you,
        titleTextId = R.string.app_name,
    ),
    BOOKMARKS(
        selectedIcon = NiaIcons.Bookmarks,
        unselectedIcon = NiaIcons.BookmarksBorder,
        iconTextId = bookmarksR.string.saved,
        titleTextId = bookmarksR.string.saved,
    ),
    INTERESTS(
        selectedIcon = NiaIcons.Grid3x3,
        unselectedIcon = NiaIcons.Grid3x3,
        iconTextId = interestsR.string.interests,
        titleTextId = interestsR.string.interests,
    ),
}
