package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Package.element_Highlight;


public class PageObject_MainMenu {

  element_Highlight eh= new element_Highlight();
//متغیرهای پایه
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/a/div/span[1]")
   WebElement BasicVariable;
 //تحصیلات  
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/div/app-menu-list-item[1]/a/div/span")
   WebElement Basic_Education;
//تخصص   
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/div/app-menu-list-item[2]/a/div/span")
   WebElement Basic_SpecialityType;
//بخش های استاندارد
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/div/app-menu-list-item[3]/a/div/span")
   WebElement Basic_StandardSection;
//مجوز
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/div/app-menu-list-item[4]/a/div/span")
   WebElement Basic_License;
//بیمه
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/div/app-menu-list-item[5]/a/div/span")
   WebElement Basic_Insuranse;
//متغیرهای عمومی
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[2]/a/div/span[1]")
   WebElement PublicVariables;
//تعرییف بخش های مرکز
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[2]/div/app-menu-list-item[1]/a/div/span")
   WebElement Public_DefinitionCenterParts;
//نقش
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[2]/div/app-menu-list-item[2]/a/div")
   WebElement Public_Roles;
//خدمات
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[3]/a")
   WebElement Services;
//گروه خدمات
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[3]/div/app-menu-list-item[1]/a/div/span")
   WebElement Group_Services;
//خدمت
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[3]/div/app-menu-list-item[2]/a/div")
   WebElement Services_Service;
//خدمات مراکز
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[3]/div/app-menu-list-item[3]/a/div/span")
   WebElement Services_CenterServices;
//تنظیمات مالی
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/a/div/span[1]")
   WebElement FinancialSettings;
//نام تعرفه
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[1]/a/div/span")
   WebElement Financial_Tariff;
//نام قرارداد
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[2]/a/div/span")
   WebElement Financial_Contract;
//تنظیم ریالی k تعرفه
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[3]/a/div/span")
   WebElement Financial_RialiAdjustTriff;
//تنظیم ثابت ریالی   
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[4]/a/div/span")
   WebElement Financial_FixedRialiAdjust;
//تنظیم قرارداد
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[5]/a/div/span")
   WebElement Financial_centerContract;
//تخصیص بیمه
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[6]/a/div/span")
   WebElement Financial_InsuranceAllocation;
//گلوبال رسمی مراکز
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[7]/a/div/span")
   WebElement Financial_GlobalServices;
//اضافه به گلوبال
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[8]/a/div/span")
   WebElement Financial_AddToGlobal;
//تنظیمات مالی مراکز
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[9]/a/div/span")
   WebElement Financial_CenterFinancialSettings;

//امنیت
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[5]/a/div/span[1]")
   WebElement Security;
//زیرمنوی امنیت
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[5]/div/app-menu-list-item/a/div")
   WebElement Security1;
   
   

   public void Education_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,BasicVariable);
	   Thread.sleep(1000);
	   BasicVariable.click();
	   Thread.sleep(1000);
	   Basic_Education.click();
	   Thread.sleep(1000);	
   }
   
   public void SpecialityType_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,BasicVariable);
	   Thread.sleep(1000);
	   BasicVariable.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Basic_SpecialityType);
	   Basic_SpecialityType.click();
	   Thread.sleep(1000);
   }
   public void StandardSection_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,BasicVariable);
	   Thread.sleep(1000);
	   BasicVariable.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Basic_StandardSection);
	   Basic_StandardSection.click();
	   Thread.sleep(1000);
   }
   public void License_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,BasicVariable);
	   Thread.sleep(1000);
	   BasicVariable.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Basic_License);
	   Basic_License.click();
	   Thread.sleep(1000);
   }
   public void Insuranse_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,BasicVariable);
	   Thread.sleep(1000);
	   BasicVariable.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Basic_Insuranse);
	   Basic_Insuranse.click();
	   Thread.sleep(1000);
   }
   public void DefinitionCenterParts_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,PublicVariables);
	   Thread.sleep(1000);
	   PublicVariables.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Public_DefinitionCenterParts);
	   Public_DefinitionCenterParts.click();
	   Thread.sleep(1000);
   }
   public void Roles_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,PublicVariables);
	   Thread.sleep(1000);
	   PublicVariables.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Public_Roles);
	   Public_Roles.click();
	   Thread.sleep(1000);
   }
   public void Group_Services_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Services);
	   Thread.sleep(1000);
	   Services.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Group_Services);
	   Group_Services.click();
	   Thread.sleep(1000);
   }
   public void Service_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Services);
	   Thread.sleep(1000);
	   Services.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Services_Service);
	   Services_Service.click();
	   Thread.sleep(1000);
   }
   public void CenterServices_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Services);
	   Thread.sleep(1000);
	   Services.click();
	   Thread.sleep(1000);
	   eh.highlightElement(driver,Services_CenterServices);
	   Services_CenterServices.click();
	   Thread.sleep(1000);
   }
   public void Tariff_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_Tariff.click();
	   Thread.sleep(1000);
   }
   public void Contract_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_Contract.click();
	   Thread.sleep(1000);
   }
   public void RialiAdjustTriff_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_RialiAdjustTriff.click();
	   Thread.sleep(1000);
   }
   public void FixedRialiAdjust_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_FixedRialiAdjust.click();
	   Thread.sleep(1000);
   }
   public void centerContract_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_centerContract.click();
	   Thread.sleep(1000);
   }
   public void InsuranceAllocation_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_InsuranceAllocation.click();
	   Thread.sleep(1000);
   }
   public void GlobalServices_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_GlobalServices.click();
	   Thread.sleep(1000);
   }
   public void AddToGlobal_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_AddToGlobal.click();
	   Thread.sleep(1000);
   }
   public void CenterFinancialSettings_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,FinancialSettings);
	   Thread.sleep(1000);
	   FinancialSettings.click();
	   Thread.sleep(1000);
	   Financial_CenterFinancialSettings.click();
	   Thread.sleep(1000);
   }
   public void Security_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,Security);
	   Thread.sleep(1000);
	   Security.click();
	   Thread.sleep(1000);
	   Security1.click();
	   Thread.sleep(1000);
   }



















   
	   
 }
