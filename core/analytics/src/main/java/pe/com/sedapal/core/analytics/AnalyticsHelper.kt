package pe.com.sedapal.core.analytics

import pe.com.sedapal.core.analytics.AnalyticsEvent

/**
 * Interface for logging analytics events. See `FirebaseAnalyticsHelper` and
 * `StubAnalyticsHelper` for implementations.
 */
interface AnalyticsHelper {
    fun logEvent(event: AnalyticsEvent)
}
