package dbfactory;

import dbcomponents.command.Command;
import dbcomponents.command.MySQLCommand;
import dbcomponents.connection.Connection;
import dbcomponents.connection.MySQLConnection;
import dbcomponents.resultset.MySQLResult;
import dbcomponents.resultset.ResultSet;

public class MySQLFactory extends DBfactory{
    @Override
    public Command getCommand() {
        return new MySQLCommand();
    }

    @Override
    public ResultSet getResultset() {
        return new MySQLResult();
    }

    @Override
    public Connection getConnection() {
        return new MySQLConnection();
    }
}
