package Package;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

class MyClass {

	public static void main( String[] args ) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:/Users/DivyaSanthanam/eclipse-workspace/ssss/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://denosisqlvm16/Citrix/osicitrixWeb/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(ByLinkText.linkText("Use light version")).click();
		Thread.sleep(500);
		driver.findElement(By.id("username")).sendKeys("dsanthan");
		driver.findElement(By.id("password")).sendKeys("IBM_123456789");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("header-username")).click();
	    driver.findElement(ByXPath.xpath("(//img[@class='iconImage'])[2]")).click();
	    
		
		
		
		/*driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("/html/body/div[9]/div[1]/div[2]/div[1]/a/span")).click();
*/
	}
}
