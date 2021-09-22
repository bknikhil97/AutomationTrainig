import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com/");
		
	    System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> ids=driver.getWindowHandles();// this is used to handle multiple windows
		//System.out.println(ids);
		
		Iterator<String> it=ids.iterator();
        String ParentID=it.next();
        String ChildID=it.next();
        
        //System.out.println(ParentID);
        //System.out.println(ChildID);
        driver.switchTo().window(ChildID); // where webdriver is navigated to child tab(second tab)
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit(); // used to close all tabs 

	}

}
