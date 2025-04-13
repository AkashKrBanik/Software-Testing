package ParallelTestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelEx4 {
	@Test
    public void openGoogle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
	
    @Test
    public void openUniversity(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vit.ac.in");
        driver.quit();
    }
    
    @Test
    public void openHRM(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("All Methods Executed!!");
        driver.quit();
    }
    
}
