package org.info;

import java.awt.Frame;
import java.awt.KeyEventPostProcessor;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static TakesScreenshot tk;
	public static Frame f;
	//Launch browser
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Preethi\\Workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	//loadUrl
	public static void url(String url) {
		
		driver.get(url);
		
	}
	//getAttribute - to retrieve the text from text box
	public static String toAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
        return attribute;
	}
	//maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}
	//Currenturl
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	//getTitle
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	//Sendkeys
	public static void fill(WebElement element, String userText) {
		element.sendKeys(userText);
		
	}
	//ToClick
	public static void toClick(WebElement element) {
		element.click();
		
	}
	
	public static void toQuit() {
	driver.quit();

	}
	//actions
	public static void moveToElement(WebElement element) {
		a.moveToElement(element).perform();

	}
	
	public static void dragAndDrop(WebElement src, WebElement des) {
		a.dragAndDrop(src, des).perform();
		
	}
	
	
	public static void doubleClick(WebElement element) {
		a.doubleClick(element);

	}
	public static void contextClick(WebElement element) {
		a.contextClick(element);
		//key down, keyup
	}
	//robot
    public static void keyPres(WebElement element) {
		r.keyPress(element);
	}
	
	public static void keyReleas(int element) {
		r.keyRelease(element);

	}
	//alert
	public static void accept() {
		al.accept();
	}
	
	public static void dismiss() {
		al.dismiss();
	}
	
	public static void getText() {
		al.getText();

	}
	public static void sendKey(String userText) {
		al.sendKeys(userText);

	}
	
	public static String excelRead(String sheetName,int rowNo,int cellNo) throws IOException {
		//File path
				File f=new File("F:\\Preethi\\Workspace\\Maven\\DataDriven\\DataDriven.xlsx");
				//To Read file
				FileInputStream finput=new FileInputStream(f);
				//Workbook Instanciation
				Workbook w=new XSSFWorkbook(finput);
				//To get a sheet
				Sheet s1 = w.getSheet(sheetName);
				
				
					Row r1 = s1.getRow(rowNo);
					
					Cell c1 = r1.getCell(cellNo);
					
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
					return value;
					}

	
	public static void getScreenshot(String Filepath) throws IOException {
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File(Filepath);
		FileUtils.copyFile(src, des);

	}
	
	private void frame() {
	

	}
	
	
	
	
	
	
	
	
	
	
	
				
			

	}
	
	
	
	
