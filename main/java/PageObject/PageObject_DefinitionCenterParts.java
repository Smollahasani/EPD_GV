package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Package.element_Highlight;


public class PageObject_DefinitionCenterParts {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String InsuranceName;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[2]/div/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
   WebElement Active_Diactive;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[2]/div/form/div/div[6]/button[1]")
   WebElement SearchButtom;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[2]/div/form/div/div[4]/mat-form-field/div/div[1]/div/input")
   WebElement SearchName;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[2]/div/form/div/div[5]/mat-form-field/div/div[1]/div/input")
   WebElement SearchCode;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[2]/div/form/div/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
   WebElement SearchActivity;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[2]/div/form/div/div[3]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
   WebElement SearchGroup;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[5]/button[1]")
   WebElement AddButton;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[1]/div/form/div/div[5]/button[2]")
   WebElement RefreshSearch;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[5]/button[2]")
   WebElement RefreshAdd;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
   WebElement Activity;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
   WebElement Group;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[3]/mat-form-field/div/div[1]/div/input")
   WebElement Name;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[4]/mat-form-field/div/div[1]/div/input")
   WebElement Code;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[3]/table/thead/tr/th[5]/mat-checkbox/label/span[1]")
   WebElement Standardization;


   PageObject_DefinitionCenterParts DeActive =new PageObject_DefinitionCenterParts();


//نمایش لیست غیر فعال
   public void showDeActivesDefinitionCenterParts( WebDriver driver ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Active_Diactive);
	   Thread.sleep(1000);
	   Active_Diactive.click();
	   eh.unhighlightLast(driver, Active_Diactive);
	   action
	   .sendKeys(Keys.UP)
	   .sendKeys(Keys.ENTER).perform();
	   Thread.sleep(1000);
	   action.click(SearchButtom).perform();
	   Thread.sleep(1000);

   }
   
//اضافه کردن بخش
   public void AddCenterParts( WebDriver driver ,String insuranceCode ,String insuranceCode2 ,String insuranceCode3 ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   
	   
   }
 //سرچ نام بخش
   public void SearchCenterParts ( WebDriver driver ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
   }   
   //غیر فعال کردن بخش
   public void DeActiveCenterParts ( WebDriver driver ,String insuranceCode ) throws InterruptedException {
	   Actions action = new Actions(driver);
   }
 }
