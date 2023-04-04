package mouseaction;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/in/kumar-lavudya-103803216/");
		driver.manage().window().maximize();
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
