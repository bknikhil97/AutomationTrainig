import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Demo15Alerts {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(5000);
		
		myD.findElement(By.xpath("//button[text()='Click me!']")).click();
		Thread.sleep(5000);
		myD.switchTo().alert().accept();
		
		
		myD.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
		myD.switchTo().alert().dismiss();
		
		myD.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Thread.sleep(5000);
		myD.switchTo().alert().sendKeys("12345");
		Thread.sleep(5000);
		myD.switchTo().alert().accept();
		
		Thread.sleep(7000);
		
		
		myD.close();

	}

}