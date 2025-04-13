package E01_Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		textbox.sendKeys("VIT");
		System.out.println("Searched VIT - success");
		
		WebElement emailbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt99\"]"));
		emailbox.sendKeys("test@gmail.com");
		
		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		appendbox.sendKeys("Vellore");
		
		WebElement retrievetext = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		String value = retrievetext.getAttribute("value");
		System.out.println(value);
		
		WebElement clearbox= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
		clearbox.clear();
		
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		boolean isenabled = disabledbox.isEnabled();
		System.out.println(isenabled);
		
		System.out.println("Completed");
		driver.close();

	}

}
