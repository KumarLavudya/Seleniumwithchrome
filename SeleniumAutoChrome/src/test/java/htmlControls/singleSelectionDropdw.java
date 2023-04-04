package htmlControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class singleSelectionDropdw {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement chkbx = driver.findElement(By.xpath("//select[@id=\"course\"]"));

		Select options = new Select(chkbx);

		List<WebElement> listOption = options.getOptions();
		for (WebElement optionsText : listOption) {
			System.out.println(optionsText.getText());
		}
		Thread.sleep(3000);

		options.selectByIndex(1);
		Thread.sleep(3000);

		options.selectByValue("net");
		Thread.sleep(3000);

		options.selectByVisibleText("Javascript");
		Thread.sleep(3000);

		String selectedText = options.getFirstSelectedOption().getText();
		System.out.println("selected text is " + selectedText);
		
		driver.close();
	}

}
