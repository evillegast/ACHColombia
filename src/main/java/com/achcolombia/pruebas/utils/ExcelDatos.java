package com.achcolombia.pruebas.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcelDatos {

    public String obtenerDatos (String filepath, String sheetName, int rowNumber, int cellNumber) throws IOException {
        File excelFile = new File(filepath);
        FileInputStream inputStream = new FileInputStream(excelFile);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(cellNumber);
        return cell.getStringCellValue();


    }

}
