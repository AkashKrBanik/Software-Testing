package E06_alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_simple_alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		WebElement alertBox = driver.findElement(By.id("alertexamples"));
		alertBox.click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();  // Shifts focus to the alert-popup-box
		alert.accept();   // Clicks OK on alertbox
		driver.close();
		
	}

}

// accept()--OK 	dismiss()--cancel	switchTo()	getText()	sendKeys()--write in laert
