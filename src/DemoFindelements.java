import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFindelements {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.google.com/");
		Thread.sleep(3000);
		int vSubmit=myD.findElements(By.xpath("//input[@type='submit']")).size(); // to identify total submit buttons
		System.out.println("Total Submit Buttons are "+vSubmit);
		
		int vLink=myD.findElements(By.tagName("a")).size(); //to identify total links
		System.out.println("Total Links are "+vLink);
		
		for (int i=0;i<vLink;i++)
		{
			//String vURL=myD.findElements(By.tagName("a")).get(i).getAttribute("href"); // to print url
			String vURL=myD.findElements(By.tagName("a")).get(i).getText(); // to print url text
			System.out.println(vURL);
			
			if(vURL.contains("Gmail"))
			{
				myD.findElements(By.tagName("a")).get(i).click();
				break;
			}
			
		}
		
		
		
		myD.close();

	}

}