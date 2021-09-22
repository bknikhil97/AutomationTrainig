import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Xpath2 {
	
	
	public static String SearchData="Selenium";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(SearchData);
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		String vSearch=driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).getAttribute("value");
		//System.out.println(vSearch);
		if(vSearch.equals(SearchData))
		{
			System.out.println("Pass");
		}
			else
			{
				System.out.println("Fail");
			}
		
	
		Thread.sleep(5000);
		driver.close();

	}

}

