import dbcomponents.command.Command;
import dbcomponents.connection.Connection;
import dbcomponents.connection.MySQLConnection;
import dbcomponents.resultset.ResultSet;
import dbfactory.MySQLFactory;
import dbfactory.PgSQLFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MySQLFactory mySQLFactory = new MySQLFactory();
        PgSQLFactory pgSQLFactory = new PgSQLFactory();

        System.out.println("MySQL Setup");
        Connection mySQLConnection = mySQLFactory.getConnection();
        Command mySQLCommand = mySQLFactory.getCommand();
        ResultSet mySQLResultSet = mySQLFactory.getResultset();

        mySQLConnection.connect("Anan", "1234");
        mySQLConnection.execute();
        mySQLConnection.getResult();

        mySQLCommand.connect("Anan", "1234");
        mySQLCommand.execute();
        mySQLCommand.getResult();

        System.out.println("PostgreSQL setup");
        //repeat for pgsql
    }
}