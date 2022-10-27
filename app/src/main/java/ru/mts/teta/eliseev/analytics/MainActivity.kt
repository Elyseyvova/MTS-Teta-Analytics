package ru.mts.teta.eliseev.analytics

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ru.mts.teta.eliseev.analytics.analytics.Analytics
import ru.mts.teta.eliseev.analytics.analytics.FirebaseTetaAnalytics
import ru.mts.teta.eliseev.analytics.analytics.YandexMetricaTetaAnalytics

class MainActivity : AppCompatActivity() {

    private val analytics: Analytics by lazy {
        Analytics.Builder()
            .add(FirebaseTetaAnalytics(this))
            .add(YandexMetricaTetaAnalytics())
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLogin).setOnClickListener { analytics.login() }
        findViewById<Button>(R.id.btnLogout).setOnClickListener { analytics.logout() }
        findViewById<Button>(R.id.btnEvent).setOnClickListener { analytics.sendEvent() }
        findViewById<Button>(R.id.btnCrash).setOnClickListener { analytics.simulateCrash() }
    }
}