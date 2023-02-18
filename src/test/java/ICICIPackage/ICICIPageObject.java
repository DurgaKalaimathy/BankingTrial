package ICICIPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ICICIPageObject {

	@Test(priority=1)
	 public static void signin()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm"); 
		 driver.manage().window().maximize();
		 driver.findElement(By.name("username")).sendKeys("Durga");
		 driver.findElement(By.name("password")).sendKeys("Durga1997$");
		 driver.findElement(By.xpath("//input[@class='button']")).click();
	 }
	
	@Test(priority=2)
	public static void openNewAccount()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm"); 
		 driver.manage().window().maximize();
		 driver.findElement(By.name("username")).sendKeys("Durga");
		 driver.findElement(By.name("password")).sendKeys("Durga1997$");
		 driver.findElement(By.xpath("//input[@class='button']")).click();
		 
		 driver.findElement(By.xpath("//a[@href='/parabank/openaccount.htm']")).click();
		 Select select= new Select(driver.findElement(By.id("type")));
		 select.selectByVisibleText("SAVINGS");
		 driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
		 //driver.findElement(By.id("newAccountId")).click();
	 }
	
	
	@Test(priority=3)
	public static void AccountsOverview()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm"); 
		 driver.manage().window().maximize();
		 driver.findElement(By.name("username")).sendKeys("Durga");
		 driver.findElement(By.name("password")).sendKeys("Durga1997$");
		 driver.findElement(By.xpath("//input[@class='button']")).click();
		 
		 driver.findElement(By.xpath("//a[@href='/parabank/overview.htm']")).click();
		 //String value= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[2]/td[2]")).getText();
		 //System.out.println(value);
		 
	 }
	
	@Test(priority=4)
	public static void TransferFunds()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DURGLT\\Downloads\\chromedriver_win32_109\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm"); 
		 driver.manage().window().maximize();
		 driver.findElement(By.name("username")).sendKeys("Durga");
		 driver.findElement(By.name("password")).sendKeys("Durga1997$");
		 driver.findElement(By.xpath("//input[@class='button']")).click();
		 
		 driver.findElement(By.xpath("//a[@href='/parabank/transfer.htm']")).click();
		 driver.findElement(By.id("amount")).sendKeys("10");
		 //Select select= new Select(driver.findElement(By.id("fromAccountId")));
		 //select.selectByVisibleText("14010");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 
	 }


}
