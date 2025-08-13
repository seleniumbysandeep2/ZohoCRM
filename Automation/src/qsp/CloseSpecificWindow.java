package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindow {

	public static void main(String[] args) {
		System.out.println("Etner the title of window to be closed");
		Scanner sc=new Scanner(System.in);
		String eTitle = sc.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
	
	Set<String> allWh = driver.getWindowHandles();
	for(String wh:allWh) {
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		if(title.equals(eTitle)) {
		driver.close();
		
		}
	}
	
	}

}
