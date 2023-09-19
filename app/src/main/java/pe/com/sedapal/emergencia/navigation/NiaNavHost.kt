
package pe.com.sedapal.emergencia.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import pe.com.sedapal.emergencia.navigation.TopLevelDestination.INTERESTS
import pe.com.sedapal.emergencia.ui.NiaAppState

/**
 * Top-level navigation graph. Navigation is organized as explained at
 * https://d.android.com/jetpack/compose/nav-adaptive
 *
 * The navigation graph defined in this file defines the different top level routes. Navigation
 * within each route is handled using state and Back Handlers.
 */
@Composable
fun NiaNavHost(
    appState: NiaAppState,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    startDestination: String = forYouNavigationRoute,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        forYouScreen(onTopicClick = navController::navigateToTopic)
        bookmarksScreen(
            onTopicClick = navController::navigateToTopic,
            onShowSnackbar = onShowSnackbar,
        )
        searchScreen(
            onBackClick = navController::popBackStack,
            onInterestsClick = { appState.navigateToTopLevelDestination(INTERESTS) },
            onTopicClick = navController::navigateToTopic,
        )
        interestsGraph(
            onTopicClick = navController::navigateToTopic,
            nestedGraphs = {
                topicScreen(
                    onBackClick = navController::popBackStack,
                    onTopicClick = navController::navigateToTopic,
                )
            },
        )
    }
}
