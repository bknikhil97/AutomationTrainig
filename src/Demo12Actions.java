import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Demo12Actions {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(3000);
	    Actions mouseover=new Actions(driver);// this is used for mouse over element
	    mouseover.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();// this line we need to use whenever we use mouse over element in web page		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	
		
}}