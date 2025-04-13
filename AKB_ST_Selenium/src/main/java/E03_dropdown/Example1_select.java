package E03_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Example1_select {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        // Add delay to avoid bot detection
        Thread.sleep(10000);

        WebElement dropdown1 = driver.findElement(By.id("searchDropdownBox"));
        Select dropdown = new Select(dropdown1);
        dropdown.selectByVisibleText("Books");

        // Adding delay before searching
        Thread.sleep(2000);

        // Search (Pressing Enter in search box)
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        
        // Adding delay before closing browser
        Thread.sleep(5000);
        driver.close();
    }
}
