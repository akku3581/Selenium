package SeleniumDemo1.SeleniumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch browser
		
		driver.get("https://www.google.com/"); // enter the url
		
		System.out.println("Title ="+driver.getTitle());
		WebElement e = driver.findElement(By.xpath("//*[@name='q']"));
		e.sendKeys("Selenium");
		e.sendKeys(Keys.ENTER);
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
	}

}
