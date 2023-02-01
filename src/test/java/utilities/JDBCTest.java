package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        // create connection:
        Connection cnn = DriverManager.getConnection(
                "jdbc:postgresql://localhost/HR_Production",
                "postgres",
                "admin"
        );

        // statement
        Statement stt = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

//        //read data
//        ResultSet rs = stt.executeQuery("Select * from jobs");
//
//        while (rs.next()) {
//            System.out.println(rs.getString("job_title"));
//            System.out.println(rs.getString("min_salary"));
//        }


        //print "fullname of parent is a parent of "fullname of child""
        //Penelope Gietz is a parent of Jack Gietz.

   //     ResultSet rs = stt.executeQuery("select concat(e.first_name, ' ', e.last_name) as p_full_name, concat(d.first_name, ' ', d.last_name) as d_full_name from employees e, dependents d\n" +
    //            "where e.employee_id = d.employee_id");

//        ResultSet rs = stt.executeQuery("select concat (e.first_name, ' ', e.last_name)as p_full_name, concat (e.first_name, ' ', e.last_name) as d_full_name\n" +
//                "from employees e\n" +
//                "inner join dependents d\n" +
//                "on e.employee_id = d.employee_id");


//        while (rs.next()) {
//           System.out.print(rs.getString("p_full_name"));
//           System.out.print(" is a parent of ");
//           System.out.print(rs.getString("d_full_name"));
//
//            System.out.println(",");
//       }


     //   while (rs.next ()) System.out.println(rs.getString("p_full_name")+ "is a parent of "+ rs.getString("d_full_name"));

        //System.out.println(rs.getString("job_title"));


        // find out if there are any emails not ending with @sqltutorial.org

        // 1 query to get all the emails and put them into ResultSet
        //2 put those to arraylist
        // 3 find out if there are any emails not ending with @sqltutorial.org
        // if there is such email then print "found different emails"
        // if all emails ends @sqltutorial.org then print "All emails are same"

        ResultSet rs = stt.executeQuery("select email from employees");


        System.out.println("done");

        findDifferentEmail (cnn, stt);
    }

    private static void findDifferentEmail(Connection cnn, Statement stt) throws SQLException {
        ResultSet rs= stt.executeQuery("select email from employees");

        ArrayList <String> emailList = new ArrayList<>();
        while (rs.next()) emailList.add (rs.getString("email"));
       boolean isWrongEmail = false;
       for( String email: emailList){
           if (!email.endsWith("@sqltutorial.org")){

               System.out.println("Wrong email: "+ email);
               isWrongEmail = true;
           }
       }

         if (isWrongEmail) System.out.println("Found different emails");
         else System.out.println("All emails are same");

    }


}
