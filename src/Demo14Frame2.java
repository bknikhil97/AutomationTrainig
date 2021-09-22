import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Demo14Frame2 {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(5000);
		
		int vFrame=myD.findElements(By.tagName("iframe")).size(); // to print the number of frames
		System.out.println("Total Frames "+vFrame);
		
		//myD.switchTo().frame(0);
		//myD.switchTo().frame(myD.findElement(By.xpath("//iframe[@class='demo-frame']")));
		myD.switchTo().frame(myD.findElement(By.className("demo-frame")));
		
		//You can navigate to the frame by index
		
		Actions act=new Actions(myD);
		
		WebElement source=myD.findElement(By.id("draggable"));
		WebElement dest=myD.findElement(By.id("droppable"));
		
		
		act.dragAndDrop(source, dest).build().perform();
		
		Thread.sleep(5000);
		
		
		//This will switch to a main page
		myD.switchTo().defaultContent();

		//Droppable Text
		System.out.println(myD.findElement(By.className("entry-title")).getText());
		
		
		myD.close();

	}}