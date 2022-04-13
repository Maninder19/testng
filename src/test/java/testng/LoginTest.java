package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class LoginTest {
	WebDriver driver;
@BeforeMethod(alwaysRun=true)
	public void SetUp() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.simplilearn.com");
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	 Thread.sleep(30000);
	 WebElement LoginLink = driver.findElement(By.linkText("Log in"));
        LoginLink.click();
        }
@Parameters( {"param1","param2"})
@Test(groups={"Sanity"})
public void LoginTestcase(String UserNameVal,String PasswordVal) {

    WebElement EmailElement = driver.findElement(By.name("user_login"));
    EmailElement.sendKeys(UserNameVal);
    WebElement Password = driver.findElement(By.id("password"));
    Password.sendKeys(PasswordVal);
    WebElement LoginBtn = driver.findElement(By.name("btn_login"));
    LoginBtn.click();
    
    WebElement ErrorMsg= driver.findElement(By.id("msg_box"));
    String Acting= ErrorMsg.getText();
    String ExpMsg="The email or password you have entered is invalid.";
    
    Assert.assertEquals(Acting, ExpMsg); 
    List<WebElement> links=driver.findElements(By.tagName("a"));
    System.out.println(links.size());
    for(int i=0;i<links.size();i++) {
    	System.out.println(links.get(i).getAttribute("href"));
    }
	
}

@AfterMethod
public void TearDown() {
	driver.close();
}
}

