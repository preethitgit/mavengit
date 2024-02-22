package org.info;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		//File path
		File f=new File("F:\\Preethi\\Workspace\\Maven\\DataDriven\\DataDriven.xlsx");
		//To Read file
		FileInputStream finput=new FileInputStream(f);
		//Workbook Instanciation
		Workbook w=new XSSFWorkbook(finput);
		//To get a sheet
		Sheet s1 = w.getSheet("Sheet1");
		//To get a particular row - excel starts from 0th index row 0
		Row r1 = s1.getRow(0);
		
		//To get a particular Column- 2nd column 1st index
		Cell c1 = r1.getCell(1);
		
		System.out.println(c1);
		
	}
}
