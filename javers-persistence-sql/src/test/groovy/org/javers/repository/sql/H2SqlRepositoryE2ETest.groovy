package org.javers.repository.sql

import java.sql.Connection
import java.sql.DriverManager

class H2SqlRepositoryE2ETest extends JaversSqlRepositoryE2ETest {

    Connection createConnection() {
        DriverManager.getConnection( "jdbc:h2:mem:test" )//TRACE_LEVEL_SYSTEM_OUT=2")
    }

    DialectName getDialect() {
        DialectName.H2
    }
}
