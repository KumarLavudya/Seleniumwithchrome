package htmlControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//input[@data-testid=\"royal_email\"]"));
		
		if (userName.isDisplayed()) {
			if (userName.isEnabled()) {
				userName.sendKeys("lavudyakumar001@gmail.com");
			} else
				System.out.println("Textbox not Enabled");
		} else
			System.out.println("Textbox not Displayed");
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		if (password.isDisplayed()) {
			if (password.isEnabled()) {
				password.sendKeys("9553059928bhadakav");
			} else
				System.out.println("password not enabled");

		} else
			System.out.println("Password not displayed");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
	}

}
