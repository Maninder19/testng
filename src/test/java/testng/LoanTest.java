package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoanTest {
	
	
	@BeforeTest
	public void method3() {
		System.out.println("Inside metod3");
		
	}
	
	@BeforeMethod(alwaysRun=true)
	public void method1() {
		System.out.println("Inside method1");
		
	}
	@Test
	public void method1t() {
		System.out.println("Inside method1");
	}

	@Test
	public void HomeLoanTest() {
		System.out.println("Inside Home Loan Test");
	}
	
	@Test(groups={"Sanity"},priority=1)
	public void CarLoanTest() {
		System.out.println("Inside Car Loan Test");
	}
	@Test(enabled=true)
	public void method2t() {
		System.out.println("Inside method2");
	}
	@AfterMethod
	public void method2() {
		System.out.println("Inside method2");
		
	}
	@AfterTest
	public void method4() {
		System.out.println("Inside metod4");
		
	}
	
	

}
