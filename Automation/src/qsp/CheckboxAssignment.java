package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/checkbox/selected?sublist=1");
	Thread.sleep(2000);
List<WebElement> allChBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<allChBox.size();i++) {
		Thread.sleep(1000);
		if(allChBox.get(i).isSelected()==false) {	
			allChBox.get(i).click();
		}		
	}
	}
}
