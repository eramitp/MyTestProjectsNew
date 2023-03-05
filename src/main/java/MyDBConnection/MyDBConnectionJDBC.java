package MyDBConnection;

import java.sql.*;

public class MyDBConnectionJDBC {

    static Connection con;
    public static void main(String [] args) throws Throwable {
        String host = "jdbc:mysql://localhost:3306/EMPSYNC";
        String uName = "root";
        String uPass = "admin";
        String tableName = "emp";

        try {
            con = DriverManager.getConnection(host, uName,uPass);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from "+tableName);

            switch (tableName) {
                case "emp" :
                    System.out.println("name\t\tlocation\t\tsalary");
                    // Condition check
                    while (rs.next()) {

                        String name = rs.getString("name");
                        String location = rs.getString("location");
                        int salary = rs.getInt("salary");
                        System.out.println(name + "\t\t" + location
                                + "\t\t" + salary);
                    }
                    break;
                case "job" :
                    System.out.println("name\t\tDesignation\t\tCompany");
                    // Condition check
                    while (rs.next()) {

                        String name = rs.getString("name");
                        String Designation = rs.getString("Designation");
                        String Company = rs.getString("Company");
                        System.out.println(name + "\t\t" + Designation
                                + "\t\t" + Company);
                    }
                    break;
            }
        }
        catch (Exception e) {
            System.out.println("Invalid DB name or Table Name");
        }
        finally {
            con.close();
        }
    }
}
