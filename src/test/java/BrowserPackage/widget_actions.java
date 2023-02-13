package BrowserPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class widget_actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.safaridriver().setup();
		
		//WebDriver driver = new SafariDriver();

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
		// widget button click:
		WebElement widget_alert = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/button/i"));
		
		 Actions action = new Actions(driver);
	       action.moveToElement(widget_alert).build().perform();
	//clicking on auto complete:
	       
	   
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/a[3]")).click();
		
		//filling the box:
		
		WebElement fill_box = driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		Thread.sleep(1000);
		
		
		  action.moveToElement(fill_box).build().perform();
	      fill_box.sendKeys("u");
	      //Selecting the value
	     String value = null;
	     
	     List<WebElement> list_country =  driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']"));
	 
	     for(WebElement link:list_country) {
	    	String gettext=  link.getText();
	    	 String[] array = gettext.split("\n");
	    	 
	    	 for(int i=0;i<array.length;i++)
	    	
	    	 {
	    		 if (array[i].equalsIgnoreCase("Uganda")) {
	    		 
	    		 System.out.println(array[i]);
	    		 
	    		 value = array[i];
	
	    	 }
	 
	    	 }

	     }
	
	   fill_box.clear();
	     
	   list_country.clear();
	   
	  
	      fill_box.sendKeys(value);
	 
	   
	      
	     fill_box.click();
	      
	      //driver.close();
	      
 
	}

}
