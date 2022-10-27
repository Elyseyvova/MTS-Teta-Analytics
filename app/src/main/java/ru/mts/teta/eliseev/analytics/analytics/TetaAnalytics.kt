package ru.mts.teta.eliseev.analytics.analytics

interface TetaAnalytics {
    fun login()
    fun logout()
    fun sendEvent()
    fun simulateCrash()
}