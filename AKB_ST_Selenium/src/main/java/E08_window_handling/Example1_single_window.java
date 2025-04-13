package E08_window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_single_window {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// Get old window handle
		String oldWindow = driver.getWindowHandle();
		System.out.println("Parent window handle: " +oldWindow);
		
		// Click new window button
		Thread.sleep(1000);
		WebElement firstbutton = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
		firstbutton.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println("There are " + handles.size() + " windows currently open");
		System.out.println("Window Handles: " +handles);
		
		for (String newwindow: handles) {
			driver.switchTo().window(newwindow);
		}
		
		Thread.sleep(1000);
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		textbox.sendKeys("mcavit@gmail.com");
		System.out.println("Completed");
		
		Thread.sleep(1000);
		driver.quit();
		

	}

}
