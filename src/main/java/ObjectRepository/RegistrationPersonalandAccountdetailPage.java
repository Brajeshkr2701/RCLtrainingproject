package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPersonalandAccountdetailPage {
	
	
	
	//initialization of web elements
	public RegistrationPersonalandAccountdetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration of web elements
	
	//Personal Details
	
	@FindBy(id="firstName")
	private WebElement PersonalDetailsFirstNameTextField;
	
	@FindBy(id="lastName")
	private WebElement PersonalDetailsLastNameTextField;
	
	@FindBy(id="userInfoMod_email")
	private WebElement PersonalDetailsEmailAddressTextField;
	
	@FindBy(id="reEmailAddress")
	private WebElement PersonalDetailsRepeatEmailAddressTextField;
	

	//Account Details
	
	@FindBy(id="userInfoMod_userId")
	private WebElement AccountDetailsUserIdTextField;
	
	@FindBy(id="password")
	private WebElement AccountDetailsPasswordTextField;
	
	@FindBy(id="rePassword")
	private WebElement AccountDetailsRepeatPasswordTextField;
	
	//Next and Back Button of Registration Personal and Account Details
	
	@FindBy(xpath="//div[@class='btn btn-primary next-button_reg_fir ']")
	private WebElement RegistrationpersonalandaccountdetailsNextButton;
	
	@FindBy(xpath="//a[@class='fas fa-arrow-up ']")
	private WebElement RegistrationpersonalandaccountdetailsBackButton;
	
	
	
	//Personal and Account Details Link
	
	
	
	@FindBy(xpath="//strong[normalize-space()='Personal & Account Details']")
	private WebElement PersonalandAccountDetailsLink;
	
	
	
	
	//Company Details
	
	@FindBy(xpath="//strong[normalize-space()='Company Details']")
	private WebElement CompanyDetailsLink;
	
	//Service Request
	
	@FindBy(xpath="//strong[normalize-space()='Service Request']")
	private WebElement ServiceRequestLink;
	
	
	//getters method to use it in the test script
	
	public WebElement getPersonalDetailsFirstNameTextField() {
		return PersonalDetailsFirstNameTextField;
	}
	
	public WebElement getPersonalDetailsLastNameTextField() {
		return PersonalDetailsLastNameTextField;
	}
	
	public WebElement getPersonalDetailsEmailAddressTextField() {
		return PersonalDetailsEmailAddressTextField;
	}
	
	public WebElement getPersonalDetailsRepeatEmailAddressTextField() {
		return PersonalDetailsRepeatEmailAddressTextField;
	}
	
	public WebElement getAccountDetailsUserIdTextField() {
		return AccountDetailsUserIdTextField;
	}
	
	public WebElement getAccountDetailsPasswordTextField() {
		return AccountDetailsPasswordTextField;
	}
	
	public WebElement getAccountDetailsRepeatPasswordTextField() {
		return AccountDetailsRepeatPasswordTextField;
	}
	
	public WebElement getRegistrationpersonalandaccountdetailsNextButton() {
		return RegistrationpersonalandaccountdetailsNextButton;
	}
	
	public WebElement getRegistrationpersonalandaccountdetailsBackButton() {
		return RegistrationpersonalandaccountdetailsBackButton;
	}
	
	public WebElement getPersonalandAccountDetailsLink() {
		return PersonalandAccountDetailsLink;
	}
	
	public WebElement getCompanyDetailsLink() {
		return CompanyDetailsLink;
	}
	
	public WebElement getServiceRequestLink() {
		return ServiceRequestLink;
	}
	
	
	
	/*business logic*/
	public void EnterthevalueinPersonalandAccountDetails(String RegistrationFirstName,String RegistrationLastName,String RegistrationEmailAddress,String RegistrationRepeatEmailAddress,String RegistrationUserId,String RegistrationPassword,String RegistrationRepeatPassword) {
		PersonalDetailsFirstNameTextField.sendKeys(RegistrationFirstName);
		PersonalDetailsLastNameTextField.sendKeys(RegistrationLastName);
		PersonalDetailsEmailAddressTextField.sendKeys(RegistrationEmailAddress);
		PersonalDetailsRepeatEmailAddressTextField.sendKeys(RegistrationRepeatEmailAddress);
		AccountDetailsUserIdTextField.sendKeys(RegistrationUserId);
		AccountDetailsPasswordTextField.sendKeys(RegistrationPassword);
		AccountDetailsRepeatPasswordTextField.sendKeys(RegistrationRepeatPassword);
		RegistrationpersonalandaccountdetailsNextButton.click();
		
		
		//RegistrationpersonalandaccountdetailsBackButton.click();
		//PersonalandAccountDetailsLink.click();
		//CompanyDetailsLink.click();
		//ServiceRequestLink.click();
		
		
		
		
		
		
		
		
		
	}
}
	
	
	
	
	
	


