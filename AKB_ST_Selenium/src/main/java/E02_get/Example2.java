package E02_get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		
		if(expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Verification is success");
			System.out.println("Home page title is: " +actualTitle);
		} else {
			System.out.println("Verification failed, Match not found");
		}
		driver.close();

	}

}
