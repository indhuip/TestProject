package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			/*	// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
					     "C:\\Selenium\\Drivers\\geckodriver.exe");
				
				WebDriver indhuDriver=null;
				indhuDriver = new FirefoxDriver();
				indhuDriver.manage().window().maximize();
				indhuDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				getTextExample(indhuDriver);
			}
			
			private static void getTextExample(WebDriver driver) {
				String url = "https://www.americangolf.co.uk/";
				// url = "http://amazon.co.uk";
				driver.get(url);
				Actions act = new Actions(driver);
				try {
					//WebElement menuItem = driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/div[1]/ul/li[2]/a"));
					WebElement menuItem = driver.findElement(By.xpath("//*[@id=id='header-navigation']/class='header-navigation-left'/class='header-navigation-logo-ctr'/class='header-navigation-logo'/class='menu-category ul-level-1'/class='menu-category u1-level-1'/class='li-level-1 newin'/class='li-level-1'/class='a-level-1"));
					act.moveToElement(menuItem).build().perform();
					WebDriverWait wait = new WebDriverWait(driver, 10);
					//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[2]/ul/li[2]/a"))));
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*@id='CLUBS_1']/class='category-groups'/class='category-group'/class='only-on-og only-on-lg category-nav-image'/class='category-group-name toggle expanded'/class='category-group-block ul-level-2 toggle-content expanded'/class='li-level-2'/class='a-level-2'/class='name"))));
					//driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[2]/ul/li[2]/a")).click();
					driver.findElement(By.xpath("//*@id='CLUBS_1']/class='category-groups'/class='category-group'/class='only-on-og only-on-lg category-nav-image'/class='category-group-name toggle expanded'/class='category-group-block ul-level-2 toggle-content expanded'/class='li-level-2'/class='a-level-2'/class='name")).click();
					
				    
					
				
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					driver.quit();
				}
			
	
				}
			}*/

		System.setProperty("webdriver.Firefox.driver",
			     "C:\\Selenium\\Drivers\\geckodriver.exe");;
		WebDriver santhuDriver=null;
		santhuDriver = new FirefoxDriver();
		santhuDriver.manage().window().maximize();
		santhuDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getTextExample(santhuDriver);
	}
	
	private static void getTextExample(WebDriver driver) {
		String url = "https://www.americangolf.co.uk/";
		// url = "http://amazon.co.uk";
		
		// //*[@id="CLUBS_1"]/ul/li[3]/ul/li/a
		
		driver.get(url);
		try {
			Actions act = new Actions(driver);
			WebElement menuItem = driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[2]/a"));
			
			act.moveToElement(menuItem).build().perform();
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a"))));
			driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			driver.quit();
		}
	}

}



	


