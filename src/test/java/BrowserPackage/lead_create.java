package BrowserPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lead_create {

	
	public static void lead_details() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		///html/body/div[1]/div[1]/div/div/nav/ul/li[7]/a
		
		WebElement lead_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[7]/a"));
		Actions action = new Actions(driver);
		lead_tab.click();
		System.out.println("lead tab is opened");
		
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		
		Thread.sleep(1000);
		
	List<WebElement> lead_details = 	driver.findElements(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select"));
		
		for(WebElement e:lead_details) {
			
			System.out.println(e.getText());
	
		}
		
		
		driver.close();
		
		
	}
	
	public static void unread_leads() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		
		WebElement lead_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[7]/a"));
		Actions action = new Actions(driver);
		lead_tab.click();
		System.out.println("lead tab is opened");
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		
		
		
		Thread.sleep(1000);
		driver.findElements(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select"));
		
		Select unread = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select")));
		unread.selectByVisibleText("My Unread Leads");
		
		Thread.sleep(1000);
		
		WebElement unread_tab = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/input"));
		action.moveToElement(unread_tab).build().perform();
		
		unread_tab.click();
		
		System.out.println("reports tab is opened");
		driver.close();
		
		
		
	}
	
	
	public static void same_lead_tab() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		
		WebElement lead_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[7]/a"));
		Actions action = new Actions(driver);
		lead_tab.click();
		System.out.println("lead tab is opened");
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		
		Thread.sleep(1000);
		driver.findElements(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select"));
		WebElement go_tab = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/input"));
		action.moveToElement(go_tab).build().perform();
		
		go_tab.click();
		driver.close();
		
		
	}
	
	
	public static void todays_lead() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		
		WebElement lead_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[7]/a"));
		Actions action = new Actions(driver);
		lead_tab.click();
		System.out.println("lead tab is opened");
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		
		
		Thread.sleep(1000);
	    Select today_tab = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/select")));
	
		today_tab.selectByVisibleText("Today's Leads");
		Thread.sleep(1000);
		WebElement go_tab = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[2]/form/div/span/span[1]/input"));
		action.moveToElement(go_tab).build().perform();
		
		go_tab.click();
		System.out.println("todays reports is opened");
		driver.close();
		

	}
	
	public static void create_lead() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		
		WebElement lead_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[7]/a"));
		Actions action = new Actions(driver);
		lead_tab.click();
		System.out.println("lead tab is opened");
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		
		Thread.sleep(5000);
		
		 WebElement new_btn = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
	     action.moveToElement(new_btn).build().perform();
	     new_btn.click();
	     
	     System.out.println("new button clicked");
	     
	     driver.findElement(By.id("name_lastlea2")).sendKeys("mic");
	     
	     driver.findElement(By.id("lea3")).sendKeys("Aethna Home Products");
	     
	     
	   WebElement save_btn= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
	   action.moveToElement(save_btn).build().perform();
	   save_btn.click();
	   System.out.println("Lead is created");
	   
	   driver.close();
	   
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		lead_details();
		unread_leads();
		same_lead_tab();
		todays_lead();
		create_lead();
		

	}

}
