package ru.mts.teta.eliseev.analytics.analytics

import com.yandex.metrica.YandexMetrica
import ru.mts.teta.eliseev.analytics.utils.Constants.USER_ID

class YandexMetricaTetaAnalytics : TetaAnalytics {

    override fun login() {
        YandexMetrica.setUserProfileID(USER_ID)
    }

    override fun logout() {
        YandexMetrica.setUserProfileID(null)
    }


    override fun sendEvent() {
        YandexMetrica.reportEvent("TEST_EVENT_TO_YANDEX_METRICA")
    }


    override fun simulateCrash() {
        throw RuntimeException("Test Crash from Yandex Metrica")
    }
}