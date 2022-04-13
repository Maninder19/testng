package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		 Thread.sleep(30000);
		 WebElement LoginLink = driver.findElement(By.linkText("Log in"));
	        LoginLink.click();
	        Thread.sleep(30000);
	        WebElement EmailElement = driver.findElement(By.name("user_login"));
	        EmailElement.sendKeys("abc@gmail.com");
	        WebElement Password = driver.findElement(By.id("password"));
	        Password.sendKeys("Abc@123456");
	        WebElement LoginBtn = driver.findElement(By.name("btn_login"));
	        LoginBtn.click();
	        
	        WebElement ErrorMsg= driver.findElement(By.id("msg_box"));
	        String Acting= ErrorMsg.getText();
	        String ExpMsg="The email or password you have entered is invalid.";
	        System.out.println(Acting);
	        if (Acting.equals(ExpMsg))
	        {
	        	System.out.println("Test Passed");
	        }
	        else {
	        		System.out.println("Test Failed");
	        	}
	       
	        
	        List<WebElement> links=driver.findElements(By.tagName("a"));
	        System.out.println(links.size());
	        for(int i=0;i<links.size();i++) {
	        	System.out.println(links.get(i).getAttribute("href"));
	        }
	        	
	   	 
	        driver.close();




	}

}
