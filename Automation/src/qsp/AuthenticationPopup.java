package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
}
