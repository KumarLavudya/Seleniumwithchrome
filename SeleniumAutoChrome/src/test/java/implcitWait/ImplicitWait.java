package implcitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.findElement(By.id("btn1")).click();

		driver.findElement(By.id("txt1")).sendKeys("Kumar Single");

	}

}
