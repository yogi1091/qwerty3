package qwerty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogi\\eclipse-workspace\\qwerty\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		try {

			
		
			driver.get("https://www.facebook.com/");
			WebElement html = driver.findElement(By.xpath("//input[@id='email']/ancestor::html"));
			String text = html.getText();
			System.out.println(text);

	  	} catch (Exception e) {
			System.out.println("handled");

		}

	}
}
