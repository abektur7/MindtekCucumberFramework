package utilities;

import java.sql.*;
import java.util.ArrayList;

public class JDBC2 {

    public static void main(String[] args) throws SQLException {
        // create connection:
        Connection cnn = DriverManager.getConnection(
                ConfigReader.getProperty("DBURL"),
                ConfigReader.getProperty("DBUser"),
                ConfigReader.getProperty("DBPassword")

        );

        // statement
        Statement stt = cnn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);


        // read data
//        ResultSet rs = stt.executeQuery("Select * from jobs");
//        rs.next();
//        System.out.println(rs.getString("job_title"));

        //    printCountries(stt);

        //   printDepartmentsByCountries(stt);

        updateAllemails(stt);

    }

    private static void updateAllemails(Statement stt) throws SQLException {
//        ResultSet rs = stt.executeQuery("select email from employees");
//        ArrayList<String> emailList = new ArrayList<>();
//        while (rs.next()) emailList.add(rs.getString("email"));
//
//        for (String email : emailList) {
//            if (!email.endsWith("@mindtek.edu")) {
//                System.out.println(email.substring(0,email.indexOf("@"))+ "@mindtek.edu");
//            }
//
//        }

         String emailQuary = "select email from employees";
        ResultSet rs =stt.executeQuery(emailQuary);
        ArrayList<String> emailList=new ArrayList<>();
        while (rs.next()){
            emailList.add(rs.getString("email"));
        }

        ArrayList<String> newemailList=new ArrayList<>();

        for (String email : emailList){
            email = email.substring(0,email.indexOf('@')) + "@mindtek.edu";
            newemailList.add(email);
        }
        System.out.println(emailList);
        System.out.println(newemailList);

       // put to db
        String updateQuery = "update employees set email = newEmail where employees.email = oldEmail";
        int i =0;
        for (String em : emailList){
            updateQuery = "update employees set email = '" + newemailList.get(i) +  "' where employees.email = '" + emailList.get(i) + "'";
            stt.executeUpdate(updateQuery);
            i++;
        }


    }
        private static void printDepartmentsByCountries (Statement stt) throws SQLException {
            ResultSet rs = stt.executeQuery("select locations.country_id, count (departments.department_name)\n" +
                    " from locations, departments\n" +
                    " where locations.location_id = departments.location_id\n" +
                    " group by locations.country_id;");

            while (rs.next()) {
                System.out.println(rs.getString("country_id") + " -> " + rs.getString("count"));

            }
        }

        private static void printCountries (Statement stt) throws SQLException {
            ResultSet resultSet = stt.executeQuery("select * from countries");
            resultSet.next();
            int count = 1;
            while (resultSet.next()) {
                System.out.println(count + " -> " + resultSet.getString("country_name"));
                count++;
            }

        }
    }
