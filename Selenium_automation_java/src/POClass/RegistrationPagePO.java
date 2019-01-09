package POClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TSClass.TestCase;

public class RegistrationPagePO extends TestCase{
	
	public RegistrationPagePO(WebDriver passDriver)
	{
		driver = passDriver;
	}
	

	//Locators
	
	public By login_xpath = By.xpath("//a[@id='loginBtn']");
	public By register_xpath = By.xpath("//a[@class='email-reg_action']"); 
	public By firstName_xapth = By.xpath("//input[@name='firstName']");
	public By lastName =By.xpath("//input[@name='lastName']");
	public By email = By.xpath("//input[@name='email' and @placeholder='Email']");
	public By mobile = By.xpath("//input[@name='phone']");
	public By password = By.xpath("//input[@id='regPassword']");
	public By cofirmPassword = By.xpath("//div[@id='registerBox']//input[@name='confirmPassword']");
	public By selectBord = By.xpath("//select[@name='board']");
	public By selectGrade = By.xpath("//select[@name='standard']");
	public By acceptTermsAndCondition = By.xpath("//input[@name='termsAndCondition']");
	public By registrationBtn = By.xpath("//button[@id='btnNewRegister']");
	public By studyNowBtn = By.xpath("//div[@id ='free']//button[@class='button_outline']");//list
	public By studyBtn = By.xpath("//div[@class='dash-my-cou-web']//button[@class='button_outline']");
//	public By videoPlay = By.xpath("//div[@class='ch-video-border'][1]//img[@class='img-responsive']");//list
	public By videoPlay = By.xpath("//*[@id=\"all\"]/div[1]/div/div/div/div/a");//list
	
	
	
	//Methods =============================
	
	//Click On Button 
	public void clickOnElement(By el)
	{
		WebElement webEl = driver.findElement(el);
		webEl.click();
	}
	
	public void clickOnElem(By el)
	{
		List webEl = driver.findElements(el);
		WebElement e2 = (WebElement) webEl.get(0);
		e2.click();
	}
	
	//Enter Value
	public void enterValue(By el,String s1)
	{
		WebElement webEl = driver.findElement(el);
		webEl.sendKeys(s1);
		
	}
	
	public void selectValueFromDropDown(By el1,int index)
	{
		Select dropdown = new Select(driver.findElement(el1));
		dropdown.selectByIndex(index);
	}
	
	
}
