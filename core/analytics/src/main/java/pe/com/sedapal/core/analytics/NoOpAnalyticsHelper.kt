package pe.com.sedapal.core.analytics

import pe.com.sedapal.core.analytics.AnalyticsEvent
import pe.com.sedapal.core.analytics.AnalyticsHelper

/**
 * Implementation of AnalyticsHelper which does nothing. Useful for tests and previews.
 */
class NoOpAnalyticsHelper : AnalyticsHelper {
    override fun logEvent(event: AnalyticsEvent) = Unit
}
