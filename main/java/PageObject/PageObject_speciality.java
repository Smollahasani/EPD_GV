package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Package.element_Highlight;


public class PageObject_speciality {

  element_Highlight eh= new element_Highlight();

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-speciality-type/div/mat-card/mat-card-content/div[1]/div/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select")
   WebElement Active_Diactive;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-speciality-type/div/mat-card/mat-card-content/div[1]/div/form/div/div[5]/button[1]")
   WebElement Search;

   @FindBy(xpath="/html/body/app-root/div/app-layout/div/div/div[2]/div/div[2]/his-home/div/div/div/div/nav/div/div[1]/a/span")
   WebElement CIS;
   
//اضافه کردن تخصص
   public void AddSpeciality( WebDriver driver) throws InterruptedException {
	   
	   Actions action = new Actions(driver);

	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,CIS);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   action.sendKeys(Keys.UP).perform();
	   action.sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(Search).perform();
	   

	   
	   
   }
   public void GV_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,GV);
	   Thread.sleep(1000);
	   GV.click();
	   Thread.sleep(10000);

	   
	   
   }

   
	   
 }
