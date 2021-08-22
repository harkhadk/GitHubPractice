package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
	
	public static void main(String[] args) {
		launchChrome();
		loginTest();
		tearDown ();
		
		launchChrome();
		negetiveloginTest();
		tearDown ();
		
						
	}
public static void launchChrome() {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\haris\\April2021_selenium\\crm\\drivers\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.techfios.com/billing/?ng=admin/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public static void loginTest() {
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();
}
public static void negetiveloginTest() {
	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc1234");
	driver.findElement(By.name("login")).click();
}
public static void tearDown () {
	driver.close();
}
}
