import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Demo9 {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung zfold3");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"p_n_is_cod_eligible/4931671031\"]/span/a/div/label/i")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"p_n_is_cod_eligible/4931671031\"]/span/a/div/label/i")).isSelected());
		
		String result=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
		if(result.contains("fold3"))
		{
			System.out.println("Result is Pass");
		}
			else
			{
				System.out.println("Fail");
			}
		String title=driver.getTitle();
		if(title.contains("fold3"))
		{System.out.println("Title is Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		System.out.println("End of Test");
		
		Thread.sleep(5000);
		driver.close();
		
		
		
}}