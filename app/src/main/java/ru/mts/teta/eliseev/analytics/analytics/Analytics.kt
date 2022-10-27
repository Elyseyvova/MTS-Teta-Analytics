package ru.mts.teta.eliseev.analytics.analytics

class Analytics private constructor(private val tetaAnalytics: List<TetaAnalytics>) {

    class Builder {

        private val tetaAnalytics: MutableList<TetaAnalytics> = mutableListOf()

        fun add(newAnalytics: TetaAnalytics): Builder {
            this.tetaAnalytics.add(newAnalytics)
            return this
        }

        fun build() = Analytics(tetaAnalytics)
    }

    fun login() {
        tetaAnalytics.forEach { it.login() }
    }

    fun logout() {
        tetaAnalytics.forEach { it.logout() }
    }

    fun sendEvent() {
        tetaAnalytics.forEach { it.sendEvent() }
    }

    fun simulateCrash() {
        tetaAnalytics.forEach { it.simulateCrash() }
    }
}