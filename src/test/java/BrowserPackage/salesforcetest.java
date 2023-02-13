package BrowserPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesforcetest {

	public static void logincorrect() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		
		driver.findElement(By.id("Login")).click();
		
		System.out.println("Sales force home page is opened");
		
		driver.close();
		
		
		
	}
	
	public static void loginwrong() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
	WebElement password_ele = 	driver.findElement(By.id("password"));
	String password_value = password_ele.getAttribute("value");
	
	if(password_value.isEmpty()) {
		
		System.out.println("password box is empty");
		
		
	}
	
	driver.findElement(By.id("Login")).click();
	
    WebElement error_msg = 	driver.findElement(By.id("error"));
   System.out.println(error_msg.getText());

    driver.close();

		
	}
	
	public static void remberbox() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		
		driver.findElement(By.name("rememberUn")).click();
		
		System.out.println("Remember checkbox is clicked");
		
		driver.findElement(By.id("Login")).click();
		System.out.println("Login button is clicked");
		
		driver.close();
		

	}
	
	
	
	public static void returnfromhome() throws InterruptedException {
		
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
		
		System.out.println("Sales force ome page is dispalyed");
		
		driver.findElement(By.id("userNavLabel")).click();
		
		System.out.println("profile tab is clicked");
		
		driver.findElement(By.id("userNavMenu"));
		
	
		WebElement logout  = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		
		logout.click();
		
		System.out.println("Logout button is clicked");
		
		driver.get("https://ertg-dev-ed.develop.my.salesforce.com/");
		
		
	    WebElement user_id =  	driver.findElement(By.xpath("//*[@id=\"idcard-identity\"]"));
	
		System.out.println(user_id);
		
	     if(user_id.getText().equalsIgnoreCase(username)) {
		
		System.out.println("Username is same");
		
	
	}
	driver.close();
	
	
	}
	
	public static void forgotpassword() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		driver.get("https://ertg-dev-ed.develop.my.salesforce.com/secur/forgotpassword.jsp?locale=us");
		
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("learningtest2023@gmail.com");
		driver.findElement(By.id("continue")).click();
		
	WebElement message = 	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]"));
		System.out.println(message.getText());
		
		
		
	}
	public static void wrong_details() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learning");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("seleni");
		driver.findElement(By.id("Login")).click();
		
		WebElement error_msg = 	driver.findElement(By.id("error"));
		System.out.println(error_msg.getText());
		
		driver.close();
		
		
	}
	
	
	public static void usermenu() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("userNavLabel")).click();
	List<WebElement> details = 	driver.findElements(By.id("userNavMenu"));
	
	for(WebElement e:details) {
		
		System.out.println(e.getText());
		

	}

	driver.close();
	
	
	}
	public static void myprofile() throws InterruptedException {
		
		
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
		//profile details
		driver.findElement(By.id("userNavLabel")).click();
		
		driver.findElement(By.id("userNavMenu"));
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
	String url = 	driver.getCurrentUrl();
		
		driver.get(url);
		
		//contact details
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[2]/div[2]/div[1]/h3/div/div/a/img")).click();
		
	driver.switchTo().frame("contactInfoContentId")	;
	//	driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]"));
		
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
	WebElement lastname = 	driver.findElement(By.id("lastName"));
	lastname.clear();
	lastname.sendKeys("update");
	
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/input[1]")).click();
	
	String updated_name = driver.getTitle();
	System.out.println(updated_name);
	
	driver.close();
	

	}
	
	
	public static void posttext() throws InterruptedException {
		JavascriptExecutor js;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		js = (JavascriptExecutor) driver;
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		//profile details
		driver.findElement(By.id("userNavLabel")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("userNavMenu"));
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
        String url = driver.getCurrentUrl();
         
        Thread.sleep(10000);
        
       

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        // 6 | selectFrame | index=2 | 
        driver.switchTo().frame(0);
        // 7 | mouseDown | css=.chatterPublisherRTE | 
        {
          WebElement element = driver.findElement(By.cssSelector("html"));
          Actions builder = new Actions(driver);
         // builder.moveToElement(element).clickAndHold().perform();
          builder.moveToElement(element).click().build().perform();
        }
        // 8 | mouseUp | css=p | 
        {
          WebElement element = driver.findElement(By.cssSelector("p"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).release().perform();
        }
        // 9 | click | css=.chatterPublisherRTE | 
        driver.findElement(By.cssSelector(".chatterPublisherRTE")).click();
        // 10 | editContent | css=.chatterPublisherRTE | <p>test data</p>
        {
          WebElement element = driver.findElement(By.cssSelector(".chatterPublisherRTE"));
          js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '<p>test data</p>'}", element);
        }
        // 11 | selectFrame | relative=parent | 
        driver.switchTo().defaultContent();
        // 12 | click | id=publishersharebutton | 
        driver.findElement(By.id("publishersharebutton")).click();
        // 13 | click | id=userNavLabel | 

     driver.close();
     
     
	}
	
	
	public static void fileupload() throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		//profile details
		driver.findElement(By.id("userNavLabel")).click();
		
		driver.findElement(By.id("userNavMenu"));
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
        String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.get(url);
		
		WebElement feed = driver.findElement(By.linkText("Feed"));
	     
	     Actions action = new Actions(driver);
	     action.moveToElement(feed).build().perform();
	     feed.click();
		
	 
		
		
	WebElement file_upload = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[1]/ul/li[2]/a"
			));
	
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("#publisherAttachContentPost")).click();
	
    
	Thread.sleep(1000);
	
     driver.findElement(By.cssSelector("#chatterUploadFileAction")).click();
	
     Thread.sleep(1000);
     
     WebElement browse=driver.findElement(By.xpath("//input[@id='chatterFile']"));
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		
		executor.executeScript("document.getElementById('chatterFile').click();");
		
		StringSelection stringSelection = new StringSelection("/Users/sureshreddy/Desktop/Haritha_work/java_practice/SeleniumMaven/NewData.xlsx/NewData.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
		
		
  
    driver.close();
    
	}
	
	public static void photoupload() throws InterruptedException, AWTException {
		
		JavascriptExecutor js;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		js = (JavascriptExecutor) driver;
		
		driver.get("https://login.salesforce.com/");
		
		String username = "learningtest2023@gmail.com";
		
		driver.findElement(By.id("username")).sendKeys("learningtest2023@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password")).sendKeys("selenium2023");
		driver.findElement(By.name("rememberUn")).click();
		
		
		driver.findElement(By.id("Login")).click();
		//profile details
		driver.findElement(By.id("userNavLabel")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("userNavMenu"));
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
        String url = driver.getCurrentUrl();
         
        Thread.sleep(1000);
        
        //add photo link
        
        
        WebElement photo_link = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[2]/div[1]/div/a"));
        
        Actions action = new Actions(driver);
        action.moveToElement(photo_link).build().perform();
        photo_link.click();
        Thread.sleep(5000);
        
       driver.switchTo().frame(2);
     
       driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile")).sendKeys("/Users/sureshreddy/Desktop/Haritha_work/java_practice/SeleniumMaven/photos/F.jpeg");
       driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn")).click();
       Thread.sleep(10000);
       
       
     driver.findElement(By.id("j_id0:j_id7:save")).click();
       driver.switchTo().defaultContent();
       
  	  System.out.println("photo is uploaded");
  	  
  	  driver.close();
  	  
		
	}
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		loginwrong();
	
		logincorrect();
	
		remberbox();
		returnfromhome();
		forgotpassword();
		wrong_details();
		usermenu();
		myprofile();
		posttext();
		fileupload();
	  photoupload();
	
		

	}

}
