package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//declaration
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText = "Opportunities")
	private WebElement opportuniesLink;
	
	//initialization

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOpportuniesLink() {
		return opportuniesLink;
	}
	
	
	//Business Libraries
	public void clickOnOrgLink()
	{
		organizationLink.click();
	}
	
	public void clickOnContactsLink()
	{
		contactsLink.click();
	}
	
	public void clickOnOpprtunities()
	{
		opportuniesLink.click();
	}
}
