package E10_Tooltip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_tooltip {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		WebElement searchBox = driver.findElement(By.name("q"));
		String tooltipText = searchBox.getAttribute("title");
		System.out.println("Search Box ToolTip Text: " + tooltipText);
		System.out.println("Completed");
		driver.close();
	}

}
