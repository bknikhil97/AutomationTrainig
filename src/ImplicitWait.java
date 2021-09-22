import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class ImplicitWait {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004992\\Desktop\\Automation\\msedgedriver.exe");
	
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait-- it will 10 sec and then throw the no element exception
		
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("23234234username")).sendKeys("admin");
		
		//Thread.sleep(5000);
		driver.close();

	}

}
