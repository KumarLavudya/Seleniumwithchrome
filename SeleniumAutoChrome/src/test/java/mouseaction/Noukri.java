package mouseaction;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Noukri {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/recruit/login");
		driver.findElement(By.xpath("//li[@bind='login-container']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@fieldtype='Registered Email ID']")).sendKeys("haripriya.k@saventech.com");
		driver.findElement(By.xpath("//input[@fieldtype='Password']")).sendKeys("Priya@2022");
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(2000);
		int x=500,y=400;
		boolean bool = true;
		Robot robot = new Robot();
		while(true) {
			robot.mouseMove(x, y);
			if (bool) {
				x+=5;y=+5;
			}else {
				x+=5;y-=5;
			}
			if (y==420)bool=false;
			else if (y==380)bool=true;
			if(x==1300)x=100;
			Thread.sleep(20);
		}

	}

}
