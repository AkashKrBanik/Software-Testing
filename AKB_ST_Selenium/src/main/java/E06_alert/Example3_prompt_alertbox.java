package E06_alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_prompt_alertbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		WebElement promptBox = driver.findElement(By.id("promptexample"));
		promptBox.click();
		Thread.sleep(5000);
		
		Alert promptAlert = driver.switchTo().alert(); // Shifts focus to the alert-popup-box
		Thread.sleep(3000);  
		promptAlert.sendKeys("HELLO");
		promptAlert.accept();  // clicks OK on confirmbox
		Thread.sleep(3000);  
		
		// Page scroll-down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");

	}

}
