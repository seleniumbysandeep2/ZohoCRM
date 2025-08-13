package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("i phone 16 pro max"+Keys.ENTER);
List<WebElement> allProductNames = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 16 Pro Max')]"));
List<WebElement> allProductPrices = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 16 Pro Max')]/../../div[2]/div[1]/div/div[1]"));
	for(int i=0;i<allProductNames.size();i++) {
		String productName = allProductNames.get(i).getText();
		
		String price = allProductPrices.get(i).getText();
		System.out.println(productName+"---->"+price);
	}
	}

}
