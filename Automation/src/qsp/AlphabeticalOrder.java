package qsp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabeticalOrder {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr);
	List<String>allOptsInList=new ArrayList<String>();
List<WebElement> allopts = s.getOptions();
	for(int i=0;i<allopts.size();i++) {
		WebElement ele = allopts.get(i);
		String text = ele.getText();
		allOptsInList.add(text);
	}
//	allOptsInList.sort(null);
	Collections.sort(allOptsInList);
	for (String text: allOptsInList) {
		System.out.println(text);
	}
	driver.quit();
}
}
