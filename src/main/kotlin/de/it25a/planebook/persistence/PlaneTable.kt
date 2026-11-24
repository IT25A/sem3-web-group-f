package de.it25a.planebook.persistence

import org.jetbrains.exposed.v1.core.Table

object PlaneTable : Table("planes") {
    val registration = varchar("registration", 6)

    override val primaryKey = PrimaryKey(registration)
}
