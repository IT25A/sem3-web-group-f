package de.it25a.planebook.domain

import java.util.Date

data class GuestbookEntry(
    val content: String,
    val userId: UserId,
    val date: Date,
    val flightNumber: FlightNumber?
)