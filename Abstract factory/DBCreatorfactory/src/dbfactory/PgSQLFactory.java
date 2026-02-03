package dbfactory;

import dbcomponents.command.Command;
import dbcomponents.command.MySQLCommand;
import dbcomponents.command.PgSQLCommand;
import dbcomponents.connection.Connection;
import dbcomponents.connection.MySQLConnection;
import dbcomponents.connection.PgSQLConnection;
import dbcomponents.resultset.MySQLResult;
import dbcomponents.resultset.PgSQLResult;
import dbcomponents.resultset.ResultSet;

public class PgSQLFactory extends DBfactory{
    @Override
    public Command getCommand() {
        return new PgSQLCommand();
    }

    @Override
    public ResultSet getResultset() {
        return new PgSQLResult();
    }

    @Override
    public Connection getConnection() {
        return new PgSQLConnection();
    }
}
