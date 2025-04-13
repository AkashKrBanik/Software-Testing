package E07_iframe;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_iframe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// Find total no. of frames
		driver.switchTo().defaultContent();   // switch to default frame
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no. of frames: " + totalFrames.size());
		
		// Access frames
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();
		String text1 = button1.getText();
		System.out.println("Button Text: " +text1);
		
		// Access nested frames
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("Click"));
		button2.click();
		
		String text2 =  button2.getText();
		System.out.println("Button 2 Text: " +text2);
		
		driver.switchTo().defaultContent();
		Thread.sleep(Duration.ofSeconds(10));
		driver.quit();

	}

}
