package RCLTestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepository.RegistrationPersonalandAccountdetailPage;
@Listeners(GenericUtility.ListenerImp.class)

public class CreateRegistrationTest extends BaseClass {
	
	@Test(groups = "smokeTest")
	public void createRegistration() throws Throwable {
		
		/*get data from excel*/
		String Registrationfirstname=eLib.getExcelData("RegistrationFirstName", 2, 2);
		String Registrationlastname=eLib.getExcelData("RegistrationLastName", 2, 2);
		String RegistrationEmailAddress=eLib.getExcelData("RegistrationEmailAddress", 2, 2);
		String RegistrationRepeatEmailAddress=eLib.getExcelData("RegistrationRepeatEmailAddress", 2, 2);
		String RegistrationUserId=eLib.getExcelData("RegistrationUserId", 2, 2);
		String RegistrationPassword=eLib.getExcelData("RegistrationPassword", 2, 2);
		String RegistrationRepeatPassword=eLib.getExcelData("RegistrationRepeatPassword", 2, 2);
		
		
		
		RegistrationPersonalandAccountdetailPage regAccountpage=new RegistrationPersonalandAccountdetailPage(driver);
		regAccountpage.EnterthevalueinPersonalandAccountDetails(Registrationfirstname, Registrationlastname, RegistrationEmailAddress, RegistrationRepeatEmailAddress, RegistrationUserId, RegistrationPassword, RegistrationRepeatPassword);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
