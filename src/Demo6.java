import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo6 {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("homeval")).sendKeys("2000");
		driver.findElement(By.id("Downpayment")).sendKeys("200");
		driver.findElement(By.name("cal")).click();
		
		String vMpay=driver.findElement(By.xpath("\\div[@class'repayment-block']/div[1]/div[1]/h3")).getText();
		System.out.println("The monthly payment is" +vMpay);
		Thread.sleep(5000);
		driver.close();

	}

}
