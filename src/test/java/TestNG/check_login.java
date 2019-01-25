package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class check_login {
	WebDriver driver;
	@BeforeMethod
	public void launch(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("localhost:8000/content/home.php");
	}
  @Test
  public void checklogin() {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //driver.findElement(By.name("login")).sendKeys("kamala");
	  //driver.findElement(By.name("password")).sendKeys("password");
	  //driver.findElement(By.name("click")).click();
	  driver.getPageSource().contains("Feel free to edit it");
  }
  @AfterMethod
  public void close(){
	  driver.close();
	  
  }
}
