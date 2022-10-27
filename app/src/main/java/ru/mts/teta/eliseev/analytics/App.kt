package ru.mts.teta.eliseev.analytics

import android.app.Application
import com.yandex.metrica.YandexMetrica
import com.yandex.metrica.YandexMetricaConfig
import ru.mts.teta.eliseev.analytics.utils.Constants.YANDEX_METRICA_API_KEY

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        configYandexMetrica()
    }

    private fun configYandexMetrica() {
        val config = YandexMetricaConfig
            .newConfigBuilder(YANDEX_METRICA_API_KEY)
            .build()

        YandexMetrica.activate(applicationContext, config)
        YandexMetrica.enableActivityAutoTracking(this)
    }
}