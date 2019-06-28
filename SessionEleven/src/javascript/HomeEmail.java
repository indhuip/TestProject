package javascript;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeEmail {

	public static void main(String[] args) {
		//String Url = "https://portfolio.rediff.com/portfolio-login";
		WebDriver driver = new FirefoxDriver();
		driver.get("https://portfolio.rediff.com/portfolio-login");
		//driver.findElement(By.id("useremail")).sendKeys("123456");
		//driver.findElement(By.id("useremail")).sendKeys("indu");
		//driver.findElement(By.id("useremail")).sendKeys("");
		//driver.findElement(By.id("useremail")).sendKeys("abcdefghijklmnopqrstuvwxyz");
		//driver.findElement(By.id("useremail")).sendKeys("indira.yannam@~@###");
		//driver.findElement(By.id("useremail")).sendKeys("indira.yannam");
		driver.findElement(By.id("useremail")).sendKeys("indira.yannam@gmail.com");
		driver.findElement(By.id("emailsubmit")).click();
		driver.findElement(By.id("loginsubmit")).click();
		
		driver.quit();		

}
}


