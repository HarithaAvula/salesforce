package BrowserPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opportunity_test {
	
	public static void opportunity_test() throws InterruptedException {
		
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
	//	/html/body/div[1]/div[1]/div/div/nav/ul/li[6]/a
		
		WebElement opp_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[6]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(opp_tab).build().perform();
		opp_tab.click();
		System.out.println("opportunity tab is opened");
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@id='fcf']"));
		Select opp_tab_details = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		
		
		List<WebElement> details = opp_tab_details.getOptions();
		
		
		
		for(WebElement e:details) {
			
			System.out.println(e.getText());

		}
		
		driver.close();
		
	}

	public static void opportunity_create() throws InterruptedException {
	
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
		
		WebElement opp_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[6]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(opp_tab).build().perform();
		opp_tab.click();
		System.out.println("opportunity tab is opened");
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		Thread.sleep(2000);
		
		
		WebElement new_btn = driver.findElement(By.name("new"));
		action.moveToElement(new_btn).build().perform();
		new_btn.click();
		Thread.sleep(1000);
		System.out.println("new button is clicked");
		//opp name 
		driver.findElement(By.id("opp3")).sendKeys("phone case");
		//ammount
		driver.findElement(By.id("opp7")).sendKeys("$450000");
		//date
		driver.findElement(By.id("opp9")).sendKeys("2/7/2023");
		//camping name
		
		driver.findElement(By.id("opp17")).sendKeys("DM Campaign to Top Customers - Nov 12-23, 2001");
		
		//lead source
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[6]/td[2]/span/select"));
		
		Select lead_source = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[6]/td[2]/span/select")));
		
		lead_source.selectByVisibleText("Web");
		//stage
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[4]/td[4]/div/span/select"));
        Select stage = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[3]/table/tbody/tr[4]/td[4]/div/span/select")));
		
		stage.selectByVisibleText("Prospecting");
		
		
		WebElement save_btn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
		action.moveToElement(save_btn).build().perform();
		save_btn.click();
		
		System.out.println("opportunity is created");
		
		driver.close();
		
		
	}
	
	
	public static void opportunity_pipeline() throws InterruptedException {
		
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
		
		WebElement opp_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[6]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(opp_tab).build().perform();
		opp_tab.click();
		System.out.println("opportunity tab is opened");
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		Thread.sleep(2000);
		
		WebElement pipeline = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
		action.moveToElement(pipeline).build().perform();
		pipeline.click();
		System.out.println("Opportunity pipeline is displayed");
		
		
		driver.close();
		
		
		
	}
	
	public static void opportunity_struck() throws InterruptedException {
		
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
		
		WebElement opp_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[6]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(opp_tab).build().perform();
		opp_tab.click();
		System.out.println("opportunity tab is opened");
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		Thread.sleep(2000);
		
		WebElement struck = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
		action.moveToElement(struck).build().perform();
		struck.click();
		System.out.println("Opportunity struck is displayed");
		
		
		driver.close();
		
		
		
		
	}
	
	public static void Quartily_summary() throws InterruptedException {
		
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
		
		WebElement opp_tab = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul/li[6]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(opp_tab).build().perform();
		opp_tab.click();
		System.out.println("opportunity tab is opened");
		
		Thread.sleep(10000);
		WebElement close_tab = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a"));
		action.moveToElement(close_tab).build().perform();
		close_tab.click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[1]/td/select"));
        Select interval = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[1]/td/select")));
		
		interval.selectByVisibleText("Current and Next FQ");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[2]/td/select"));
        Select include = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[2]/td/select")));
		
		include.selectByVisibleText("Open Opportunities");
		
		WebElement run_report = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/div/form/table/tbody/tr[3]/td/input"));
		action.moveToElement(run_report).build().perform();
		run_report.click();
		
		System.out.println("reports are displayed");
		driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		opportunity_test();
		opportunity_create();
		
		opportunity_pipeline();
		opportunity_struck();
		Quartily_summary();
		
		
		
		
		
		
	}

}
