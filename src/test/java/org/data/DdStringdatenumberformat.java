package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DdStringdatenumberformat {

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
			
			int cellType = c1.getCellType();//0 --Date,Number format  //1--String format
			String value=null;
			if (cellType==1) {
			 value = c1.getStringCellValue();
				
			}
			else if (DateUtil.isCellDateFormatted(c1)) {//method to choose date format --dd-mmm-yyy --- 05-Feb-2024
				Date d = c1.getDateCellValue();
				
				SimpleDateFormat sim=new SimpleDateFormat("dd-mmm-yyyy");
				value = sim.format(d);
			}
			else {
				double dd = c1.getNumericCellValue();//2.300--23000---"2300"
				
				//double size is 8, long --8
				
				long l=(long)dd;
				System.out.println(l);
				
				value = String.valueOf(l);
			}

			System.out.println(value);
			}

		}
		
	}
	
}
