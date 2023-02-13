package BrowserPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingTekarch {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

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
		//driver.findElement(By.tagName(login()).click();
		
		driver.findElement(By.xpath("//*[@id=\"login_div\"]/button")).click();
		
		Thread.sleep(10000);
		//Name
		
		driver.findElement(By.id("name")).sendKeys("Jhon");
		//Father Name
		Thread.sleep(10000);
		
		driver.findElement(By.id("lname")).sendKeys("Mic");
		Thread.sleep(10000);
		
		driver.findElement(By.id("postaladdress")).sendKeys("95051");
		
		driver.findElement(By.id("personaladdress")).sendKeys("pepper tree lane");
		
		//driver.findElement(By.xpath("//*[@id=\"radiobut\"]")).
		
		 List<WebElement> rdBtn_Sex = driver.findElements(By.name("gender")); // 
		    int size = rdBtn_Sex.size();
		    System.out.println("Total no of radio button :"+size);
		    for (int i=0; i< size; i++)
		    {
		        String sValue = rdBtn_Sex.get(i).getAttribute("value"); // Step 3 - 3.  Select the Radio button (female) by Value ‘Female’ 
		        System.out.println("Radio button Name "+sValue);
		        if (sValue.equalsIgnoreCase("female"))
		        {
		            rdBtn_Sex.get(i).click();

		        }
		    }
		
	driver.findElement(By.id("city"));
Select select =  new Select(driver.findElement(By.id("city")));

select.selectByVisibleText("GOA");

driver.findElement(By.id("course"));
Select select1 =  new Select(driver.findElement(By.id("course")));

select1.selectByVisibleText("MCA");
driver.findElement(By.id("district"));
Select select2 =  new Select(driver.findElement(By.id("district")));

select2.selectByVisibleText("GOA");


driver.findElement(By.id("state"));
Select select3 =  new Select(driver.findElement(By.id("state")));

select3.selectByVisibleText("GOA");

List<WebElement> selectedOptions = select.getOptions();
for(WebElement selectedOption :selectedOptions ) {
	System.out.println("State elements"+selectedOption.getText());
	
	

}

driver.findElement(By.id("pincode")).sendKeys("95050");
driver.findElement(By.id("emailid")).sendKeys("abc@gmail.com");



	
	}

}
