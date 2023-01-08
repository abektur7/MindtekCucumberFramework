package utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExelTest {
    public static void main(String[] args) throws IOException {
//        String path = System.getProperty("user.dir")+"/src/test/resources/testData/Data1.xlsx";
//        FileInputStream input =new FileInputStream(path);
//        Workbook workbook=new XSSFWorkbook(input);
//
//        Sheet sheet1 = workbook.getSheet("Sheet1");
//        String firstName=sheet1.getRow(1).getCell(0).toString();
//        System.out.println(firstName);
//        System.out.println(sheet1.getRow(2).getCell(1).toString());
//
//        sheet1.getRow(2).getCell(1).setCellValue("Nadkarni");
//        System.out.println(sheet1.getRow(2).getCell(1).toString());
//
//        FileOutputStream output = new FileOutputStream(path);
//        workbook.write(output);
//        output.close();

        ExelUtils.openExcelFile("Data1","Sheet1");

        System.out.println(ExelUtils.getValue(1,2));

        ExelUtils.setValue(1,2,"coconut@gmail.com");
        System.out.println(ExelUtils.getValue(1,2));

        List<String> names=new ArrayList<>();
        names.add("Raif");
        names.add("Usha");
        names.add("Najya");

        for(String name:names){
            ExelUtils.setValue(1,2,name);
            System.out.println(ExelUtils.getValue(1,2));
        }
    }
}
