package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
	private static WebDriver driver;

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		ex();
		
	}
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px light green; background:red')",
				element);
	}
	
	public static void ch1(){
		driver.get("https://www.w3schools.com/");
		highlight(driver, driver.findElement(By.xpath("//a[@onclick='gSearch(this)']")));
		
	}
	public static void ex() {
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		highlight(driver, driver.findElement(By.id("output")));}
	
	public static void ch2() throws InterruptedException {
		driver.get("https://www.facebook.com/login/");
		//highlight (driver, driver.findElement(By.xpath("//button[@value = '1']")));
		//highlight (driver, driver.findElement(By.xpath("//input[@autocomplete = 'current-password']")));
		highlight(driver, driver.findElement(By.xpath("//input[@data-testid=\'royal_email\']")));
		Thread.sleep(5000);
		driver.close();
	}
	
}
