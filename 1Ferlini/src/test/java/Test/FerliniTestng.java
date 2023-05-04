package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Base.TestBase;
import Page.FerliniHomePage;

public class FerliniTestng extends TestBase {
	
	FerliniHomePage home;
	
	@BeforeMethod
	public void setup()
	{
		Initialization();
		home = new FerliniHomePage();
	}
	
	@Test
	public void ferliniHomePageTest() throws Exception
	{
		String title1 = home.verifyFerliniTitle();
		Assert.assertEquals(title1, "Ferlini — Ferlini.it");
		
		home.Clickcontact();	
		String title2 = home.verifyContactTitle();
		Assert.assertEquals(title2, "Contattaci — Ferlini.it");

		String label = home.Verifyadress();
		Assert.assertTrue(true);
		
		home.Verifymap();
	}
	
	
	@Test 
	@Parameters({ "message", "nameAndsurname" , "company", "emailAddress", "countryCode", "areaCode", "prefix", "suffixLine"})
		public void testCaseTwo(String message, String nameAndsurname, String company, String emailAddress, String countryCode, String areaCode, String prefix, String suffixLine) throws Exception {
		home.Clickcontact();
		System.out.println("Parameter for message passed as :- " + message);
		System.out.println("Parameter for nameAndsurname passed as :- " + nameAndsurname);
		System.out.println("Parameter for company passed as :- " + company);
		System.out.println("Parameter for emailAddress passed as :- " + emailAddress);
		System.out.println("Parameter for countryCode passed as :- " + countryCode);
		System.out.println("Parameter for areaCode passed as :- " + areaCode);
		System.out.println("Parameter for prefix passed as :- " + prefix);
		System.out.println("Parameter for suffixLine passed as :- " + suffixLine);
		home.submit();
		}
	
	
	@AfterMethod (enabled=true)
	public void closeBrowser()
	{
		driver.close();
	}
	

}
