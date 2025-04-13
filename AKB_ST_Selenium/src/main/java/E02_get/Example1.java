package E02_get;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		System.out.println("Website launched successfully");
		String gettitle = driver.getTitle();
		System.out.println("Title of homepage: "+gettitle);
		
		Thread.sleep(3000);
		driver.quit();
	}
}

//Get methods:	.get()	driver.getCurrentUrl()	.getTitle()	.getPageSource()	.getText()	.getTagName()	
//
//.getCssValue()	.getAttribute()	driver.close()	driver.quit()	.getSize()
//
//WebElement element = driver.findElement(By.id("Download_Btn"))
//Dimension elementSize = element.getSize()
//syso("Height:" +elementSize.height)
//syso("Width:" +elementSize.width)

