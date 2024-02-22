package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DdUpdatedata {
	public static void main(String[] args) throws IOException {
		File f = new File("F:\\Preethi\\Workspace\\Maven\\DataDriven\\Write.xlsx");
		FileInputStream fin=new FileInputStream(f);
     Workbook w=new XSSFWorkbook();
     Sheet sh = w.createSheet("new");
     Row r = sh.getRow(0);
     Cell c = r.getCell(1);
     String s = c.getStringCellValue();
     if (s.equals("java")) {
    	 c.setCellValue("jira");
	}
     else {
		c.setCellValue("jenkins");
	}
     FileOutputStream fos=new FileOutputStream(f);
     w.write(fos);
     
	}
}
