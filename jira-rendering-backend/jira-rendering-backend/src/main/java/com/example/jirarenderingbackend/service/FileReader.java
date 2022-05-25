package com.example.jirarenderingbackend.service;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileReader {

    public void printContentOfExcel(MultipartFile file) {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
            XSSFSheet sheet = workbook.getSheetAt(0);

            for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
                XSSFRow row = sheet.getRow(i);
                int numCells = row.getPhysicalNumberOfCells();
                System.out.print("Row " + i + ": ");
                for(int j=0;j<numCells;j++) {
                    System.out.print(row.getCell(j));
                    if (j!=numCells-1) {
                        System.out.print(", ");
                    } else {
                        System.out.print("\n");
                    }
                }

            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
