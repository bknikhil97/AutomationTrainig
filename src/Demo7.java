import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo7 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("WorldCup");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		String vSearch=driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).getAttribute("value");
		System.out.println(vSearch);
		
		
	
		Thread.sleep(5000);
		driver.close();

	}

}

