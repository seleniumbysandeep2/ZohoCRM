package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecificOption {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the country name");
	String country = s.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	WebElement dd = driver.findElement(By.id("select3"));
	Select select=new Select(dd);
	WebElement ele = select.getWrappedElement();
	String text = ele.getText();
	if(text.contains(country)) {
		System.out.println(country+" is present in the dropdown");
	}else {
		System.out.println(country+" is not present in the dropdown");
	}
//	List<WebElement> allOpts = select.getOptions();
//	int count=0;
//	for (WebElement ele : allOpts) {
//		String text = ele.getText();
//		if(text.equals(country)) {
//			count++;
//		}}
//	if(count>0) {
//		System.out.println(country+" is present in the dropdown");
//	}else {
//		System.out.println(country+" is not present in the dropdown");
//	}
	driver.quit();
}
}
