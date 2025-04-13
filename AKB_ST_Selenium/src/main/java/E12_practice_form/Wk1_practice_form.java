package E12_practice_form;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;


public class Wk1_practice_form {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement userText= driver.findElement(By.name("username"));
		userText.sendKeys("Admin");
		WebElement passText= driver.findElement(By.name("password"));
		passText.sendKeys("admin123");
		
		WebElement loginButton= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		WebElement myInfo= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a"));
		myInfo.click();
		
		WebElement empFirstName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input"));
		empFirstName.sendKeys(Keys.CONTROL+"A");
		empFirstName.sendKeys(Keys.DELETE);
		empFirstName.sendKeys("Micheal");
		
		WebElement empMiddleName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input"));
		empMiddleName.sendKeys(Keys.CONTROL+"A");
		empMiddleName.sendKeys(Keys.DELETE);
		empMiddleName.sendKeys("B.");
		
		WebElement empLastName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input"));
		empLastName.sendKeys(Keys.CONTROL+"A");
		empLastName.sendKeys(Keys.DELETE);
		empLastName.sendKeys("Jordan");
		
		WebElement empID= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		empID.sendKeys(Keys.CONTROL+"A");
		empID.sendKeys(Keys.DELETE);
		empID.sendKeys("0014");
		
		WebElement altEmpID= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
		altEmpID.sendKeys(Keys.CONTROL+"A");
		altEmpID.sendKeys(Keys.DELETE);
		altEmpID.sendKeys("0196");
		
		WebElement empDriverNo= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
		empDriverNo.sendKeys(Keys.CONTROL+"A");
		empDriverNo.sendKeys(Keys.DELETE);
		empDriverNo.sendKeys("7953406793");
		
		WebElement empLicenceExpire= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
		empLicenceExpire.sendKeys(Keys.CONTROL+"A");
		empLicenceExpire.sendKeys(Keys.DELETE);
		empLicenceExpire.sendKeys("2035-06-25");
		
		WebElement dob= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input"));
		dob.sendKeys(Keys.CONTROL+"A");
		dob.sendKeys(Keys.DELETE);
		dob.sendKeys("2003-21-07");
		
		WebElement empGender= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span"));
		empGender.click();
		WebElement save1= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"));
		save1.click();
		
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement testFeild= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input"));
		testFeild.sendKeys("2611");
		WebElement save2= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button"));
		save2.click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div")).click();
		try {
			Thread.sleep(Duration.ofSeconds(1));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Robot robot = new Robot(); 
			String file = "C:\\Users\\akash\\Downloads\\sample.txt";
			StringSelection selection = new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(Duration.ofSeconds(10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[2]")).click();
		
		System.out.print("Completed");
		driver.quit();
		}

}

