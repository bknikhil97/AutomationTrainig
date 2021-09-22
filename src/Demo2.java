import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		String vTitle=driver.getTitle();
		System.out.println("The title is" +vTitle);
		Thread.sleep(5000);
		driver.close();

	}

}
