import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004992\\Desktop\\Automation\\msedgedriver.exe");
	
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait-- it will 10 sec and then throw the no element exception
		
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,20); //Explicit wait - used for specific element
		wait.until(ExpectedConditions.elementToBeClickable(By.id("123username")));
		
		Thread.sleep(2000);
		driver.findElement(By.id("1214username")).sendKeys("admin");
		
		//Thread.sleep(5000);
		driver.close();

	}

}
