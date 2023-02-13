package BrowserPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;





public class AccountTesting {
	
	public static void accountcreate() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		System.out.println("Sales force home page is displayed");
//		/html/body/div[1]/div[1]/div[1]/div/nav/ul/li[5]/a
		
		WebElement account_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/nav/ul/li[5]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(account_tab).build().perform();
		account_tab.click();
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		
		Thread.sleep(10000);
		
		
		
		WebElement scanEle =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[3]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")));
		
		action.moveToElement(scanEle).click().build().perform();
		
		
		
		//Creating account 

		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")).sendKeys("new data");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[6]/td[2]/span/select"));
		Select select =  new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[6]/td[2]/span/select")));

		select.selectByVisibleText("Technology Partner");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[7]/table/tbody/tr[1]/td[2]/span/select"));
		Select select_priority = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[7]/table/tbody/tr[1]/td[2]/span/select")));
		select_priority.selectByVisibleText("High");
		
		
	/*	WebElement save_btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[3]/table/tbody/tr/td[2]/input[1]"));
		action.moveToElement(save_btn).build().perform();
		save_btn.click();*/
		Thread.sleep(10000);
		
		
		WebElement save_btn =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[3]/table/tbody/tr/td[2]/input[1]")));
		
		action.moveToElement(save_btn).click().build().perform();
		
		driver.close();
		
		
	}

	
	public static void create_new_view() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		System.out.println("Sales force home page is displayed");
		
		
		WebElement account_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/nav/ul/li[6]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(account_tab).build().perform();
		account_tab.click();
		
		Thread.sleep(10000);
		
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[2]/a[2]")).click();
		//view name
		driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/input")).sendKeys("viewdata5");
		//view unique name
     	driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[2]/div/input")).sendKeys("viewdata5");
		//save button
		
		Thread.sleep(1000);
        WebElement save_btn =new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[3]/table/tbody/tr/td[2]/input[1]")));
		
		action.moveToElement(save_btn).click().build().perform();
		
		save_btn.click();
		
		System.out.println("View page is created");
		
		driver.close();
		
		
	}
	
	public static void view_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		
		
		WebElement account_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/nav/ul/li[5]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(account_tab).build().perform();
		account_tab.click();
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select"));
		Select select =  new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select")));
		
		select.selectByVisibleText("viewdata3");
		Thread.sleep(1000);
		
		
		 WebElement save_btn =new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/form/div[1]/div/div[1]/a[1]")));
			
			action.moveToElement(save_btn).click().build().perform();
			
		//	save_btn.click();
		
	     WebElement view_name = 	driver.findElement(By.xpath("//input[@id='fname']"));
		
		view_name.clear();
		view_name.sendKeys("changed");
		
		//field
		driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[2]/div[2]/table[2]/tbody/tr[2]/td[2]/select"));
		
		Select select_filed =  new Select(driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[2]/div[2]/table[2]/tbody/tr[2]/td[2]/select")));

		select_filed.selectByVisibleText("Account Name");
		
		
		//
		driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[2]/div[2]/table[2]/tbody/tr[2]/td[3]/select"));
		Select select_opreator =  new Select(driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[2]/div[2]/table[2]/tbody/tr[2]/td[3]/select")));

		select_opreator.selectByVisibleText("contains");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[2]/div[2]/div[2]/table[2]/tbody/tr[2]/td[4]/input")).sendKeys("a");
		
		//save button
		 WebElement save_btn1 =new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]")));
			
			action.moveToElement(save_btn1).click().build().perform();
		//save_btn1.click();
		
		
		driver.close();
		
		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		accountcreate();
		create_new_view();
		view_page();
		
		
	}

}
