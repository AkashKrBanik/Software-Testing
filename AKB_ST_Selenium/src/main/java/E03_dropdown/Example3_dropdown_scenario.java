package E03_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3_dropdown_scenario {
	public static void main(String[] args) throws InterruptedException {
		
		String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html";
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		WebElement dropdownID = driver.findElement(By.xpath("//*[@id=\"post-body-4074800055706479627\"]/div/select"));
		
		if (dropdownID.isEnabled() && dropdownID.isDisplayed()) {
			System.out.println("Dropdown is enabled and visible");
		} else {
			System.out.println("Dropdown is not visible");
		}
		
		Select select = new Select(dropdownID);
		
		if (select.isMultiple()) {
			System.out.println("Dropdown list accepts multiple choices");
		} else {
			System.out.println("Dropdown list does not accept multiple choices");
		}
		
		
		// Call getOptions to get all options of list.
		//size() is used to get size of list -- Get Total size of list
		int listSize=select.getOptions().size();
		System.out.println("List size: "+listSize);
		select.selectByVisibleText("India");
		
		String getText = select.getFirstSelectedOption().getText();
		System.out.println("Option chosen: "+getText);
		
		// Step 8: Verify that "India" is selected
        WebElement selectedOption = select.getFirstSelectedOption();
        if (selectedOption.getText().equals("India")) {
            System.out.println("India is selected.");
        } else {
            System.out.println("India is NOT selected.");
        }
		
		Thread.sleep(2000);
		driver.close();
	}
}












