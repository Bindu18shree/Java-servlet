package com.xworkz.apachepoi.service;

import com.xworkz.apachepoi.entity.AppEntity;
import com.xworkz.apachepoi.repository.AppRepo;
import com.xworkz.apachepoi.repository.AppRepoImpl;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class AppServiceImpl implements AppService{

   private AppRepo appRepo = new AppRepoImpl();
    @Override
    public boolean save(AppEntity appEntity) {
        System.out.println("Running save in app service impl..");

        String filePath = "C:\\Users\\DELL\\OneDrive\\Documents\\Excel\\Book1.xlsx";
        try(FileInputStream fileInputStream = new FileInputStream(filePath);
            Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            if (rowIterator.hasNext()) {
                rowIterator.next();
            }

            while (rowIterator.hasNext()){
                Row  row = rowIterator.next();

                AppEntity appEntity1 = new AppEntity();

                appEntity1.setAppName(row.getCell(1).getStringCellValue());
                appEntity1.setAppVersion((int) row.getCell(2).getNumericCellValue());
                appEntity1.setCreatedDate(row.getCell(3).getStringCellValue());
                appEntity1.setCreatedBy(row.getCell(4).getStringCellValue());

                appRepo.save(appEntity1);
            }
        } catch (IOException e) {
            System.out.println("Error while reading Excel file: " +e.getMessage());
            return false;
        }

        return true;
    }
}
