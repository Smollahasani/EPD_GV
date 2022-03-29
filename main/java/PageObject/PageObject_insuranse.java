package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Package.element_Highlight;


public class PageObject_insuranse {

  element_Highlight eh= new element_Highlight();
  
  String AddedCode; 
  String InsuranceName;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[1]/div/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select")
   WebElement Active_Diactive;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[1]/div/form/div/div[5]/button[1]")
   WebElement SearchButtom;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[1]/div/form/div/div[2]/mat-form-field/div/div[1]/div/input")
   WebElement SearchName;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[1]/div/form/div/div[4]/mat-form-field/div/div[1]/div/input")
   WebElement SearchCode;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[2]/db-angular-tree-grid/table/tbody/tr[1]/td[5]/mat-checkbox/label/span[1]")
   WebElement checkbox;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-header/div[2]/div/button[2]/span[1]/mat-icon")
   WebElement Save;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[1]/div/form/div/div[5]/button[2]")
   WebElement Refresh;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[2]/db-angular-tree-grid/table/tbody/tr[1]/td[3]")
   WebElement FirstCodetd;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[2]/db-angular-tree-grid/table/tbody/tr[3]/td[2]/db-tree-cell/div/div")
   WebElement NameInsuranse3th;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[2]/db-angular-tree-grid/table/tbody/tr[6]/td[2]/db-tree-cell/div/div")
   WebElement NameInsuranse6th;

   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-insurance/div/mat-card/mat-card-content/div[2]/db-angular-tree-grid/table/tbody/tr/td[2]")
   WebElement FirstNametd;

   PageObject_insuranse DeActive =new PageObject_insuranse();


//نمایش لیست غیر فعال
   public void showDeActivesInsurance( WebDriver driver ) throws InterruptedException {
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
   
//اضافه کردن بیمه
   public void AddInsurance( WebDriver driver ,String insuranceCode ,String insuranceCode2 ,String insuranceCode3 ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   
//نمایش لیست غیر فعال
	   PageObject_insuranse DeActive =new PageObject_insuranse();
	   DeActive.showDeActivesInsurance(driver);
//انتخاب و ذخیره تخصص اول
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode)
	   .click(SearchButtom)
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن تخصص
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, insuranceCode);
//انتخاب و ذخیره تخصص دوم
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode2)
	   .click(SearchButtom)
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن تخصص دوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode2)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, insuranceCode2);
 //انتخاب و ذخیره تخصص سوم
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode3)
	   .click(SearchButtom)
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن تخصص سوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode3)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, insuranceCode3);   
	   
   }
 //سرچ نام تخصص
   public void SearchInsuranceName ( WebDriver driver ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	 //نمایش لیست غیرفعال
	   DeActive.showDeActivesInsurance(driver);
//سرچ مورد سوم لیست
	   InsuranceName=NameInsuranse3th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(InsuranceName)
	   .click(SearchButtom)
	   .perform();
	   Assert.assertEquals(InsuranceName, FirstNametd);
	   action.click(Refresh).perform();
	 //نمایش لیست غیرفعال
	   DeActive.showDeActivesInsurance(driver);
	 //سرچ مورد ششم لیست
	   InsuranceName=NameInsuranse6th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(InsuranceName)
	   .click(SearchButtom)
	   .perform();
	   Assert.assertEquals(InsuranceName, FirstNametd);
	   action.click(Refresh).perform();
   }   
   //غیر فعال کردن بیمه
   public void DeActiveInsurance ( WebDriver driver ,String insuranceCode ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   //سرچ تخصص مورد نظر
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode)
	   .click(SearchButtom)
	   .perform();
	   Thread.sleep(2000);
	   //غیرفعال و ذخیره کردن
	   action
	   .click(checkbox)
	   .click(Save)
	   .click(Refresh)
	   .perform();
	   //نمایش لیست غیر فعال ها
	   DeActive.showDeActivesInsurance(driver);
	   //چک غیرفعال شدن بیمه
	   action
	   .click(SearchCode)
	   .sendKeys(insuranceCode)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();   
   }
 }
