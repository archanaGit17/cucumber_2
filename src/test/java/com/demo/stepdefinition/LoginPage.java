package com.demo.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage 
{
	WebDriver driver;
	@Given("user is on demoautomation site")
	public void user_is_on_demoautomation_site() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subbian\\eclipse-workspace\\Arch\\CucumberClass\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	@When("User enters the {string},{string},{string},{string},{string},{string},{string} and then click submit button")
	public void user_enters_the_and_then_click_submit_button(String fname, String lname, String add, String email, String phnno, String pwd, String c_pwd) 
	{
	   WebElement s1= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	   s1.sendKeys(fname);
	   WebElement s2= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	   s2.sendKeys(lname);
	   WebElement s3= driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	   s3.sendKeys(add);
	   WebElement s4= driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	   s4.sendKeys(email);
	   WebElement s5= driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	   s5.sendKeys(phnno);
	   WebElement s6= driver.findElement(By.xpath("(//input[@ng-model='radiovalue'])[2]"));
	   s6.click();
	   WebElement s7= driver.findElement(By.id("msdd"));
	   s7.click();
	   WebElement s7_1= driver.findElement(By.xpath("//a[text()='Indonesian']"));
	   s7_1.click();
	   WebElement s7_2= driver.findElement(By.xpath("//label[text()='Languages']"));
	   s7_2.click();
	   WebElement s8= driver.findElement(By.id("Skills"));
	   Select s= new Select(s8);
	   s.selectByVisibleText("Java");
	   WebElement s9= driver.findElement(By.id("countries"));
	   s= new Select(s9);
	   s.selectByVisibleText("India");
	   WebElement s10= driver.findElement(By.id("country"));
	   s= new Select(s10);
	   s.selectByVisibleText("India");
	   WebElement s11= driver.findElement(By.id("yearbox"));
	   s= new Select(s11);
	   s.selectByVisibleText("1995");
	   WebElement s12= driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
	   s= new Select(s12);
	   s.selectByVisibleText("January");
	   WebElement s13= driver.findElement(By.id("daybox"));
	   s= new Select(s13);
	   s.selectByVisibleText("17");
	   WebElement s14= driver.findElement(By.xpath("//input[@ng-model='Password']"));
	   s14.sendKeys(pwd);
	   WebElement s15= driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
	   s15.sendKeys(c_pwd);
	   WebElement s16= driver.findElement(By.id("submitbtn"));
	   s16.click();
	   WebElement s17= driver.findElement(By.xpath("//a[text()='WebTable']"));
	   s17.click();   
	}
	@Then("verify url contains WebTable")
	public void verify_url_contains_WebTable() {
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		boolean b=url.contains("WebTable");
		Assert.assertTrue(b);  
	}
}
