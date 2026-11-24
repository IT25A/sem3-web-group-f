package de.it25a.planebook

import de.it25a.planebook.persistence.PlaneTable
import io.ktor.server.netty.EngineMain
import org.jetbrains.exposed.v1.jdbc.Database
import org.jetbrains.exposed.v1.jdbc.SchemaUtils
import org.jetbrains.exposed.v1.jdbc.transactions.TransactionManager
import org.jetbrains.exposed.v1.jdbc.transactions.transaction
import java.sql.Connection

fun main(args: Array<String>) {
    Database.connect("jdbc:sqlite:./data/data.db", driver = "org.sqlite.JDBC")
    TransactionManager.manager.defaultIsolationLevel = Connection.TRANSACTION_SERIALIZABLE

    transaction {
        SchemaUtils.create(PlaneTable)
    }

    EngineMain.main(args)
}
