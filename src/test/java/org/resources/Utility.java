package org.resources;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Utility {

	public static WebDriver driver;
	
	public static void launchChrome() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\div\\chromedriver.exe");
		 driver=new ChromeDriver();
       driver.manage().window().maximize();
	}
	public static void launchApp(String s){
		driver.get(s);
	}
	public static void kill() {
	driver.quit();
	}
	public static void fill(WebElement w,String s) {
		w.sendKeys(s);

	}
	public static void tap(WebElement w){
		w.click();
	}
	public static void generateJvmReport(String Json) {
		
		File f=new File("C:\\jva\\CucumberClient\\jvm-report");
		Configuration con=new Configuration(f,"Cucumber Execution report");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("OS", "Windows");
		con.addClassifications("BrowserVersion", "90.01");
		con.addClassifications("Sprint", "1");
		con.addClassifications("Engineer", "Kalidass");
		
		List<String> li=new ArrayList<String>();
		li.add(Json);
		ReportBuilder rb=new ReportBuilder(li,con); 
		rb.generateReports();
		
		
	}
	
	
}
