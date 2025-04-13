package E01_Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("VIT"+Keys.ENTER);
		System.out.println("Searched VIT -success");
		driver.quit();

	}

}
