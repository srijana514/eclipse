package homework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	public class Browser extends Methods {
		@BeforeMethod 	
		public void openBrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\selenium1\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    driver.get("https://www.seleniumeasy.com/test/");
		    }
		
		@DataProvider(name="CalculateTwoNumbers")
		public Object [][] DataProviderForCalculate(){
		return new Object[]	[] {
			{"20","30"},
			{"10","20"},
			{"6", "10"},
			
		};
			
		}
		
		@Test(enabled=true, dataProvider="CalculateTwoNumbers")
    public void formDemo(String a,String b) {
    	 clickStartPracting();
    	 clickformdemo();
    	 verifyMessage();
    	 twoInputsField(a,b);
    	 
    	 
    }
	@Test(enabled=false)
		public void checkBox() {
		clickStartPracting();
		checkboxdemo();
		verifychecked();
	}
	//Assertion
	//Assert.assertTrue(verifyRadioSelectionText());
	
	
	@Test(enabled=false)
	public void radioButton() {
		clickStartPracting();
		clickRadioButton();
		clickFemaleRadioButton();
		clickGetCheckedValue();
		GetValue();
		verifyRadioSelectionText();
	//	Assert.assertTrue(clickGroupButton("Female"));
		
		//SoftAssert
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(15-50, "15-50");
//		Assert.assertTrue(clickAgeGroup("15-50"));
		
		}
	@Test(enabled=false)
	public void dropdown() {
		clickStartPracting();
		clickDropDownList();
		selectday();
		selectcountry();
	}
	@Test(enabled=false)
	public void javascript() {
		clickStartPracting();
	     clickJavaScript();
	     clickJavaScriptAlertBox();
	     clickAlertConfirmBox();
	     clickForPromptBox("srijana");
	 }
	
	@Test(enabled=false)
	public void windowPopup() {
		clickStartPracting();
		clickWindowPopup();
		clickSinglePopup();
		driver.close();	
		clickMultiplePopup();
		driver.close();
		clickMultiplePopup();
		
	  	}
	@Test(enabled=false)
	public void bootstrapAlert() {
		clickStartPracting();
		clickBootstrapAlert();
		AlertMessage();
	}
	@Test(enabled=false)
	public void bootstrapModal() {
		clickStartPracting();
		clickBootstrapModals();
		clickSingleModal();
		
	}
	
	//@AfterMethod
		public void closBrowser(){
			//driver.close();	
		}}

	

