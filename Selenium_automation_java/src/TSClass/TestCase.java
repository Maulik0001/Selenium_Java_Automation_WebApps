package TSClass;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POClass.ExcelRead;
import POClass.RegistrationPagePO;


public class TestCase extends ExcelRead{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
/*		String[] readData;
		ExcelRead excelReadObj = new ExcelRead();
		readData = excelReadObj.readExcel(System.getProperty("user.dir")+"\\ExcelFile","registrationData.xls", "RegistrationData");
		*/
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        
        System.out.println("1. Lunch Browser");
        driver.get("https://www.topscorer.com/v3/mp/login/");
        driver.manage().window().maximize();
        
        RegistrationPagePO registrationpo = new RegistrationPagePO(driver);
        
        Thread.sleep(1000);
        
        System.out.println("2. click on Login or registration");
        registrationpo.clickOnElement(registrationpo.login_xpath);
        
        Thread.sleep(1000);
        
        System.out.println("3. click on Register with email");
        registrationpo.clickOnElement(registrationpo.register_xpath);
        
        Thread.sleep(1000);
        
        System.out.println("4. Enter First Name");
        registrationpo.enterValue(registrationpo.firstName_xapth,"yest");
        
        System.out.println("5. Enter Last Name ");
        registrationpo.enterValue(registrationpo.lastName,"test1");
        
        System.out.println("6. Enter email");
        registrationpo.enterValue(registrationpo.email,"testMailCheck@gmail.com");
        
        System.out.println("7. Enter Mobile");
        registrationpo.enterValue(registrationpo.mobile,"8574859685");
        
        System.out.println("8. Enter Password");
        registrationpo.enterValue(registrationpo.password,"123456Test");
        
        System.out.println("9. Enter confirm Password");
        registrationpo.enterValue(registrationpo.cofirmPassword,"123456Test");
        
        System.out.println("10. Select Board");
        registrationpo.selectValueFromDropDown(registrationpo.selectBord,4);
        
        System.out.println("10. Select Grade");
        //registrationpo.selectValueFromDropDown(registrationpo.selectGrade,4);
        
        Thread.sleep(1000);
        
		System.out.println("11. Select I Agree");
		registrationpo.clickOnElement(registrationpo.acceptTermsAndCondition);
		
		System.out.println("12. Click On Register");
		registrationpo.clickOnElement(registrationpo.registrationBtn);
		
		Thread.sleep(6000);
		
		System.out.println("12. Click On Study Now");
		registrationpo.clickOnElem(registrationpo.studyNowBtn);
		
		Thread.sleep(4000);
		
		System.out.println("12. Click On Study");
		registrationpo.clickOnElement(registrationpo.studyBtn);
		
		Thread.sleep(2000);
		
		System.out.println("12. Click On video");
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		
		registrationpo.clickOnElem(registrationpo.videoPlay);
 
		Set<String> allWindowHandles = driver.getWindowHandles();
 
		for(String handle : allWindowHandles)
		{
			System.out.println("Switching to window - > " + handle);
			driver.switchTo().window(parentWindowHandle);
		}
		
	}
	

}
