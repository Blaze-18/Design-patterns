package dbfactory;

import dbcomponents.command.Command;
import dbcomponents.connection.Connection;
import dbcomponents.resultset.ResultSet;

public abstract class DBfactory {
    public abstract Command getCommand();
    public abstract ResultSet getResultset();
    public abstract Connection getConnection();
}
