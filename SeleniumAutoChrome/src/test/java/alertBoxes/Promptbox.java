package alertBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Promptbox {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		prompt();
		Thread.sleep(3000);
		driver.quit();
	}

	public static void prompt() throws InterruptedException {
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Kumar Single");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText());

	}
}
