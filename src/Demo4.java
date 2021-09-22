import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Demo4 {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004992\\Desktop\\Automation\\msedgedriver.exe");
	
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("session_password")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		String msg=driver.findElement(By.xpath("//*[@id=\"error-for-username\"]")).getText();
		System.out.println(""+msg);
		
		driver.findElement(By.linkText("Forgot password")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Sign")).click();
		String vTitle=driver.getTitle();
		System.out.println("The title is" +vTitle);
		Thread.sleep(5000);
		driver.close();

	}

}
