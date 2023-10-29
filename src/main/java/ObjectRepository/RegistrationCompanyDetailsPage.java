package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;



public class RegistrationCompanyDetailsPage extends WebDriverUtility {
	
	//initialization of web elements
	public RegistrationCompanyDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration of web elements
	
	
	@FindBy(id="companyName")
	private WebElement RegistrationCompanyNameTextField;
	
	
	@FindBy(id="inputcustomerCode")
	private WebElement RegistrationCompanyCodeTextField;
	
	@FindBy(id="inputAddress1")
	private WebElement RegistrationAddress1TextField;
	
	@FindBy(id="inputAddress2")
	private WebElement RegistrationAddress2TextField;
	
	@FindBy(id="inputAddress3")
	private WebElement RegistrationAddress3TextField;
	
	@FindBy(id="inputAddress4")
	private WebElement RegistrationAddress4TextField;
	
	@FindBy(id="inputCountry")
	private WebElement RegistrationCountryDropdownField;
	
	@FindBy(id="inputState")
	private WebElement RegistrationEnterStateTextField;
	
	@FindBy(id="inputCity")
	private WebElement RegistrationCityDropdownField;
	
	@FindBy(id="phoneNo")
	private WebElement RegistrationEnterPhoneNoTextField;
	
	@FindBy(id="faxNo")
	private WebElement RegistrationEnterFaxNoTextField;
	
	@FindBy(xpath="//div[@class='btn btn-primary next-button1 ']")
	private WebElement RegistrationNextButton;
	
	@FindBy(xpath="//div[@id='second-screen']//div[contains(@class,'btn btn-primary prev mr-2')]")
	private WebElement RegistrationPrevButton;
	

	@FindBy(xpath="//a[@class='fas fa-arrow-up']")
	private WebElement RegistrationBackButton;
	
	@FindBy(xpath="//strong[normalize-space()='Company Details']")
	private WebElement RegistrationCompanyDetailsLink;
	
	//getters method to use it in the test script
	
	public WebElement getRegistrationCompanyName() {
		return RegistrationCompanyNameTextField;
	}
	
	public WebElement getRegistrationCompanyCode() {
		return RegistrationCompanyCodeTextField;
	}
	
	public WebElement getRegistrationAddress1() {
		return RegistrationAddress1TextField;
	}
	
	public WebElement getRegistrationAddress2() {
		return RegistrationAddress2TextField;
	}
	
	
	public WebElement getRegistrationAddress3() {
		return RegistrationAddress3TextField;
	}
	
	public WebElement getRegistrationAddress4() {
		return RegistrationAddress4TextField;
	}
	
	public WebElement getRegistrationCountryDropdown() {
		return RegistrationCountryDropdownField;
	}
	
	public WebElement getRegistrationEnterState() {
		return RegistrationEnterStateTextField;
	}
	
	public WebElement getRegistrationCityDropdown() {
		return RegistrationCityDropdownField;
	}
	
	public WebElement getRegistrationEnterPhoneNo() {
		return RegistrationEnterPhoneNoTextField;
	}
	
	public WebElement getRegistrationEnterFaxNo() {
		return RegistrationEnterFaxNoTextField;
	}
	
	public WebElement getRegistrationNextButton() {
		return RegistrationNextButton;
	}
	
	public WebElement getRegistrationPrevButton() {
		return RegistrationPrevButton;
	}
	
	public WebElement getRegistrationBackButton() {
		return RegistrationBackButton;
	}
	
	public WebElement getRegistrationCompanyDetailsLink() {
		return RegistrationCompanyDetailsLink;
	}

	
	/*business logic*/
	
	public void EnterthevalueinCompanyDetails(String Companynamedetails,String Companycodedetails,String Addressdetails1,String Addressdetails2,String Addressdetails3,String Addressdetails4,String Enterstatedetails,String PhoneNumberdetails,String FaxNumberdetails,String Countrydropdown,String Citydropdown )
	{
		selectOption(RegistrationCountryDropdownField, Countrydropdown);
		selectOption(RegistrationCityDropdownField,Citydropdown);
		RegistrationCompanyNameTextField.sendKeys(Companynamedetails);
		RegistrationCompanyCodeTextField.sendKeys(Companycodedetails);
		RegistrationAddress1TextField.sendKeys(Addressdetails1);
		RegistrationAddress2TextField.sendKeys(Addressdetails2);
		RegistrationAddress3TextField.sendKeys(Addressdetails3);
		RegistrationAddress4TextField.sendKeys(Addressdetails4);
		RegistrationEnterStateTextField.sendKeys(Enterstatedetails);
		RegistrationEnterPhoneNoTextField.sendKeys(PhoneNumberdetails);
		RegistrationEnterFaxNoTextField.sendKeys(FaxNumberdetails);
		RegistrationNextButton.click();
		RegistrationPrevButton.click();
		RegistrationBackButton.click();
		RegistrationCompanyDetailsLink.click();
		
		
		
		
		
		
		
			
	}
		
}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


