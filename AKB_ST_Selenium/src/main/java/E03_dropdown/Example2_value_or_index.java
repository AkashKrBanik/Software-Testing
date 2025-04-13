package E03_dropdown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2_value_or_index {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		
		Select select = new Select(dropdown1);
		Thread.sleep(2000);
		select.selectByIndex(1);
		
		select.selectByVisibleText("Cypress");
		Thread.sleep(2000);
		
		List<WebElement> listOfOptions = select.getOptions();
		int size = listOfOptions.size();
		System.out.println("Number of Elements: "+size);
		dropdown1.sendKeys("Playwright");
		System.out.println("Completed");
			
		Thread.sleep(2000);
		driver.close();
		
	}

}
