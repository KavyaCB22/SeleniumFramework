import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Kavya C B/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		
			
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.cssSelector("div[class='login-btn'")).click();
		driver.findElement(By.xpath("//*[@id='user_name']")).sendKeys("Kavya");
		
		//get broken links in a webpage
		
				List<WebElement> links = driver.findElements(By.tagName("a"));
				
				System.out.println(links.size());
		
		

	}

}
