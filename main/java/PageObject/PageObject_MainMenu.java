package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Package.element_Highlight;


public class PageObject_MainMenu {

  element_Highlight eh= new element_Highlight();

   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/a/div/span[1]")
   WebElement BasicVariable;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/div/app-menu-list-item[1]/a/div/span")
   WebElement Basic_education;
   
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/div/app-menu-list-item[2]/a/div/span")
   WebElement Basic_specialityType;

   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/div/app-menu-list-item[3]/a/div/span")
   WebElement Basic_standardSection;

   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/div/app-menu-list-item[4]/a/div/span")
   WebElement Basic_license;

   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[1]/div/app-menu-list-item[5]/a/div/span")
   WebElement Basic_insuranse;
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
   WebElement Financial_Riali_Adjust_Triff;
//تنظیم ثابت ریالی   
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[4]/a/div/span")
   WebElement Financial_Fixed_Riali_Adjust;
//تنظیم قرارداد
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[5]/a/div/span")
   WebElement Financial_center_Contract;
//تخصیص بیمه
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[6]/a/div/span")
   WebElement Financial_Insurance_Allocation;
//گلوبال رسمی مراکز
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[7]/a/div/span")
   WebElement Financial_Global_Services;
//اضافه به گلوبال
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[8]/a/div/span")
   WebElement Financial_AddToGlobal;
//تنظیمات مالی مراکز
   @FindBy(xpath="/html/body/app-root/div[2]/div[1]/mat-nav-list/app-menu-list-item[4]/div/app-menu-list-item[9]/a/div/span")
   WebElement Financial_CenterFinancialSettings;


   @FindBy(xpath="")
   WebElement ;



   @FindBy(xpath="")
   WebElement GV;

   @FindBy(xpath="")
   WebElement CIS;

   public void CIS_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,CIS);
	   Thread.sleep(1000);
	   CIS.click();
	   Thread.sleep(10000);

	   
	   
   }
   public void GV_Icon( WebDriver driver) throws InterruptedException {
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   eh.highlightElement(driver,GV);
	   Thread.sleep(1000);
	   GV.click();
	   Thread.sleep(10000);

	   
	   
   }

   
	   
 }
