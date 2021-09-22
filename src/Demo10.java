import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Demo10 {
	
	

	public static void main(String[] args) throws InterruptedException {
		String food="200";
		String clothing="300";
		String shelter="500";
		String monthlyPay="800";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004992\\Desktop\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("food")).sendKeys(food);
		driver.findElement(By.id("clothing")).sendKeys(clothing);
		driver.findElement(By.id("shelter")).sendKeys(shelter);
		driver.findElement(By.id("monthlyPay")).sendKeys(monthlyPay);
		driver.findElement(By.id("monthlyOther")).sendKeys("100");
		
		String vMonthinc=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		System.out.println("The monthly income is " +vMonthinc);
		String vMonthexp=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		System.out.println("The monthly expense is " +vMonthexp);
		
		if(Float.parseFloat(vMonthinc) > Float.parseFloat(vMonthexp))
		{
	System.out.println("The income is greater");
		}
		else
		{
			System.out.println("The expense is greater");
		}
		
		System.out.println("End of Test");
		Thread.sleep(2000);
		driver.close();
		
	
		
}}