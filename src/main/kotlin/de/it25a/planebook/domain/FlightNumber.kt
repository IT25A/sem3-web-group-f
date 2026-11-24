package de.it25a.planebook.domain

@JvmInline
value class FlightNumber(val value: String) {
    init {
        require(value.length > 3)
        require(value.slice(0..2).contains("0")) // TODO DON'TDO make this work
    }
}