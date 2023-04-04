package alertBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class confirmBox {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		confirm();
		Thread.sleep(3000);
		driver.quit();
	}

	public static void confirm() throws InterruptedException {
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
	}
}
