package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		Thread.sleep(100000);
		 WebElement NewAccount = driver.findElement(By.xpath("//*[text()='Create new account']"));
	        NewAccount.click();
	        WebElement DOB=driver.findElement(By.id("day"));
	        Select ddDOB=new Select(DOB);
	        ddDOB.selectByVisibleText("10");
	        List <WebElement> Months=driver.findElements(By.xpath("//select[@id='month']/option"));
	        for (int i=0;i<Months.size();i++) {
	        	System.out.println(Months.get(i).getText());
	        }
	        String GenderVal="Male";
	        String GenXpath="//label[text()='Male']/following-sibling::";
	        WebElement Gender = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
	        Gender.click();
	        
	        }
	        }


