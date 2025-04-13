package E09_drag_and_drop_action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1_drag_and_drop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement dragFrom = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]"));
		WebElement dragTo = driver.findElement(By.xpath("//*[@id=\"form:drop_header\"]"));
		
		Actions actions = new Actions(driver);
		
		// Drag element from dragFrom to dropTo
		//actions.clickAndHold(dragFrom).moveToElement(dragTo).release(dragTo).build().perform();
		
		actions.dragAndDrop(dragFrom, dragTo).build().perform();
		System.out.println("Successfully dropped.");
	}

}
