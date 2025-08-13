package qsp;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PibAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.pib.gov.in/");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	WebElement target = driver.findElement(By.xpath("//h4[text()='GOI Links']"));
	Actions a=new Actions(driver);
	a.scrollToElement(target).perform();
	driver.findElement(By.linkText("Ministry of Textiles")).click();
	driver.switchTo().alert().accept();
	Set<String> allWh = driver.getWindowHandles();
	for(String wh:allWh) {
		driver.switchTo().window(wh);
	}	
	String title = driver.getTitle();
	System.out.println(title);
	}

}
