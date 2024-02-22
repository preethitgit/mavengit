package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivengetallrowcell {

	public static void main(String[] args) throws IOException {
		
		//File path
		File f=new File("F:\\Preethi\\Workspace\\Maven\\DataDriven\\DataDriven.xlsx");
		//To Read file
		FileInputStream finput=new FileInputStream(f);
		//Workbook Instanciation
		Workbook w=new XSSFWorkbook(finput);
		//To get a sheet
		Sheet s1 = w.getSheet("Sheet1");
		
		for (int i = 0; i < s1.getPhysicalNumberOfRows(); i++) {
			Row r1 = s1.getRow(i);
			for (int j = 0; j < r1.getPhysicalNumberOfCells(); j++) {
			Cell c1 = r1.getCell(j);
			System.out.println(c1);

			}

		}
		
	}
	
}
