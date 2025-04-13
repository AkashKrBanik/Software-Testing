package E04_radio_checkbox_button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_checkbox_button {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement basicCheckBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		basicCheckBox.click();
		System.out.println("basic clicked");
		
		WebElement ajaxCheckBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91_input\"]"));
		boolean ajaxStatus = ajaxCheckBox.isSelected();
		System.out.println("AJAX Checkbox status is: " + ajaxStatus);
	}

}
