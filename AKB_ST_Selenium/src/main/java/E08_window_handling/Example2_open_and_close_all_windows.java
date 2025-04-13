package E08_window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_open_and_close_all_windows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		// Get old window handle
		String oldWindow = driver.getWindowHandle();
		System.out.println("Parent window handle: " +oldWindow);
		
		Set<String> handles = driver.getWindowHandles();
		for (String newwindow: handles) {
			driver.switchTo().window(newwindow);
		}
		
		// Open Multiple Windows 
		Thread.sleep(1000);
		WebElement openMultiple = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
		openMultiple.click();
		
		int numOfWindows = driver.getWindowHandles().size();
		System.out.println("Number of windows opened: "+numOfWindows);
		
		Set <String> newWindowHandles = driver.getWindowHandles();
		System.out.println("All Window Handles: "+newWindowHandles);
		for(String allWindows:newWindowHandles) {
			if(!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
			}
		}
		System.out.println("Completed");
		
		Thread.sleep(1000);
		driver.quit();

	}

}
