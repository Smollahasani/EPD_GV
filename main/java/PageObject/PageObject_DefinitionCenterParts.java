package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Package.element_Highlight;


public class PageObject_DefinitionCenterParts {

  element_Highlight eh= new element_Highlight();
  
  String PartName;
  String AddedNewPartName;
  String AddedNewPartCode;
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
   
   @FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option[6]/span")
   WebElement Group_Clinic;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[3]/mat-form-field/div/div[1]/div/input")
   WebElement Name;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[4]/mat-form-field/div/div[1]/div/input")
   WebElement Code;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[3]/table/thead/tr/th[5]/mat-checkbox/label/span[1]")
   WebElement Standardization;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[3]/table/tbody/tr/td[5]/mat-form-field/div/div[1]/div/mat-select")
   WebElement StandardizationCombo;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[3]/table/tbody/tr/td[2]")
   WebElement FirstNametd;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[3]/table/tbody/tr/td[4]")
   WebElement FirstCodetd;



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
   public void AddCenterParts( WebDriver driver ,String CenterPartName ,String CenterPartCode ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   action
	   .click(Activity)
	   .sendKeys(Keys.ENTER)
	   .click(Group)
	   .click(Group_Clinic)
	   .click(Name)
	   .sendKeys(CenterPartName)
	   .click(Code)
	   .sendKeys(CenterPartCode)
	   .click(AddButton)
	   .perform();
	  	   
   }
 //ویرلیش نام بخش
   public void EditCenterPartName ( WebDriver driver , String NewName) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   WebElement PenButton =driver.findElement(By.xpath("/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[3]/table/tbody/tr/td[6]/button"));
	   action
	   .click(PenButton)
	   .click(Name)
	   .sendKeys(Keys.CLEAR)
	   .click(Name)
	   .sendKeys(NewName)
	   .perform();
	   WebElement EditButton =driver.findElement(By.xpath("/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[5]/button[1]"));
	   EditButton.click();
	   WebElement POPUP =driver.findElement(By.xpath("/div/div[1]"));
	   String c=POPUP.getText();
       Assert.assertTrue(c.contains("موفقیت"));
	   //چک ثبت ویرایش
	   AddedNewPartName=FirstNametd.getText();
	   Assert.assertEquals(AddedNewPartName, NewName);
	   
   }   
   //ویرلیش کد بخش
   public void EditCenterPartCode ( WebDriver driver , String NewCode) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   WebElement PenButton =driver.findElement(By.xpath("/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[3]/table/tbody/tr/td[6]/button"));
	   action
	   .click(PenButton)
	   .click(Code)
	   .sendKeys(Keys.CLEAR)
	   .click(Code)
	   .sendKeys(NewCode)
	   .perform();
	   WebElement EditButton =driver.findElement(By.xpath("/html/body/app-root/div[2]/div[2]/div/div/app-definition-center-parts/div/mat-card/mat-card-content/div[1]/form/div/div[5]/button[1]"));
	   EditButton.click();
	   WebElement POPUP =driver.findElement(By.xpath("/div/div[1]"));
	   String c=POPUP.getText();
       Assert.assertTrue(c.contains("موفقیت"));
	   //چک ثبت ویرایش
	   AddedNewPartCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedNewPartName, NewCode); 
}
   //استانداردسازی  
   public void Standardization ( WebDriver driver  ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   action
	   .click(Standardization)
	   .click(StandardizationCombo)
	   .sendKeys(Keys.ENTER)
	   .perform();
	   WebElement POPUP =driver.findElement(By.xpath("/div/div[1]"));
	   String c=POPUP.getText();
       Assert.assertTrue(c.contains("موفقیت"));

	   
   }
 }
