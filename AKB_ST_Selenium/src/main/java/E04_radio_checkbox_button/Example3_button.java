package E04_radio_checkbox_button;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_button {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement button = driver.findElement(By.id("j_idt88:j_idt90"));
		Point buttonPoint = button.getLocation();   //Stores location in buttonPoint( an object of Point type)
		
		System.out.println("X coordinates: " + buttonPoint.getX());
		System.out.println("Y Coordinates: " + buttonPoint.getY());
		
		// Background color of colorButton
		WebElement colorBtn = driver.findElement(By.id("j_idt88:j_idt94"));
		System.out.println("Button background color: " + colorBtn.getCssValue("background"));
		
		// Height and width of saveButton
		WebElement saveBtn = driver.findElement(By.id("j_idt88:j_idt96"));
		System.out.println("Save Btn Height: " + saveBtn.getSize().getHeight());
		System.out.println("Save Btn Width: " + saveBtn.getSize().getWidth());
		
		driver.quit();

	}

}
