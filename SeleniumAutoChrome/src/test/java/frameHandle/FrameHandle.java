package frameHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Kumar1");
		Thread.sleep(2000);
		driver.switchTo().frame("frm1");
		Select Chbx = new Select(driver.findElement(By.id("course")));
		Chbx.selectByVisibleText("Python");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Kumar2");
		Thread.sleep(2000);
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("abc");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Kumar3");
		Thread.sleep(2000);
		driver.quit();
	}

}
