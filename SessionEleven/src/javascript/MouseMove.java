package javascript;


		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class MouseMove {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
				WebDriver santhuDriver=null;
				santhuDriver = new ChromeDriver();
				santhuDriver.manage().window().maximize();
				santhuDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				getTextExample(santhuDriver);
			}
			
			private static void getTextExample(WebDriver driver) {
				String url = "https://www.americangolf.co.uk/";
				// url = "http://amazon.co.uk";
				driver.get(url);
				Actions act = new Actions(driver);
				try {
					WebElement menuItem = driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[2]/a"));
					act.moveToElement(menuItem).build().perform();
					WebDriverWait wait = new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[2]/ul/li[2]/a"))));
					driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[2]/ul/li[2]/a")).click();
				
					
					
					
					
					//<p>Drag me around</p>
					//</div>))
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					driver.quit();
				}
			}	
	}


