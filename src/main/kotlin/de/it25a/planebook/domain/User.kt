package de.it25a.planebook.domain

data class User(
    val id: UserId,
    val name: String,
    val passwordHash: String
)