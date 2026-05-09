import java.sql.*;

class Student
{
    String driverName = "oracle.jdbc.driver.OracleDriver";

    Connection con;
    Statement stmt;

    // Load Driver
    void loadDriver() throws Exception
    {
        Class.forName(driverName);

        System.out.println("Driver loaded successfully");
    }

    // Establish Connection
    void establishConnection() throws Exception
    {
        con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "amrit",
                "jdbc@0721"
        );

        System.out.println("Connection established successfully");
    }

    // Create Table
    void createTable() throws Exception
    {
        stmt = con.createStatement();

        String sql =
                "create table student(" +
                "roll number primary key, " +
                "name varchar2(50), " +
                "mobile number)";

        stmt.executeUpdate(sql);

        System.out.println("Table created successfully");
    }

    // Insert Record
    void insertRecord() throws Exception
    {
        stmt = con.createStatement();

        String sql =
                "insert into student values(1001,'Amrit',1002200330)";

        stmt.executeUpdate(sql);

        System.out.println("Record inserted successfully");
    }

    // Select All Records
    void selectAllRecord() throws Exception
    {
        stmt = con.createStatement();

        String sql = "select * from student";

        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next())
        {
            System.out.println(
                    "Roll : " + rs.getInt(1) +
                    " Name : " + rs.getString(2) +
                    " Mobile : " + rs.getLong(3)
            );
        }

        System.out.println("Records fetched successfully");
    }

    // Delete Record
    void deleteRecord() throws Exception
    {
        stmt = con.createStatement();

        String sql = "delete from student where roll=1001";

        stmt.executeUpdate(sql);

        System.out.println("Record deleted successfully");
    }
}

public class JdbcConnection
{
    public static void main(String args[]) throws Exception
    {
        Student s1 = new Student();

        s1.loadDriver();

        s1.establishConnection();

        s1.createTable();

        s1.insertRecord();

        s1.selectAllRecord();

        s1.deleteRecord();

        s1.con.close();

        System.out.println("Connection closed");
    }
}
