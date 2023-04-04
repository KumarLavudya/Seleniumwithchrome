package pageLoadTime;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTime {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(-1, TimeUnit.MILLISECONDS);  
		driver.manage().window().maximize();
		
		Instant strt = Instant.now();
		
		driver.get("https://classroom.google.com/u/0/");
		
		Instant endtm = Instant.now();
		
		Duration duration = Duration.between(strt, endtm);
		
		System.out.println(duration.toMillis());
		
		driver.quit();

	}

}
