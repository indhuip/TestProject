package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
			     "C:\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		//(2nd option)
		//action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(6000);
		driver.quit();
		

	}		
	}


