package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
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

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-speciality-type/div/mat-card/mat-card-co/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-content/div[1]/div/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]ntent/div[1]/div/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select")
   WebElement Active_Diactive;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-content/div[1]/div/form/div/div[5]/button[1]")
   WebElement SearchButtom;

   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-content/div[1]/div/form/div/div[2]/mat-form-field/div/div[1]/div/input")
   WebElement SearchName;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-content/div[1]/div/form/div/div[4]/mat-form-field/div/div[1]/div/input")
   WebElement SearchCode;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-content/div[2]/table/tbody/tr/td[5]/mat-checkbox/label/span[1]")
   WebElement checkbox;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-header/div[2]/div/button[2]/span[1]/mat-icon")
   WebElement Save;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-content/div[1]/div/form/div/div[5]/button[2]")
   WebElement Refresh;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-content/div[2]/table/tbody/tr/td[4]")
   WebElement FirstCodetd;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-content/div[2]/table/tbody/tr[1]/td[2]")
   WebElement Namelicense1th;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-content/div[2]/table/tbody/tr[3]/td[2]")
   WebElement Namelicense3th;

   
   @FindBy(xpath="/html/body/app-root/div[2]/div[2]/div/div/app-license/div/mat-card/mat-card-content/div[2]/table/tbody/tr/td[2]")
   WebElement FirstNametd;

   PageObject_license DeActive =new PageObject_license();


//نمایش لیست غیر فعال
   public void showDeActiveslicense( WebDriver driver ) throws InterruptedException {
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
   
//اضافه کردن مچوز
   public void Addlicense( WebDriver driver ,String licenseCode ,String licenseCode2 ,String licenseCode3 ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	   
//نمایش لیست غیر فعال
	   PageObject_license DeActive =new PageObject_license();
	   DeActive.showDeActiveslicense(driver);
//انتخاب و ذخیره مجوز اول
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode)
	   .click(SearchButtom)
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن مجوز
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, licenseCode);
//انتخاب و ذخیره مجوز دوم
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode2)
	   .click(SearchButtom)
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن مجوز دوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode2)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, licenseCode2);
 //انتخاب و ذخیره مجوز سوم
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode3)
	   .click(SearchButtom)
	   .click(checkbox)
	   .click(Save)
	   .perform();
	   Thread.sleep(2000);
	   action.click(Refresh).perform();
//چک اضافه شدن مجوز سوم	   
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode3)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();
	   Assert.assertEquals(AddedCode, licenseCode3);   
	   
   }
 //سرچ نام مجوز
   public void SearchLicenseName ( WebDriver driver ) throws InterruptedException {
	   
	   Actions action = new Actions(driver);
	 //نمایش لیست غیرفعال
	   DeActive.showDeActiveslicense(driver);
//سرچ مورد یکم لیست
	   licenseName=Namelicense1th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(licenseName)
	   .click(SearchButtom)
	   .perform();
	   Assert.assertEquals(licenseName, FirstNametd);
	   action.click(Refresh).perform();
	 //نمایش لیست غیرفعال
	   DeActive.showDeActiveslicense(driver);
	 //سرچ مورد سوم لیست
	   licenseName=Namelicense3th.getText();
	   action
	   .click(SearchName)
	   .sendKeys(licenseName)
	   .click(SearchButtom)
	   .perform();
	   Assert.assertEquals(licenseName, FirstNametd);
	   action.click(Refresh).perform();
      }   
   //غیر فعال کردن مجوز
   public void DeActiveLicense ( WebDriver driver ,String licenseCode ) throws InterruptedException {
	   Actions action = new Actions(driver);
	   //سرچ مجوز مورد نظر
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode)
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
	   DeActive.showDeActiveslicense(driver);
	   //چک غیرفعال شدن تخصص
	   action
	   .click(SearchCode)
	   .sendKeys(licenseCode)
	   .click(SearchButtom)
	   .perform();
	   AddedCode=FirstCodetd.getText();   
   }

 }