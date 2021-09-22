import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Demo11Actions {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://www.youcandealwithit.com");
	    Thread.sleep(3000);
	    Actions mouseover=new Actions(driver); // actions are used when we have mouse hover and drag and drop functionality
	    mouseover.moveToElement(driver.findElement(By.linkText("BORROWERS"))).build().perform();	// to move the mouse over the borrowers menu	
		Thread.sleep(2000);
		driver.findElement(By.linkText("Calculators & Resources")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	
		
}}