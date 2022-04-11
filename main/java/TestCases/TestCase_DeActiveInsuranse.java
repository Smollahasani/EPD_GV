package TestCases;

import org.testng.annotations.Test;

import Package.element_Highlight;
import Package.DataProviders;
import PageObject.PageObgectLogin;
import PageObject.PageObject_Landing;
import PageObject.PageObject_MainMenu;
import PageObject.PageObject_insuranse;
import PageObject.PageObject_license;
import PageObject.PageObject_speciality;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCase_DeActiveInsuranse {
      String nationalCode;

      
      WebDriver driver;
	element_Highlight eh= new element_Highlight();


  @Test(dataProvider="AddLicense",dataProviderClass=DataProviders.class)
  public void f(String URL ,String UserName ,String Password, String insuranseCode, String insuranseCode2 ,String insuranseCode3) throws Throwable {
	 
	  driver.navigate().to(URL);
	  driver.manage().window().maximize();


	  
	  //Login
	  PageObgectLogin admLoginPage = 
				PageFactory.initElements(driver, PageObgectLogin.class);
		admLoginPage.login(driver, URL ,UserName , Password);
		
		//Landing
		PageObject_Landing Icon = PageFactory.initElements(driver, PageObject_Landing.class);
		Icon.GV_Icon(driver);
		
		  	  System.out.println(driver.getCurrentUrl());
	  for(String window : driver.getWindowHandles() ) {
		  driver.switchTo().window(window);
	  }
	  //Enter to insuranseCode Page
	  PageObject_MainMenu basic=PageFactory.initElements(driver, PageObject_MainMenu.class);
	  basic.Insuranse_Icon(driver);
	  //DeActiveLicense
	  PageObject_insuranse DeActive=PageFactory.initElements(driver, PageObject_insuranse.class);
	  DeActive.DeActiveInsurance(driver, insuranseCode);
	  

	  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	  
	  	
  }
	   @AfterMethod
  public void afterMethod() {
	//	driver.quit();
	  
  }

}
