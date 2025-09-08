package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoBlazePage 
{
    private WebDriver driver;   
    
    //Locators
    private By signupField = By.xpath("//a[@id='signin2']");
    private By signupusernameFeild = By.xpath("//input[@id='sign-username']");
    private By signuppasswordFeild = By.xpath("//input[@id='sign-password'");
    private By signup2Feild = By.xpath("//button[@onclick='register()']");
    
    private By loginField = By.xpath("//a[@id='login2']");
    private By loginusernameField = By.xpath("//input[@id='loginusername']");
    private By loginpasswordFeild = By.xpath("//input[@id='loginpassword']");
    private By loginElementFeild= By.xpath("//button[@onclick='logIn()']");
    
    private By contactField = By.xpath("//a[@data-target='#exampleModal']");
    private By contactemailField = By.xpath("//input[@id='recipient-email']");
    private By contactnameField = By.xpath("//input[@id='recipient-name']");
    private By messageFeild= By.xpath("//textarea[@id='message-text']");
    private By sendmessageFeild= By.xpath("///button[@onclick='send()']");
    
    private By aboutusFeild=By.xpath("//a[@data-target='#videoModal']");
    private By closeElementFeild=By.xpath("//div[@id='videoModal']//button[@type='button'][normalize-space()='Close']");
    
    private By phonesField = By.xpath("//div[@id='contcont']//a[2]");
    private By phone1Field = By.xpath("//a[normalize-space()='Samsung galaxy s6']");
    private By addcartField = By.xpath("//a[@onclick='addToCart(1)']");
    
    private By home01Feild= By.xpath("//li[@class='nav-item active']//a[@class='nav-link']");
    
    private By laptopField = By.xpath("//a[3]");
    private By macbookField = By.xpath("//a[normalize-space()='MacBook air']");
    private By addcart02Field = By.xpath("//a[@onclick='addToCart(11)']");
    
    private By monitorsFeild= By.xpath("//a[4]");
    private By monitor1Feild= By.xpath("//a[normalize-space()='Apple monitor 24'");
    private By addcart03Field=By.xpath("//a[@onclick='addToCart(10)']");
    
    private By cartFeild=By.xpath("//a[normalize-space()='Cart']");
    private By placeholderFeild=By.xpath("//button[normalize-space()='Place Order']");
    
    private By nameFeild=By.xpath("//input[@id='name']");
    private By countryFeild=By.xpath("//input[@id='country']");
    private By cityFeild=By.xpath("//input[@id='city']");
    private By creditcardFeild=By.xpath("//input[@id='card']");
    private By monthFeild=By.xpath("//input[@id='month']");
    private By yearFeild=By.xpath("//input[@id='year']");
    
    private By purchasseFeild=By.xpath("//button[@onclick='purchaseOrder()']");
    private By successfulFeild=By.xpath("//button[@tabindex='1']");
    private By logoutFeild=By.xpath("//a[@id='logout2']");
    
    //Constructor
    public DemoBlazePage(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    // Actions
    public void clickSignup() 
    { 
    	driver.findElement(signupField).click(); 
    }


    public void enterSignupUsername(String Username)
    { 
    	driver.findElement(signupusernameFeild).sendKeys(Username); 
    }

    public void enterSignupPassword(String Password) 
    { 
    	driver.findElement(signuppasswordFeild).sendKeys(Password); 
    }

    public void submitSignup() 
    { 
    	driver.findElement(signup2Feild).click();
    }
    

    
    public void enterdetails(String username,String password) 
    		throws InterruptedException {
    	Thread.sleep(4000);
        driver.findElement(nameFeild).sendKeys(username);
        driver.findElement(countryFeild).sendKeys(password);
    }
    
    
}