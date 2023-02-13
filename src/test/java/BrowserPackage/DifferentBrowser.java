package BrowserPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://google.com/");
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(70000, TimeUnit.MILLISECONDS);
		
		
		/*List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		
		for(WebElement link:alllinks) {
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
			
		}*/
		 
		 //Thread.sleep (50000);
	 driver.get("https://mail.google.com/mail/?tab=rm&amp;ogbl") 	;
	 
	WebElement gmail_link = driver.findElement(By.linkText("Gmail"));
	gmail_link.click();
	
	
	
	 
	 
	  
		
		//Actions action=new Actions(driver);
		//action.keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
	  
       
		/*Actions actions = new Actions(driver); 
		actions.keyDown(Keys.LEFT_CONTROL) 
		       .click(alert) 
		       .keyUp(Keys.LEFT_CONTROL) 
		       .build() 
		       .perform(); */
		//<a class="gb_n" data-pid="23" href="https://mail.google.com/mail/?tab=rm&amp;ogbl" target="_top">Gmail</a>
	
		
		 //driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");  
		// driver.findElement(By.id("input")).sendKeys("javatpoint tutorials");
		//driver.findElement(By.name("btnK")).submit();
		
		//driver.navigate().to("https://facebook.com/");
		
		//driver.wait(5);
		//FluentWait wait = new FluentWait(driver);
		//wait.withTimeout(10000, TimeUnit.MILLISECONDS);
		
		 //driver.navigate().back();
		 
		 //wait.withTimeout(10000, TimeUnit.MILLISECONDS);
		// driver.wait();
		
		 
 //driver.close();
 
		

	}

}

//interview:Syncorize issues,timeout times ,... --->will go with waits 

