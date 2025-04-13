package E02_get;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		String getCurrentUrl = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
		
		System.out.println("Current URL of Homepage: "+getCurrentUrl);
		System.out.println("Current Page Source Code Length: "+pageSource.length());
		driver.close();

	}

}
