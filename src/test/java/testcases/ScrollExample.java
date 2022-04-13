package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		 Thread.sleep(10000);
		WebElement ScrollTo=driver.findElement(By.xpath("//h2[text()='Table Rows']"));
		JavascriptExecutor jsObj=(JavascriptExecutor) driver;
		jsObj.executeScript("arguments[0].scrollIntoView()", ScrollTo);
	}

}
