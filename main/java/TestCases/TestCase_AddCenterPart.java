package TestCases;

import org.testng.annotations.Test;

import Package.element_Highlight;
import Package.DataProviders;
import PageObject.PageObgectLogin;
import PageObject.PageObject_DefinitionCenterParts;
import PageObject.PageObject_Landing;
import PageObject.PageObject_MainMenu;
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

public class TestCase_AddCenterPart {
      WebDriver driver;
      
      
  @Test(dataProvider="AddCenterPart",dataProviderClass=DataProviders.class)
  public void f(String URL ,String UserName ,String Password, String CenterPartName, String CenterPartCode,String CenterPartName2, String CenterPartCode2,String NewName ,String NewCode ) throws Throwable {
	 
	  driver.navigate().to(URL);
	  driver.manage().window().maximize();


	  
	  //Login
	  PageObgectLogin admLoginPage = 
				PageFactory.initElements(driver, PageObgectLogin.class);
		admLoginPage.login(driver, URL ,UserName , Password);
		
		//Landing
		PageObject_Landing Icon = PageFactory.initElements(driver, PageObject_Landing.class);
		Icon.GV_Icon(driver);
		  driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);  

		
		  	  System.out.println(driver.getCurrentUrl());
	  for(String window : driver.getWindowHandles() ) {
		  driver.switchTo().window(window);
	  }
	  //Enter to DefinitionCenterParts Page
	  PageObject_MainMenu publice=PageFactory.initElements(driver, PageObject_MainMenu.class);
	  publice.DefinitionCenterParts_Icon(driver);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  

	  //AddCenterPart
	  PageObject_DefinitionCenterParts Add=PageFactory.initElements(driver, PageObject_DefinitionCenterParts.class);
	  Add.AddCenterParts(driver, CenterPartName, CenterPartCode ,CenterPartName2, CenterPartCode2);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  

	  

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
