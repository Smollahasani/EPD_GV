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


public class PageObject_license {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String licenseName;
  String searchlicense;

  @FindBy(xpath="//mat-select[@name='parentId']")
   WebElement MainGroupServices;

   @FindBy(xpath="//mat-select[@name='groupId']")
   WebElement UnderGroupServices;

   @FindBy(xpath="//mat-select[@name='showDeactives']")
   WebElement Activ_DeActiv;
   
   @FindBy(xpath="//button[@type='submit']")
   WebElement SearchButton;
   
   @FindBy(xpath="//img[@alt='refresh']")
   WebElement  Refresh;
   

   @FindBy(xpath="//button[@mattooltip='ذخیره']")
   WebElement Save;
 
   
   @FindBy(xpath="(//mat-select[@role='combobox'])[4]")
   WebElement NumberPerPage;
  

   
   

   public void ****( WebDriver driver ) throws InterruptedException {
	   Actions action = new Actions(driver);

}
}