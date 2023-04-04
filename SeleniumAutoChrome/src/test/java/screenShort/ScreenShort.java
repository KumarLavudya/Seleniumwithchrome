package screenShort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShort {

	public static void main(String[] args) throws IOException, InterruptedException {
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\tech\\Downloads/ss.jpg");
		FileUtils.copyFile(source, dest);
		Thread.sleep(3000);
		driver.quit();
	}

}
