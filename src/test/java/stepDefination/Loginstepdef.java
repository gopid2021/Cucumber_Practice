package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdef
{
public static WebDriver driver;

@Given("^User is on Home page$")
public void user_is_on_Home_page() throws Throwable 
{
   System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.toolsqa.com/selenium-webdriver/");
}
@And("^verify the title of home page$")
public void verify_the_title_of_home_page() throws Throwable 
{
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("Selenium Webdriver"))
	{
		System.out.println("verify title of home page");
	}
	else
	{
		System.out.println("Title is not verified");
	}
}  

@When("^user is moved to demosite$")
public void user_is_moved_to_demosite() throws Throwable
{
  WebElement demoSite=driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/a/span/span"));
  if(demoSite.isDisplayed())
  {
	  System.out.println("demo is displayed");
  }
  else
  {
	  System.out.println("demo is not displyed");
  }
  demoSite.click();
}

@Then("^user verify title of demosite and close the browser$")
public void user_verify_title_of_demosite_and_close_the_browser() throws Throwable
{
	String title1=driver.getTitle();
	if(title1.equals("ToolsQA"))
	{
		System.out.println("verify title of home page");
	}
	else
	{
		System.out.println("Title is not verified");
	}
	
	driver.close();
}  


}


