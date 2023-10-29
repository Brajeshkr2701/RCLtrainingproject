package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;



public class HomePage extends WebDriverUtility  {
	
	//initialization of web elements
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//declaration of web elements
		@FindBy(linkText="REGISTER")
		private WebElement RegisterLink;
		
		@FindBy(id="username")
		private WebElement userNameTextField;
		
		@FindBy(id="password")
		private WebElement passwordTextField;
		
		@FindBy(linkText="Forget Password?")
		private WebElement ForgetPasswordlink;
		
		@FindBy(id="onLoginID")
		private WebElement StartyourjourneyButton;
		
		@FindBy(xpath="//span[@class='logo-text-sec']")
		private WebElement HOMEPAGELink;
		
		@FindBy(xpath="//li[@class='nav-item dropdown']//div[@class='headerLanguageChangeTab']")
		private WebElement LanguageDropdown;
		
		//getters method to use it in the test script
		public WebElement getRegisterLink() {
			return RegisterLink;
		}

		public WebElement getUsernameTextField() {
			return userNameTextField;
		}
		
		
		public WebElement getPasswordTextField() {
			return passwordTextField;
		}
		
		public WebElement getForgetPasswordlink() {
			return ForgetPasswordlink;
		}
		
		public WebElement getStartyourjourneyButton() {
			return StartyourjourneyButton;
		}
		
		public WebElement getHOMEPAGELink() {
			return HOMEPAGELink;
		}
		
		public WebElement getLanguageDropdownlink() {
			return LanguageDropdown;
		}
		
		//business logic
		
		
		//Click on Register Link
		
		
		public void clickonRegisterLink() {
			RegisterLink.click();
		}
		
		
		
		public void logintoRCL(String username, String password)
		{
			userNameTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			StartyourjourneyButton.click();
		}
		
		public void clickonForgetPasswordlink() {
			ForgetPasswordlink.click();
		}
		
		public void clickonHOMEPAGELink() {
			HOMEPAGELink.click();
		}
		
		
		public void selectlanguagedropdown( String dropDownValue) {

			selectOption(LanguageDropdown, dropDownValue);
			
			
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	


