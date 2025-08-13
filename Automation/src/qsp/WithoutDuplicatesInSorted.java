package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicatesInSorted {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
List<WebElement> allopts = s.getOptions();
Set<String>ts=new TreeSet<String>();
	for(int i=0;i<allopts.size();i++) {
		WebElement ele = allopts.get(i);
		String text = ele.getText();
		ts.add(text);
	}
//	allOptsInList.sort(null);
	for (String text: ts) {
		System.out.println(text);
	}
	driver.quit();


}
}
