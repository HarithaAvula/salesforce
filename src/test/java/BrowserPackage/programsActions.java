package BrowserPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class programsActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.safaridriver().setup();
		
		//WebDriver driver = new SafariDriver();
;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(10000);
		
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		Thread.sleep(10000);
driver.findElement(By.xpath("//*[@id=\"login_div\"]/button")).click();
		
		Thread.sleep(10000);
		
		WebElement alert = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/div[1]/button"));
		
		//driver.findElement(By.partialLinkText("./alert.html"
       Actions action = new Actions(driver);
       action.moveToElement(alert).build().perform();
     //*[@id="user_div"]/div[1]/div[1]/div/a[1]
       driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/div[1]/div/a[1]")).click();
       
  
           
 //window_alert      
      WebElement window_alert =   driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/button[1]"));
      Thread.sleep(3000);
      
      action.moveToElement(window_alert).build().perform();
      window_alert.click();
      
      Alert alert_msg = driver.switchTo().alert(); // switch to alert

      String alertMessage= driver.switchTo().alert().getText(); // capture alert message

      System.out.println(alertMessage); // Print Alert Message
      Thread.sleep(5000);
      alert_msg.accept();
    
      //promot_alert
      
      WebElement promot_alert = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/button[2]"));
      
      Thread.sleep(3000);
      
      action.moveToElement(promot_alert).build().perform();
      promot_alert.click();
      
      Alert alert1_msg = driver.switchTo().alert(); // switch to alert
      driver.switchTo().alert().sendKeys("Text");
      
      alert1_msg.accept();
      
    String promot_msg=   driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/p")).getText();
     
   // /html/body/div[2]/div[2]/div[1]/p
    System.out.println(promot_msg);
  
   
    
      driver.close();
      
	}

}
