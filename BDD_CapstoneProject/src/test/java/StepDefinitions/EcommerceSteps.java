package StepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoBlazePage;

import utils.DriverFactory;

public class EcommerceSteps
{
	WebDriver driver = DriverFactory.getDriver();
	DemoBlazePage dbpage = new DemoBlazePage(driver);

	
	@Given("User is on the Demoblaze homepage")
	public void user_is_on_the_demoblaze_homepage() throws InterruptedException 
	{
	    driver.get("https://www.demoblaze.com/");
	    Thread.sleep(2000);
	}

	@When("User clicks on SignUP button")
	public void user_clicks_on_sign_up_button() throws InterruptedException 
	{
		WebElement signupElement= driver.findElement(By.xpath("//a[@id='signin2']"));
		signupElement.click();
		Thread.sleep(1000);
	}

	@When("User enters username  and password for signup")
	public void user_enters_username_and_password_for_signup() throws InterruptedException 
	{
		//user enters username
		WebElement signupusername=driver.findElement(By.xpath("//input[@id='sign-username']"));
		signupusername.sendKeys("vishnuapathi02");			
		Thread.sleep(1000);

		//user enters password
		WebElement signuppassword=driver.findElement(By.xpath("//input[@id='sign-password']"));
		signuppassword.sendKeys("vishnu@123");
		Thread.sleep(1000);
	}

	@When("User clicks signup button")
	public void user_clicks_signup_button() throws InterruptedException 
	{
		//user clicks on sign up button
		WebElement signup2= driver.findElement(By.xpath("//button[@onclick='register()']"));
		signup2.click();	
		Thread.sleep(2000);
	}

	@Then("User should see an alert {string} and accept it")
	public void user_should_see_an_alert_and_accept_it(String alert01) throws InterruptedException 
	{
		Alert alt01=driver.switchTo().alert();
		Thread.sleep(2000);
		alt01.accept();	
		Thread.sleep(2000);
		driver.quit();
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException 
	{
		WebElement login=driver.findElement(By.xpath("//a[@id='login2']"));
		login.click();
		Thread.sleep(2000);
	}

	@When("User enters Username  and Password for login")
	public void user_enters_username_and_password_for_login() throws InterruptedException 
	{
		WebElement loginusername=driver.findElement(By.xpath("//input[@id='loginusername']"));
		loginusername.sendKeys("vishnuapathi02");
		Thread.sleep(1000);
		
		//user enters password
		WebElement loginpassword=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		loginpassword.sendKeys("vishnu@123");
		Thread.sleep(1000);
	}

	@When("User clicks login button")
	public void user_clicks_login_button() throws InterruptedException 
	{
		WebElement loginElement=driver.findElement(By.xpath("//button[@onclick='logIn()']"));
		loginElement.click();
		Thread.sleep(1000);
	}

	@When("User clicks on Contact")
	public void user_clicks_on_contact() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement contact=driver.findElement(By.xpath("//a[@data-target='#exampleModal']"));
		contact.click();
		Thread.sleep(1000);
	}

	@When("User enters contact email and name")
	public void user_enters_contact_email_and_name() throws InterruptedException 
	{
		WebElement contactemail=driver.findElement(By.xpath("//input[@id='recipient-email']"));
		contactemail.sendKeys("v@gmail.com");
		Thread.sleep(1000);
		
		//user enters contact name
		WebElement contactname=driver.findElement(By.xpath("//input[@id='recipient-name']"));
		contactname.sendKeys("Vishnu");
		Thread.sleep(1000);
	}

	@When("User enters message")
	public void user_enters_message() throws InterruptedException 
	{
		//user enters message
		WebElement message=driver.findElement(By.xpath("//textarea[@id='message-text']"));
		message.sendKeys("Please add quantity in Cart");
		Thread.sleep(1000);
	}

	@When("User click on Send message")
	public void user_click_on_send_message() throws InterruptedException 
	{
		WebElement sendmessage=driver.findElement(By.xpath("//button[@onclick='send()']"));
		sendmessage.click();
		Thread.sleep(1000);
		Alert alt02=driver.switchTo().alert();
		Thread.sleep(1000);
		alt02.accept();
		Thread.sleep(1500);
	}

	@When("User clicks on About us")
	public void user_clicks_on_about_us() throws InterruptedException 
	{
		WebElement aboutus=driver.findElement(By.xpath("//a[@data-target='#videoModal']"));
		aboutus.click();
		Thread.sleep(1500);
	}

	@When("User clicks on Close button")
	public void user_clicks_on_close_button() throws InterruptedException 
	{
		WebElement closeElement=driver.findElement(By.xpath("//div[@id='videoModal']//button[@type='button'][normalize-space()='Close']"));
		closeElement.click();
		Thread.sleep(1500);
	}
	
	@When("User navigates to Phones category")
	public void user_navigates_to_phones_category() throws InterruptedException 
	{
		
		WebElement phones=driver.findElement(By.xpath("//div[@id='contcont']//a[2]"));
		phones.click();
		Thread.sleep(1000);
	}

	@When("User selects Samsung galaxy s6")
	public void user_selects_samsung_galaxy_s6() throws InterruptedException 
	{
		WebElement phone1=driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));
		phone1.click();
		Thread.sleep(1000);
	}

	@When("User adds phone item to cart")
	public void user_adds_phone_item_to_cart() throws InterruptedException 
	{
		Thread.sleep(1000);
		WebElement addcart=driver.findElement(By.xpath("//a[@onclick='addToCart(1)']"));
		addcart.click();
		Thread.sleep(2000);
		
		Alert alt03=driver.switchTo().alert();
		alt03.accept();
		Thread.sleep(2000);
	}

	@When("User goes back to home page")
	public void user_goes_back_to_home_page() throws InterruptedException
	{
		WebElement home01=driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
		home01.click();
		Thread.sleep(1500);
	}

	@When("User navigates to Laptops category")
	public void user_navigates_to_laptops_category() throws InterruptedException 
	{
		//for adding laptop to cart
		WebElement laptop=driver.findElement(By.xpath("//a[3]"));
		laptop.click();
		Thread.sleep(2000);
	}

	@When("User selects MacBook air")
	public void user_selects_mac_book_air() throws InterruptedException
	{
		//User selects macbook
		WebElement macbook=driver.findElement(By.xpath("//a[normalize-space()='MacBook air']"));
		macbook.click();
		Thread.sleep(1000);
	
	}

	@When("User adds laptop item to cart")
	public void user_adds_laptop_item_to_cart() throws InterruptedException 
	{
		//User addthe item to cart
		Thread.sleep(1000);
		WebElement addcart02=driver.findElement(By.xpath("//a[@onclick='addToCart(11)']"));
		addcart02.click();
		Thread.sleep(2000);
		//alert
		Alert alt04=driver.switchTo().alert();
		alt04.accept();
		Thread.sleep(2000);
	}

	@When("User navigates to Monitors category")
	public void user_navigates_to_monitors_category() throws InterruptedException
	{
		WebElement monitors=driver.findElement(By.xpath("//a[4]"));
		monitors.click();
		Thread.sleep(1500);
	}

	@When("User selects Apple monitor24")
	public void user_selects_apple_monitor24() throws InterruptedException 
	{
		//user select monitor called (Apple monitor 24)
		WebElement monitor1=driver.findElement(By.xpath("//a[normalize-space()='Apple monitor 24']"));
		monitor1.click();
		Thread.sleep(1500);
	}

	@When("User adds monitor item to cart")
	public void user_adds_monitor_item_to_cart() throws InterruptedException 
	{
		//user added the item to cart
		Thread.sleep(1000);
		WebElement addcart03=driver.findElement(By.xpath("//a[@onclick='addToCart(10)']"));
		addcart03.click();
		Thread.sleep(1500);
				
		//alert
		Alert alt05=driver.switchTo().alert();
		alt05.accept();
		Thread.sleep(1500);
	}
	
	@When("User clicks on Cart")
	public void user_clicks_on_cart() throws InterruptedException 
	{
		WebElement cart=driver.findElement(By.xpath("//a[normalize-space()='Cart']"));
		cart.click();
		Thread.sleep(1500);
	}

	@When("User clicks on Place Order")
	public void user_clicks_on_place_order() throws InterruptedException 
	{
		WebElement placeorder=driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
		placeorder.click();
		Thread.sleep(2000);
	}

	@When("User fills order details:")
	public void user_fills_order_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	{
		//User should enter all the details
		
				//User add name 
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Vishnu Vardhan");
		Thread.sleep(1500);
		
		//User added country
		WebElement country=driver.findElement(By.xpath("//input[@id='country']"));
		country.sendKeys("India");
		Thread.sleep(1500);
		
		//user added city
		WebElement city=driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Kurnool");
		Thread.sleep(2000);
		
		//user added Credit card Number
		WebElement creditcard=driver.findElement(By.xpath("//input[@id='card']"));
		creditcard.sendKeys("94637449278");
		Thread.sleep(1500);
		
		//User added month
		WebElement month=driver.findElement(By.xpath("//input[@id='month']"));
		month.sendKeys("September");
		Thread.sleep(1500);
		
		//user added year 
		WebElement year=driver.findElement(By.xpath("//input[@id='year']"));
		year.sendKeys("2025");
		Thread.sleep(1500);
	}

	@When("User clicks on Purchase")
	public void user_clicks_on_purchase() throws InterruptedException 
	{
		WebElement purchase=driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']"));
		purchase.click();
		Thread.sleep(2000);
	}

	@Then("User should see an message {string} and click OK")
	public void user_should_see_an_message_and_click_ok(String Thankyou) throws InterruptedException 
	{
		WebElement successful=driver.findElement(By.xpath("//button[@tabindex='1']"));
		successful.click();
		Thread.sleep(2000);

	}

	@Then("User clicks on Log out")
	public void user_clicks_on_log_out() throws InterruptedException 
	{
		//User Clicks on logout
		WebElement logout=driver.findElement(By.xpath("//a[@id='logout2']"));
		logout.click();
		Thread.sleep(2000);
	}

	
}