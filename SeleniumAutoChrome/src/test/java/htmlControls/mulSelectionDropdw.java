package htmlControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mulSelectionDropdw {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement options = driver.findElement(By.xpath("//select[@multiple='true']"));
		Thread.sleep(3000);
		
		Select mulOptions = new Select(options);
		List<WebElement> allOptions = mulOptions.getOptions();
		for (WebElement pOptions : allOptions) {
			System.out.println(pOptions.getText());
		}Thread.sleep(3000);
		
		mulOptions.selectByIndex(0);
		Thread.sleep(3000);
		
		mulOptions.selectByValue("ij");
		Thread.sleep(3000);
		
		mulOptions.selectByVisibleText("NetBeans");
		Thread.sleep(3000);
		
		mulOptions.deselectByIndex(0);
		Thread.sleep(3000);
		
		List<WebElement> selOptions = mulOptions.getAllSelectedOptions();
		for (WebElement sPrintOptions : selOptions) {
			System.out.println("selected values " + sPrintOptions.getText());
		}
		
		driver.close();
	}
}
