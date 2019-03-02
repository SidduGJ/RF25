package actionssDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouseOver {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.vtiger.com/");
		driver.manage().window().maximize();
		WebElement m = driver.findElement(By.xpath("//a[text()='Resources']"));
	
		Actions act=new Actions(driver);
		act.moveToElement(m).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
	
		WebElement hr = driver.findElement(By.xpath("//div[text()='Human Resources']/../div[2]"));
		String ph = hr.getText();
		System.out.println(ph);
	}
}
