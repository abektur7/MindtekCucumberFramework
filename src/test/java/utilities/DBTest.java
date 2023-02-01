package utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBTest {
    public static void main(String[] args) throws SQLException {
        DB db = new DB();

//        String query =  "Update employees Set email='test@gmail.com' where employee_id = 100";
//        db.runUpdateQuery(query);

//        String query =  "delete from countries where country_id = 'BR' ";
//        db.runDeleteQuery(query);

//         String query = "insert into countries values ('NK', 'North Korea', 3)";
//         db.runInsertQuery(query);




// select first_name, last_name from employees
        // db.runSelectQuery("1","2","jobs");
        // db.runSelectQuery( , employees)

        ArrayList<String>columnNames = new ArrayList<>();
        columnNames.add("first_name");
        columnNames.add("last_name");
        columnNames.add("phone_number");

       ResultSet rs = db.runSelectQuery(columnNames, "employees");
     //   ResultSet rs = db.exequteSelectQuery(query);
        while (rs.next()) System.out.println(rs.getString("first_name") + " " + rs.getString("phone_number"));

        db.close();

    }
}
