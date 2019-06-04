
		
		package javascript;

		import java.util.Iterator;
		import java.util.Set;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class popupDesktop {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
				WebDriver santhuDriver=null;
				santhuDriver = new FirefoxDriver();
				santhuDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				getTextExample(santhuDriver);
			}
			
			private static void getTextExample(WebDriver driver) {
				String url = "https://www.naukri.com/";
				// url = "http://amazon.co.uk";
				driver.get(url);
				try {
					Set<String> windowHandles = driver.getWindowHandles();
					Iterator<String> windowsIterator = windowHandles.iterator();
					// 1 : main window
					// 2 : popup-1
					// 3 : popup-2
					
					while(windowsIterator.hasNext()) {
						driver.switchTo().window(windowsIterator.next());
						
						driver.close();
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					//driver.quit();
				}
			}
	}
