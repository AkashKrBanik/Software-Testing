package E06_alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_confirmation_alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		WebElement confirmBox = driver.findElement(By.id("confirmexample"));
		confirmBox.click();
		Thread.sleep(5000);
		
		Alert confirmAlert = driver.switchTo().alert();  // Shifts focus to the alert-popup-box
		confirmAlert.accept();  // clicks OK on confirmbox
		
		// Page scroll-down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
	}

}
