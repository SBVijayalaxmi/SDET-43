package Organization;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CSharp.GenericUtility.DatabaseUtility;
import com.CSharp.GenericUtility.ExcelUtility;
import com.CSharp.GenericUtility.FileUtility;
import com.CSharp.GenericUtility.JavaUtility;
import com.CSharp.GenericUtility.WebDriverUtility;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationTest {

	public static void main(String[] args) throws Throwable {
		
		DatabaseUtility dLib = new DatabaseUtility();
		ExcelUtility eLib = new ExcelUtility();
		FileUtility fLib = new FileUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		//read data from propertyfile
		String BROWSER = fLib.readDataFromPropertyFile("browser");
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		
		//get data from excel sheet
		String orgName = eLib.readDataFromExcel("Organization", 1, 1);
		
		//login to App
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//wait for page load
		wLib.waitForPageLoad(driver);
		
		
		//maximiza the window
		wLib.maximizeWindow(driver);
		
		//enter url
		driver.get(URL);
		
		//enter login credentials
		LoginPage lp = new LoginPage(driver);
		lp.loginPage(USERNAME, PASSWORD);
		
		
		
		//click on organization link
		HomePage hp = new HomePage(driver);
		hp.clickOnOrgLink();
		
		
		//click on create org button
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys(orgName+jLib.getRandomNumber());
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		

	}

}
