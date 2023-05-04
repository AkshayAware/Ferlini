package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class FerliniHomePage extends TestBase {
	
	@FindBy(xpath = "//span[text()='Contattaci']")private WebElement contact;
	@FindBy(xpath = "//div[@style ='z-index: 3; position: absolute; height: 100%; width: 100%; padding: 0px; border-width: 0px; margin: 0px; left: 0px; top: 0px; touch-action: pan-x pan-y;']")private WebElement map;	
	@FindBy(xpath = "(//p[@style='white-space: pre-wrap;'])[2]")private WebElement adress;
	@FindBy(xpath = "//textarea[@class='field-element ']")private WebElement message;
	@FindBy(xpath = "//input[@id='text-yui_3_17_2_1_1490690886464_15563-field']") private WebElement nameAndsurname;
	@FindBy(xpath = "//input[@id='text-yui_3_17_2_1_1490690886464_16230-field']") private WebElement company;
	@FindBy(xpath = "//input[@id='email-yui_3_17_2_53_1489218200494_4204-field']") private WebElement emailAddress;
	@FindBy(xpath = "//input[@data-title='Country']") private WebElement countryCode;	
	@FindBy(xpath = "//input[@data-title='Areacode']") private WebElement areaCode;	
	@FindBy(xpath = "//input[@data-title='Prefix']") private WebElement prefix;	
	@FindBy(xpath = "//input[@data-title='Line']") private WebElement suffixLine;	
	@FindBy(xpath = "//input[@value='Invia']") private WebElement submitButton;	
	
	public FerliniHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyFerliniTitle() throws Exception
	{
		String tit = driver.getTitle();
		System.out.println(tit);
		Thread.sleep(2000);
		return tit;
		
	}
	
	public void Clickcontact() throws Exception
	{
		contact.click();
		Thread.sleep(2000);
	}
	
	public String verifyContactTitle()
	{
		String tit1 = driver.getTitle();
		System.out.println(tit1);
		return tit1;
	}
	
	public void Verifymap()
	{
		boolean dis = map.isDisplayed();
		System.out.println("Map is Displayed = " + dis);
	}
	
	public String Verifyadress()
	{
		String add = adress.getText();
		System.out.println("Verified adress is " + add);
		return add;
	}
	
	public void submit()
	{
		submitButton.click();
	}
	
	

}
