package myworks.kalki71;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtubeviews {
	
	
	@Test
	
	public void openYT() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/shorts/Hw5EjJocfQU");
		driver.findElement(By.xpath("//div[@id='container' and @class='style-scope ytd-player']")).click();
	
	Thread.sleep(100000);
	driver.close();
	}

}
