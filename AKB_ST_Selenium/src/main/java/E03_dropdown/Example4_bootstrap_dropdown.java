package E03_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_bootstrap_dropdown {
	//Bootstrap dropdown need to interact with them like regular web elements using click and findElements.
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfc.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement housingdropdown = driver.findElement(By.xpath("//*[@id=\"container-91af4cb463\"]/div/div[1]/div"));
		housingdropdown.click();
		
		WebElement refinanceoption = driver.findElement(By.xpath("//*[@id=\"productType\"]/li[4]"));
		refinanceoption.click();
		
		WebElement product = driver.findElement(By.xpath("//*[@id=\"container-91af4cb463\"]/div/div[2]/div"));
		product.click();
		
		WebElement plotoption = driver.findElement(By.xpath("//*[@id=\"productName\"]/li[2]"));
		plotoption.click();
		
		Thread.sleep(3000);
		System.out.print("Completed");
		
	}

}
