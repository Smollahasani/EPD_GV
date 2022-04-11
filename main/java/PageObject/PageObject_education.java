package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Package.element_Highlight;


public class PageObject_education {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String EducationName;
  String searchEducationName;



   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-education/div/mat-card/mat-card-content/div[1]/div/form/div/div[4]/button[1]")
   WebElement SearchButtom;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-education/div/mat-card/mat-card-content/div[1]/div/form/div/div[1]/mat-form-field/div/div[1]/div/input")
   WebElement SearchName;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-education/div/mat-card/mat-card-content/div[1]/div/form/div/div[3]/mat-form-field/div/div[1]/div/input")
   WebElement SearchCode;
      
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-education/div/mat-card/mat-card-content/div[1]/div/form/div/div[4]/button[2]")
   WebElement Refresh;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-education/div/mat-card/mat-card-content/div[2]/table/tbody/tr[1]/td[1]")
   WebElement FirstCodetd;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-education/div/mat-card/mat-card-content/div[2]/table/tbody/tr[6]/td[1]")
   WebElement NameEducation6th;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-education/div/mat-card/mat-card-content/div[2]/table/tbody/tr[2]/td[1]")
   WebElement NameEducation2th;

   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-speciality-type/div/mat-card/mat-card-content/div[2]/table/tbody/tr/td[2]")
   WebElement FirstNametd;

   
 //سرچ نام تحصیلات
   public void SearchEducationName ( WebDriver driver ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
//سرچ مورد ششم لیست
	   EducationName=NameEducation6th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(EducationName)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(1000);
	   searchEducationName=FirstNametd.getText();
	   Assert.assertEquals(EducationName, searchEducationName);
	   action.click(Refresh).perform();
	 //سرچ مورد دوم لیست
	   EducationName=NameEducation2th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(EducationName)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(1000);
	   searchEducationName=FirstNametd.getText();
	   Assert.assertEquals(EducationName, searchEducationName);
	   action.click(Refresh).perform();
   }   
 }
