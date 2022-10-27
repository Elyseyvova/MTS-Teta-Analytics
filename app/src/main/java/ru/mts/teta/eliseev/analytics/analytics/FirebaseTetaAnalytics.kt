package ru.mts.teta.eliseev.analytics.analytics

import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import ru.mts.teta.eliseev.analytics.utils.Constants.USER_ID

class FirebaseTetaAnalytics(private val context: Context) : TetaAnalytics {

    private val analytics = FirebaseAnalytics.getInstance(context)

    override fun login() {
        analytics.setUserId(USER_ID)
    }

    override fun logout() {
        analytics.setUserId(null)
    }

    override fun sendEvent() {
        analytics.logEvent("TEST_EVENT_TO_FIREBASE", null)
    }


    override fun simulateCrash() {
        throw RuntimeException("Test Crash from Firebase")
    }
}