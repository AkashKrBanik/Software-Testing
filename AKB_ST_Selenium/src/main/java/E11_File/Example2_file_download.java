package E11_File;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_file_download {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		WebElement downloadBtn = driver.findElement(By.id("j_idt93:j_idt95"));
		downloadBtn.click();
		System.out.println("File download button clicked");
		Thread.sleep(Duration.ofSeconds(1));
		
		File downloadsLocation = new File("C:\\Users\\akash\\Downloads");
		File totalFiles[] = downloadsLocation.listFiles();
		
		for (File file: totalFiles) {
			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("File downloaded successfully");
				break;
			}
		}
		Thread.sleep(Duration.ofSeconds(3));
		
		driver.close();

	}

}
