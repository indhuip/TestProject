package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExplicitWaitExample {

	public static void main(String[] args) {
		String Url = "https://portfolio.rediff.com/portfolio-login";
			WebDriver driver = new FirefoxDriver();
			
			// TODO Auto-generated method stub
			driver.findElement(By.id("useremail")).sendKeys("naresh.thandu@gmail.com");
			////WebElement password = driver.findElement(By.id("user-identifier-input"));
			//System.out.println(password.getAttribute("value"));
			driver.findElement(By.id("emailsubmit")).click();
			driver.findElement(By.id("userpass")).sendKeys("indhu");
			driver.findElement(By.id("loginsubmit")).click();
			
			driver.quit();
			
			
			

	}
	}


