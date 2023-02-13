package BrowserPackage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import java.time.LocalDateTime; 

import io.github.bonigarcia.wdm.WebDriverManager;

public class merge_account {

	public static void mergeaccount() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		
		
		WebElement account_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/nav/ul/li[6]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(account_tab).build().perform();
		account_tab.click();
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		
		Thread.sleep(10000);
		WebElement merge = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
		
		action.moveToElement(merge).build().perform();
		merge.click();
		
		driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/input[1]")).sendKeys("uni");
		WebElement find_account = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/input[2]"));
		action.moveToElement(find_account).build().perform();
		find_account.click();
		
		//check box
		
		driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[4]/div/div[1]/div/div[2]/table/tbody/tr[1]/th[1]"));
		
		
		driver.findElement(By.cssSelector("#cid0")).click();
		driver.findElement(By.cssSelector("#cid1")).click();
		driver.findElement(By.cssSelector("#cid2")).click();
	
		//next button click
	
		WebElement next_btn = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[5]/div/input[1]"));
		action.moveToElement(next_btn).build().perform();
		next_btn.click();
		
		//merge account
		
		WebElement merge_btn = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[1]/div/input[2]"));
		action.moveToElement(merge_btn).build().perform();
		merge_btn.click();
		
		 Alert alert1_msg = driver.switchTo().alert(); // switch to alert
	      //driver.switchTo().alert().sendKeys("Text");
	      
	      alert1_msg.accept();

		driver.close();
		
	}
	
	public static void reports() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		
		
		WebElement account_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/nav/ul/li[6]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(account_tab).build().perform();
		account_tab.click();
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		
		Thread.sleep(10000);
		
        WebElement reports = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
		
		
		action.moveToElement(reports).build().perform();
		reports.click();
		
	WebElement new_form = 	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/div/div/form/div/div[1]/input"));
		
	action.moveToElement(new_form).build().perform();
	new_form.click();

     Thread.sleep(1000);
     WebElement create_date = driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
     
     action.moveToElement(create_date).build().perform();
     create_date.click();
	
     
     //to date
     WebElement date_format = driver.findElement(By.xpath("//input[@id='ext-comp-1042']"));
     
     action.moveToElement(date_format).build().perform();
     date_format.clear();
     
     date_format.sendKeys("2/5/2023");
     //from
     
    WebElement date_from = driver.findElement(By.xpath("//input[@id='ext-comp-1045']"));
     date_from.clear();
     
     action.moveToElement(date_format).build().perform();
     date_from.sendKeys("2/5/2023");
     
     
     WebElement save_btn = 	driver.findElement(By.xpath("//button[@id='ext-gen49']"));
		
 	action.moveToElement(save_btn).build().perform();
 	save_btn.click();
 	
 	//report_name
 	WebElement report_name = 	driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
	
 	action.moveToElement(report_name).build().perform();
 	report_name.clear();
 	report_name.sendKeys("testreport11");
 	//report_unique_name
 	
WebElement report_name_un = 	driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
	
 	action.moveToElement(report_name_un).build().perform();
 	report_name_un.clear();
 	report_name_un.sendKeys("testreport11");
 	//run 
 	
 	Thread.sleep(1000);
 	
 	WebElement run_btn = 	driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']"));
	
 	action.moveToElement(run_btn).build().perform();
 	run_btn.click();
 	
 String title =    driver.getTitle();
    System.out.println(title);
     driver.close();
     
 	
	}
	public static void main(String[] args) throws InterruptedException {
		mergeaccount();
		reports();
		
		

	}

}
