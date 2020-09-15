package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ElementStepdef 
{
	public static WebDriver driver;
	
	
	@Given("^User is on demosite page$")
	public void user_is_on_demosite_page() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/");
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
     @When("^user click the elements button$")
	public void user_click_the_elements_button() throws Throwable
	{
	    WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
	    if(element.isDisplayed())
	    {
	    	System.out.println("element is displyed");
	    }
	    else
	    {
	    	System.out.println("element not displyed");
	    }
	    Actions Action=new Actions(driver);
	    Action.moveToElement(element).perform();
	    element.click(); 		
	}

	@When("^user click on Text Box button and fill the TextBox$")
	public void user_click_on_Text_Box_button_and_fill_the_TextBox() throws Throwable 
	{
	    WebElement TextBox=driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
	    if(TextBox.isDisplayed())
	    {
	    	System.out.println("TextBox is displyed");
	    }
	    else
	    {
	    	System.out.println("TextBox not displyed");
	    }
	    TextBox.click();
	    WebElement fullname=driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	    if(fullname.isDisplayed())
	    {
	    	System.out.println("fullname is displyed");
	    }
	    else
	    {
	    	System.out.println("fullname not displyed");
	    }
	    WebElement Email=driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
	    if( Email.isDisplayed())
	    {
	    	System.out.println(" Email is displyed");
	    }
	    else
	    {
	    	System.out.println(" Email not displyed");
	    }
	    WebElement currentadress=driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
	    if(currentadress.isDisplayed())
	    {
	    	System.out.println("currentadress is displyed");
	    }
	    else
	    {
	    	System.out.println("currentadress not displyed");
	    }
	    
	    fullname.sendKeys("Desaboina Gopi");
	    Email.sendKeys("Gopidqa@gmail.com");
	    currentadress.sendKeys("sudivaripalem");
	    Thread.sleep(2000);
	    WebElement submit=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[5]/div/button"));
	    if(submit.isDisplayed())
	    {
	    	System.out.println("submit is displyed");
	    }
	    else
	    {
	    	System.out.println("submit not displyed");
	    }
	    submit.submit();
	}

	@Then("^user verify the Text and close the browser$")
	public void user_verify_the_Text_and_close_the_browser() throws Throwable 
	{
	   WebElement text=driver.findElement(By.xpath("//*[@id=\"output\"]"));
	   if(text.isDisplayed())
	    {
	    	System.out.println("Text is displyed");
	    }
	    else
	    {
	    	System.out.println("Text not displyed");
	    }
	   String text1=text.getText();
	   System.out.println(text1);
	   driver.close();
	}


}
