package org.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DdNewsheetcreationwrite {
	public static void main(String[] args) throws IOException {
		
		File f = new File("F:\\Preethi\\Workspace\\Maven\\DataDriven\\Write.xlsx");
     Workbook w=new XSSFWorkbook();
     Sheet sh = w.createSheet("new");
     Row r = sh.createRow(0);
     Cell c = r.createCell(1);
     c.setCellValue("Framework");
     FileOutputStream fos=new FileOutputStream(f);
     w.write(fos);
     
	}
}
