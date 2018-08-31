import java.util.concurrent.TimeUnit;

import org.apache.http.impl.client.SystemDefaultHttpClient;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;  


	public class Flows{
		
		
		WebDriver driver = new ChromeDriver();
		public int i;
		  
		String shivam;
		  
		// This method will set cookies of browser for united state
	public  void Set_Cookies() {
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.navigate().to("https:/qa-login.cengagebrain.com/cb/regionCookie.htm");
		WebElement Cookies = driver.findElement(By.xpath("//a[@class='medium_green_button'][text()='Set Cookies']"));
		Cookies.click();
		
		
	}
	        
	// This method will create a new student through a access code
		public void Newuser_AccessCode() throws InterruptedException
		{
			//try {
				
			
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String Acc_code[] = new String[4];
			Acc_code[0] = "PPGBQHJP382T3L";
			Acc_code[1] = "PPQZFN2P51PZ6N";
			Acc_code[2] = "PP2FZ9ZP5N7PSL";
			Acc_code[3] = "PP02LQBPGQ7L7P";
			
			
			for(i=0;i<=3;i++)
			{
				if( i==0)
				{
				AccessCode();
				}
				
				
				String shivam ="SSO" + System.currentTimeMillis() + "@swlearning.com" ;
				System.out.println("Student Number: " +i);
				
				driver.navigate().to("https://s-c-login.cengagebrain.com/cb/login.htm");
				WebElement	AccessCode = driver.findElement(By.xpath("//input[@id='accesscode'][@title='Enter your Access Code or Course Key']"));
				AccessCode.sendKeys(Acc_code[i]);
				WebElement Register = driver.findElement(By.xpath("//a[@class='greenWhiteButton'][@role='button']"));
				Register.click();
				Thread.sleep(2000);
				WebElement NewStudent_email= driver.findElement(By.xpath("//input[@id='newEmail'][@name='email']"));
				NewStudent_email.sendKeys(shivam);
			WebElement CreateNewAccount = driver.findElement(By.xpath("//a[@class='greenWhiteButton'][text()='Create a new account']"));
			CreateNewAccount.click();
			WebElement FirstName= driver.findElement(By.xpath("//input[@id='fname'][@title='First Name']"));
			FirstName.sendKeys("QA" +System.currentTimeMillis());
			WebElement LastName= driver.findElement(By.xpath("//input[@id='lname'][@title='Last Name']"));
			LastName.sendKeys("QA");
			WebElement Password = driver.findElement(By.xpath("//input[@id='password'][@title='Password']"));
			Password.sendKeys("A111111");
			WebElement CnfPassword = driver.findElement(By.xpath("//input[@id='confirmPassword'][@title='Confirm Password']"));
			CnfPassword.sendKeys("A111111");
			WebElement selectQuestion = driver.findElement(By.xpath("//span[@id='questionSelectBoxItText']"));
			selectQuestion.click();
			WebElement SelectQuestion = driver.findElement(By.xpath(".//*[@id='questionSelectBoxItOptions']/li[1]/a"));
			SelectQuestion.click();
			WebElement SecurityAnswer = driver.findElement(By.xpath("//input[@id='answer']"));
			SecurityAnswer.sendKeys("QA");
			WebElement ServiceAgreement = driver.findElement(By.xpath("//input[@id='acceptEULA']"));
			ServiceAgreement.click();
			WebElement Promotions = driver.findElement(By.xpath("//input[@id='receiveNews']"));
			Promotions.click();
			WebElement CreateMyAccount = driver.findElement(By.xpath("//a[@class='greenWhiteButton'][text()='Create my account']"));
			CreateMyAccount.click();
			WebElement SelectCountry = driver.findElement(By.xpath("//i[@id='locationSelectBoxItArrow']"));
			SelectCountry.click();
			WebElement SelectCountry1 = driver.findElement(By.xpath(".//*[@id='locationSelectBoxItOptions']/li[1]/a"));
			SelectCountry1.click();
			Thread.sleep(5000);
			WebElement SelectInstitutetype = driver.findElement(By.xpath(".//*[@id='institutionTypeSelectBoxItArrow']"));
			SelectInstitutetype.click();
			Thread.sleep(5000);
			WebElement SelectInstitutetype9 = driver.findElement(By.xpath(".//*[@id='institutionTypeSelectBoxItOptions']/li[2]/a"));
			SelectInstitutetype9.click();
			WebElement SelectMiles = driver.findElement(By.xpath("//i[@id='radiusSelectBoxItArrow']"));
			SelectMiles.click();
			Thread.sleep(5000);
			WebElement SelectMiles3 = driver.findElement(By.xpath(".//*[@id='radiusSelectBoxItOptions']/li[3]/a"));
			SelectMiles3.click();
			WebElement Zipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
			Zipcode.sendKeys("39327");
			WebElement Find = driver.findElement(By.xpath("//a[@class='greenWhiteButton']"));
			Find.click();
			WebElement Select = driver.findElement(By.xpath("//li//input[@id='7579'][@value='7579'][@name='institutionId']"));
			Select.click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)", "");
			WebElement Continue = driver.findElement(By.xpath("//a[@class='greenWhiteButton'][text()='Continue']"));
			Continue.click();
			WebElement HelloQA = driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']"));
			HelloQA.click();
			WebElement Signout = driver.findElement(By.xpath("//a[@rel='noopener noreferrer'][text()='Sign out']"));
			Signout.click();	
			System.out.println("Access_Code: " + Acc_code[i]);
			System.out.println("Student: " +shivam);
				}
			
			} 
			/*catch (Exception e)
			{
				System.out.println("Error is appearing in the Newuser_AccessCode() method");
			}*/
			
//	}
			
				
		// This method will create a new student through a Course key.	
			
		public void NewUser_Coursekey() throws InterruptedException
		{
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String CourseKey[] = new String[4];
			CourseKey[0] = "MTPP-VKGQ-22Q8";
			CourseKey[1] = "JHBL-GS2G-K4KP";
			CourseKey[2] = "E-DWK5ESBCY9KJ8";
			CourseKey[3] = "4LPQ-G1WQ-2C5K";
			
			String Co_Key = "MTPP-VKGQ-22Q8"; 
			
			for(i=1;i<=5;i++)
			{
				String shivam ="SSO" + System.currentTimeMillis() + "@swlearning.com" ;
				System.out.println("Student Number: " +i);
				
				driver.navigate().to("https://s-c-login.cengagebrain.com/cb/login.htm");
			
			WebElement	Coursekey = driver.findElement(By.xpath("//input[@id='accesscode'][@title='Enter your Access Code or Course Key']"));
			Coursekey.sendKeys(Co_Key);
			WebElement Register = driver.findElement(By.xpath("//a[@class='greenWhiteButton'][@role='button']"));
			Register.click();
			Thread.sleep(5000);
			WebElement	NewStudent_email = driver.findElement(By.xpath("//input[@id='createEmail']"));
			NewStudent_email.sendKeys(shivam);
			WebElement CreateNewAccount = driver.findElement(By.xpath("//button[@class='sInBtn btnSmall btn btn-primary'][text()='Create New Account']"));
			CreateNewAccount.click();
			Thread.sleep(10000);
			WebElement FirstName= driver.findElement(By.xpath("//input[@id='sFirstName']"));
			FirstName.sendKeys("QA");
			WebElement LastName= driver.findElement(By.xpath("//input[@id='sLastName']"));
			LastName.sendKeys("QA");
			WebElement Password = driver.findElement(By.xpath("//input[@id='sPassword']"));
			Password.sendKeys("A111111");
			WebElement CnfPassword = driver.findElement(By.xpath("//input[@id='sConfirmPassword']"));
			CnfPassword.sendKeys("A111111");
			Thread.sleep(10000);
			WebElement selectQuestion = driver.findElement(By.xpath(".//*[@id='answer']"));
			selectQuestion.click();
			
			WebElement SelectQuestion = driver.findElement(By.xpath("//select[@id='question'][@name='question']"));
			SelectQuestion.click();
			WebElement SelectQuestion1 = driver.findElement(By.xpath("//option[@class='ng-binding ng-scope'][@value='What is the name of your high school?']"));
			SelectQuestion1.click();
			WebElement SecurityAnswer = driver.findElement(By.xpath("//input[@id='answer']"));
			SecurityAnswer.sendKeys("QA");
			WebElement ServiceAgreement = driver.findElement(By.xpath(".//input[@id='userAgreement'][@type='checkbox']"));
			ServiceAgreement.click();
			WebElement CreateMyAccount = driver.findElement(By.xpath("//button[@class='btnLarge btn btn-primary']"));
			CreateMyAccount.click();
			
			Thread.sleep(5000);
			WebElement HelloQA = driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']"));
			HelloQA.click();
			WebElement Signout = driver.findElement(By.xpath("//a[@rel='noopener noreferrer'][text()='Sign out']"));
			Signout.click();	
			System.out.println("Student: " +shivam);
			System.out.println("Course Key:" +Co_Key);
			Thread.sleep(2000);
		} }
			
		
	
		// This method will create a new student
	public void NewUser() throws InterruptedException
	{
		Set_Cookies();
		//try{
		
		System.out.println("Welcome to New student creation flow, How many students you want to create :");
		System.out.println(" ");
		
		Scanner num = new Scanner(System.in);
		int studentcount = num.nextInt();
			
			for(i=1;i<=studentcount;i++)
			{
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				shivam ="SSO" + System.currentTimeMillis() + "@swlearning.com" ;
				System.out.println("Student Number: " +i);
				
				driver.navigate().to("https://qa-login.cengagebrain.com/cb/login.htm");
	/*	String df = "SSO" + System.currentTimeMillis() + "@swlearning.com" ; */
		
		WebElement NewStudent_email= driver.findElement(By.xpath("//input[@id='email'][@title='Email Address'][@name='email'][@class='req placeholder']"));
		NewStudent_email.sendKeys(shivam);
		WebElement CreateNewAccount = driver.findElement(By.xpath("//a[@id='standaloneRegistration_createNew'][@class='greenWhiteButton']"));
		CreateNewAccount.click();
		WebElement FirstName= driver.findElement(By.xpath("//input[@id='fname'][@title='First Name']"));
		FirstName.sendKeys("QA"+System.currentTimeMillis());
		WebElement LastName= driver.findElement(By.xpath("//input[@id='lname'][@title='Last Name']"));
		LastName.sendKeys("QA"+System.currentTimeMillis());
		WebElement Password = driver.findElement(By.xpath("//input[@id='password'][@title='Password']"));
		Password.sendKeys("A111111");
		WebElement CnfPassword = driver.findElement(By.xpath("//input[@id='confirmPassword'][@title='Confirm Password']"));
		CnfPassword.sendKeys("A111111");
		WebElement selectQuestion = driver.findElement(By.xpath("//span[@id='questionSelectBoxItText']"));
		selectQuestion.click();
		WebElement SelectQuestion = driver.findElement(By.xpath(".//*[@id='questionSelectBoxItOptions']/li[1]/a"));
		SelectQuestion.click();
		WebElement SecurityAnswer = driver.findElement(By.xpath("//input[@id='answer']"));
		SecurityAnswer.sendKeys("QA");
		WebElement Dropdownbirthyear = driver.findElement(By.xpath("//span[@id='birthYearSelectBoxIt']"));
	    Dropdownbirthyear.click();
	    WebElement Dropdownbirthyear1 = driver.findElement(By.xpath("//select[@id='birthYear']/option[15]"));
	    Dropdownbirthyear1.click();
	    //WebElement marketingoptout = driver.findElement(By.xpath("//input[@id='marketingOptOutYes']"));
	    //marketingoptout.click();
	  //WebElement TermsConditions = driver.findElement(By.xpath("//input[@id='acceptEULA']"));
	  //TermsConditions.click();
		
		
		WebElement ServiceAgreement = driver.findElement(By.xpath("//input[@id='acceptEULA']"));
		ServiceAgreement.click();
		//WebElement Promotions = driver.findElement(By.xpath("//input[@id='receiveNews']"));
		//Promotions.click();
		WebElement CreateMyAccount = driver.findElement(By.xpath("//a[@class='greenWhiteButton'][text()='Create my account']"));
		CreateMyAccount.click();
		WebElement SelectCountry = driver.findElement(By.xpath("//i[@id='locationSelectBoxItArrow']"));
		SelectCountry.click();
		WebElement SelectCountry1 = driver.findElement(By.xpath(".//*[@id='locationSelectBoxItOptions']/li[1]/a"));
		SelectCountry1.click();
		Thread.sleep(5000);
		/*WebElement SelectInstitutetype = driver.findElement(By.xpath(".//*[@id='institutionTypeSelectBoxItArrow']"));
		SelectInstitutetype.click();
		Thread.sleep(5000);
		WebElement SelectInstitutetype9 = driver.findElement(By.xpath(".//*[@id='institutionTypeSelectBoxItOptions']/li[9]/a"));
		SelectInstitutetype9.click();
		WebElement Zipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
		Zipcode.sendKeys("39327");
		WebElement Find = driver.findElement(By.xpath("//a[@class='greenWhiteButton']"));
		Find.click();
		Thread.sleep(5000);
		//JavascriptExecutor js1 = (JavascriptExecutor)driver;
		//js1.executeScript("window.scrollBy(0,15000)", "");*/
		/*WebElement Select1 = driver.findElement(By.xpath("//li//input[@id='5182'][@name='institutionId']"));
		Select1.click();
		Thread.sleep(400);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,2000)", "");
	
		WebElement Continue1 = driver.findElement(By.xpath("//a[@class='greenWhiteButton'][text()='Continue']"));
		Continue1.click();
		Thread.sleep(10000);*/
		WebElement SelectInstitutetype = driver.findElement(By.xpath(".//*[@id='institutionTypeSelectBoxItArrow']"));
		SelectInstitutetype.click();
		Thread.sleep(2000);
		WebElement SelectInstitutetype9 = driver.findElement(By.xpath(".//*[@id='institutionTypeSelectBoxItOptions']/li[2]/a"));
		SelectInstitutetype9.click();
		WebElement SelectMiles = driver.findElement(By.xpath("//i[@id='radiusSelectBoxItArrow']"));
		SelectMiles.click();
		Thread.sleep(2000);
		WebElement SelectMiles3 = driver.findElement(By.xpath(".//*[@id='radiusSelectBoxItOptions']/li[3]/a"));
		SelectMiles3.click();
		WebElement Zipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
		Zipcode.sendKeys("39327");
		WebElement Find = driver.findElement(By.xpath("//a[@class='greenWhiteButton']"));
		Find.click();
		Thread.sleep(2000);
		
		WebElement Select = driver.findElement(By.xpath("//li//input[@id='7579'][@value='7579'][@name='institutionId']"));
		Select.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		WebElement Continue = driver.findElement(By.xpath("//a[@class='greenWhiteButton'][text()='Continue']"));
		Continue.click();
		WebElement HelloQA = driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul/li[5]/a/span[1]"));
		HelloQA.click();
		WebElement Signout = driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul/li[5]/ul/li[7]/a"));
		Signout.click();	
		System.out.println(shivam);
		} }
		//catch(Exception e) {
		//	System.out.println("Error is appearing in NewUser() method.");
			
		//}
	//}
	
	
	public void Returning_User_Homepage() throws InterruptedException
	{
		NewUser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String CourseKey[] = new String[4];
		CourseKey[0] = "MTPP-VKGQ-22Q8";
		CourseKey[1] = "JHBL-GS2G-K4KP";
		CourseKey[2] = "E-DWK5ESBCY9KJ8";
		CourseKey[3] = "4LPQ-G1WQ-2C5K";
		String Acc_code[] = new String[5];
		Acc_code[0] = "PPGBQHJP382T3L";
		Acc_code[1] = "PPQZFN2P51PZ6N";
		Acc_code[2] = "PP2FZ9ZP5N7PSL";
		Acc_code[3] = "PP02LQBPGQ7L7P";
		
		//String student = "sso1505893847770@swlearning.com";
		for(i=0;i<=3;i++)
		{
			
		
		driver.navigate().to("https://s-c-login.cengage.com/cb/");
		WebElement Email = driver.findElement(By.xpath("//input[@id='emailId'][@class='form-control']"));
		Email.sendKeys(shivam);
		WebElement Password = driver.findElement(By.xpath(".//*[@id='password'][@type='password']"));
		Password.sendKeys("A111111");
		WebElement SignIn = driver.findElement(By.xpath("//button[@class='btn btn-primary'][@value='Sign In']"));
		SignIn.click();
		//WebElement MyCourse = driver.findElement(By.xpath("//li//a[@data-toggle='dropdown'][text()='My Courses']"));
		//MyCourse.click();
		//WebElement Course = driver.findElement(By.xpath("//a[@class='ng-binding'][text()='MT_03aug_001']"));
		//Course.click();
		
		
		
		
		
	//	WebElement Add_a_Course = driver.findElement(By.xpath(".//*[@id='authDashboard']/div[2]/div[1]/div/a"));
		//Add_a_Course.click();
		retryingFindClick(null);
		
		
		Thread.sleep(10000);
		WebElement Enter_coursekey_AccessCode = driver.findElement(By.xpath("//input[@id='accessCode'][@placeholder='Enter a Course Link, Access Code, or Course Key']"));
		Enter_coursekey_AccessCode.sendKeys(CourseKey[i]);
		WebElement Submit = driver.findElement(By.xpath("//button[@class='btn btn-primary'][text()='SUBMIT']"));
		Submit.click();
		Thread.sleep(5000);
		retryingFindClick1(null);
		Thread.sleep(10000);
		
		//WebElement Mydashboard = driver.findElement(By.xpath("//a[@ng-class='currentClass'][text()='My Dashboard']"));
		//Mydashboard.click();
		//WebElement Enter_Access_Code = driver.findElement(By.xpath(".//*[@id='accessCode']"));
		//Enter_Access_Code.sendKeys(Acc_code[i]);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div/a")).sendKeys("Acc_code[i]");
		WebElement submit = driver.findElement(By.xpath("//button[@class='submitBtn btn-success accessCodeBtn'][text()='Submit']"));
		submit.click();
		Thread.sleep(5000);
		WebElement HelloQA = driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']"));
		HelloQA.click();
		WebElement Signout = driver.findElement(By.xpath("//a[@rel='noopener noreferrer'][text()='Sign out']"));
		Signout.click();	
		System.out.println("Student: " +shivam);
		System.out.println("Course Key :" +CourseKey[i] );
		System.out.println("Access Code :" +Acc_code[i] );
		
	}
	
	}
	public  void AccessCode() throws InterruptedException
	{
		driver.navigate().to("https://qa-olradmin.cengage.com/olr/admin/index.jsp");
		Thread.sleep(5000);
		WebElement OLRBottomFrame;
		OLRBottomFrame = driver.findElement(By.xpath("//frame[@name='bottom']"));
		
		driver.switchTo().frame(OLRBottomFrame);
		
		WebElement UserName;
		UserName= driver.findElement(By.xpath("//input[@type='text'][@name='userName']"));
		UserName.sendKeys("anshuman.sharma@contractor.cengage.com");
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("Pihu51x51");
		WebElement LogIn = driver.findElement(By.xpath("//input[@class='button_style1']"));
		LogIn.click();
		String AccCode[] = new String[5];
		AccCode[0]="PPGBQHJP382T3L";
		AccCode[1]="PPQZFN2P51PZ6N";
		AccCode[2]="PP2FZ9ZP5N7PSL";
		AccCode[3]="PP02LQBPGQ7L7P";
	
		//WebElement Frame;
		//Frame = driver.findElement(By.xpath("//frame[@name='Left']"));
		
		//driver.switchTo().frame(Frame);
		//Thread.sleep(5000);
		
		
		for(int i=0;i<=3;i++)
		{
			
		Frame();
		
			
			WebElement AccessCode = driver.findElement(By.xpath("//td[@class='leftnavsubhead']/a[@href='/olr/accesscode.do']"));
			AccessCode.click();
			driver.switchTo().defaultContent();
			fram1();
			Frame2();
			Thread.sleep(4000);
			WebElement EnterAccessCode = driver.findElement(By.xpath("//input[@name='accessCode']"));
			EnterAccessCode.sendKeys(AccCode[i]);
			WebElement LookUp = driver.findElement(By.xpath("//input[@class='button_style1'][@name='lookup']"));
			LookUp.click();
			Thread.sleep(3000);
			WebElement Reset = driver.findElement(By.xpath("//input[@class='button_style1'][@name='reset']"));
			Reset.click();
			Alert alert = driver.switchTo().alert();
			alert.accept();
			driver.switchTo().defaultContent();
			fram1();
			//Frame();
			//Frame2();
		}
	
	}

	
	private void Frame2() {
		WebElement Frame2;
		Frame2 = driver.findElement(By.xpath("//frame[@name='Main']"));
		
		driver.switchTo().frame(Frame2);
		
	}

	private void Frame() {
		WebElement Frame;
		Frame = driver.findElement(By.xpath("//frame[@name='Left']"));
		
		driver.switchTo().frame(Frame);
		
	}

	private void fram1() {
		WebElement Frame1;
		Frame1 = driver.findElement(By.xpath("//frame[@name='bottom']"));
		
		driver.switchTo().frame(Frame1);
		
	}

	public boolean retryingFindClick(By by) {
        boolean result = false;
        int attempts = 0;
        while(attempts < 2) {
            try {
            	driver.findElement(By.xpath(".//*[@id='authDashboard']/div[2]/div[1]/div/a")).click();
            	
                result = true;
                break;
            } catch(StaleElementReferenceException e) {
            }
            attempts++;
        }
        return result;
        

	
        
	}
	
	public boolean retryingFindClick1(By by) {
        boolean result = false;
        int attempts = 0;
        while(attempts < 2) {
            try {
            	WebElement Enter_New_Course = driver.findElement(By.xpath(".//*[@id='preAuth']/div[2]/div/div/div[2]/div/div/button"));
            	Enter_New_Course.click();
            	
                result = true;
                break;
            } catch(StaleElementReferenceException e) {
            }
            attempts++;
        }
        return result;
} 
	void MindtapCourseCreation() throws InterruptedException
	{
		driver.navigate().to("https://s-c-login.cengage.com/cb/login.htm");
		WebElement Email = driver.findElement(By.xpath("//input[@id='emailId']")); 
		Email.sendKeys("sso_inst1994@swlearning.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']")); 
		password.sendKeys("A111111");
		Thread.sleep(5000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
        js1.executeScript("window.scrollBy(0,500)", "");
        WebElement signIn = driver.findElement(By.xpath("//button[@value='Sign In']"));
		signIn.click();
		System.out.println("How many course you want to create");
		Scanner Input = new Scanner(System.in);
		int k = Input.nextInt();
		for(int i=1;i<=k;i++)
		{
		WebElement Addproduct = driver.findElement(By.xpath("//input[@id='searchword'][@type='text']"));
		Addproduct.click();
		WebElement Addproduct1 = driver.findElement(By.xpath("//input[@id='searchword'][@type='text']"));
		Addproduct1.sendKeys("9781133353980");
		WebElement search = driver.findElement(By.xpath("//i[@class='sbIcon fa fa-search']"));
		search.click();
     //JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
        js1.executeScript("window.scrollBy(0,500)", "");
		WebElement createcourse = driver.findElement(By.xpath("//div[@class='courseManage']/div[2]/a[1]"));
		createcourse.click();
		WebElement Select = driver.findElement(By.xpath("//input[@id='createNewCourse']"));
		Select.click();
		WebElement Continue = driver.findElement(By.xpath("//a[@class='button']"));
		Continue.click();
		WebElement CourseName = driver.findElement(By.xpath(".//*[@id='courseName']"));
		CourseName.click();
		WebElement CourseName1 = driver.findElement(By.xpath(".//*[@id='courseName']"));
		String CourseName3 = "MT" +System.currentTimeMillis()+ "Course";
		CourseName1.sendKeys(CourseName3);
		//WebElement CreationDate = driver.findElement(By.xpath("//input[@id='calendar1']"));
		//CreationDate.click();\
		 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		    Date date = new Date();  
		   String Startdate= formatter.format(date);
		 WebElement CreationDate = driver.findElement(By.xpath("//input[@id='beginDate']"));
			CreationDate.click();
			WebElement CreationDate1 = driver.findElement(By.xpath("//input[@id='beginDate']"));
			CreationDate1.sendKeys(Startdate);
			 WebElement EndDate = driver.findElement(By.xpath("//input[@id='endDate']"));
			 EndDate.click();
			 Calendar date1 = Calendar.getInstance();
			    date1.setTime(new Date());
			    Format f = new SimpleDateFormat("MM/dd/2019");
			    String Enddate1 = (f.format(date.getTime()));
			    WebElement EndDate2 = driver.findElement(By.xpath("//input[@id='endDate']"));
				 EndDate2.sendKeys(Enddate1);
				 js1.executeScript("window.scrollBy(0,300)", "");
				 WebElement CreateCourse = driver.findElement(By.xpath("//a[@class='button']"));
				 CreateCourse.click();
				 WebElement course = driver.findElement(By.xpath(".//*[@id='courseConfirm']/div[2]/div[2]/p[2]/a[1]"));
				String MTCourse = course.getText();
				System.out.println("Course Name:" +CourseName3);
				System.out.println("Course URL:" +MTCourse);
		
				WebElement instructordashboard = driver.findElement(By.xpath("//a[@data-track='Instructor Resource Center - Instructor SSO']"));
				instructordashboard.click();
		}
				//int length = MTCourse.length();
				//System.out.println(length);
	}
		void ltrcourse() throws InterruptedException
		{
			driver.navigate().to("https://s-c-login.cengage.com/cb/login.htm");
			WebElement Email = driver.findElement(By.xpath("//input[@id='emailId']")); 
			Email.sendKeys("sso_inst1994@swlearning.com");
			WebElement password = driver.findElement(By.xpath("//input[@id='password']")); 
			password.sendKeys("A111111");
			Thread.sleep(5000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			
	        js1.executeScript("window.scrollBy(0,500)", "");
	        WebElement signIn = driver.findElement(By.xpath("//button[@value='Sign In']"));
			signIn.click();
			System.out.println("How many course you want to create");
			Scanner Input = new Scanner(System.in);
			int k = Input.nextInt();
			
			for(int i=1;i<=k;i++)
			{
			WebElement Addproduct = driver.findElement(By.xpath("//input[@id='searchword'][@type='text']"));
			Addproduct.click();
			WebElement Addproduct1 = driver.findElement(By.xpath("//input[@id='searchword'][@type='text']"));
			Addproduct1.sendKeys("9781305580268");
			WebElement search = driver.findElement(By.xpath("//i[@class='sbIcon fa fa-search']"));
			search.click();
	     //JavascriptExecutor js1 = (JavascriptExecutor) driver;
			
	        js1.executeScript("window.scrollBy(0,500)", "");
			WebElement createcourse = driver.findElement(By.xpath("//a[@href='createCourse.htm?unformattedISBN13=9781285860169&iacISBN=9781305580268&componentISBN=9781305580251&type=4LT']"));
			createcourse.click();
			WebElement Select = driver.findElement(By.xpath("//input[@id='createNewCourse']"));
			Select.click();
			WebElement Continue = driver.findElement(By.xpath("//a[@class='button']"));
			Continue.click();
			WebElement CourseName = driver.findElement(By.xpath(".//*[@id='courseName']"));
			CourseName.click();
			WebElement CourseName1 = driver.findElement(By.xpath(".//*[@id='courseName']"));
			String CourseName3 = "4LTR" +System.currentTimeMillis()+ "Course";
			CourseName1.sendKeys(CourseName3);
			//WebElement CreationDate = driver.findElement(By.xpath("//input[@id='calendar1']"));
			//CreationDate.click();\
			 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
			    Date date = new Date();  
			   String Startdate= formatter.format(date);
			 WebElement CreationDate = driver.findElement(By.xpath("//input[@id='beginDate']"));
				CreationDate.click();
				WebElement CreationDate1 = driver.findElement(By.xpath("//input[@id='beginDate']"));
				CreationDate1.sendKeys(Startdate);
				 WebElement EndDate = driver.findElement(By.xpath("//input[@id='endDate']"));
				 EndDate.click();
				 Calendar date1 = Calendar.getInstance();
				    date1.setTime(new Date());
				    Format f = new SimpleDateFormat("MM/dd/2019");
				    String Enddate1 = (f.format(date.getTime()));
				    WebElement EndDate2 = driver.findElement(By.xpath("//input[@id='endDate']"));
					 EndDate2.sendKeys(Enddate1);
					 js1.executeScript("window.scrollBy(0,300)", "");
					 WebElement CreateCourse = driver.findElement(By.xpath("//a[@class='button']"));
					 CreateCourse.click();
					 WebElement course = driver.findElement(By.xpath(".//*[@id='courseConfirm']/div[2]/div[2]/p[2]/a[1]"));
					String MTCourse = course.getText();
					System.out.println("Course Name:" +CourseName3);
					System.out.println("Course URL:" +MTCourse);
			
					WebElement instructordashboard = driver.findElement(By.xpath("//a[@data-track='Instructor Resource Center - Instructor SSO']"));
					instructordashboard.click();
			}
			
			
		}
			@SuppressWarnings("resource")
			void CnowCourseCreation() throws InterruptedException 
			{
				driver.navigate().to("https://s-c-login.cengage.com/cb/login.htm");
				WebElement Email = driver.findElement(By.xpath("//input[@id='emailId']")); 
				Email.sendKeys("sso_inst1994@swlearning.com");
				WebElement password = driver.findElement(By.xpath("//input[@id='password']")); 
				password.sendKeys("A111111");
				Thread.sleep(5000);
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				
		        js1.executeScript("window.scrollBy(0,500)", "");
		        WebElement signIn = driver.findElement(By.xpath("//button[@value='Sign In']"));
				signIn.click();
				System.out.println("How many Cnow Course you want to create");
				Scanner Input = new Scanner(System.in);
				int k = Input.nextInt();
				for(int i=1;i<=k;i++)
				{
				WebElement Addproduct = driver.findElement(By.xpath("//input[@id='searchword'][@type='text']"));
				Addproduct.click();
				WebElement Addproduct1 = driver.findElement(By.xpath("//input[@id='searchword'][@type='text']"));
				Addproduct1.sendKeys("9781111300425");
				WebElement search = driver.findElement(By.xpath("//i[@class='sbIcon fa fa-search']"));
				search.click();
		     //JavascriptExecutor js1 = (JavascriptExecutor) driver;
				
		        js1.executeScript("window.scrollBy(0,500)", "");
		        WebElement createcourse = driver.findElement(By.xpath(" //span[@class='restitle']"));
				createcourse.click(); 
				//Actions action= new Actions(driver);
				//action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
				Thread.sleep(10000);
				WebElement Continue = driver.findElement(By.xpath("//a[@id='COURSES_LINK']"));
				Continue.click();
		     
				
			}
	
			
		
	}
			

			public void google() throws InterruptedException {
				
				driver.navigate().to("https://www.google.com");
				Thread.sleep(5000);
				WebElement shivam = driver.findElement(By.xpath("//input[@id='gs_taif0']"));
				shivam.click();
				shivam.sendKeys("sdfsd");
				//driver.findElement(By.xpath("//input[@id='gs_taif0']")).sendKeys("Hello");
				
				
			}
			public void NewUser_CoursekeyInt() throws InterruptedException
			{
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				/*String CourseKey[] = new String[4];
				CourseKey[0] = "MTPP-VKGQ-22Q8";
				CourseKey[1] = "JHBL-GS2G-K4KP";
				CourseKey[2] = "E-DWK5ESBCY9KJ8";
				CourseKey[3] = "4LPQ-G1WQ-2C5K";*/
				
				String Co_Key = "MTPP-GHXP-QWRV"; 
				
				for(i=1;i<=1;i++)
				{
					String shivam ="SSO" + System.currentTimeMillis() + "@swlearning.com" ;
					System.out.println("Student Number: " +i);
					
					driver.navigate().to("https://int-login.cengagebrain.com/cb/login.htm");
				
				WebElement	Coursekey = driver.findElement(By.xpath("//input[@id='accesscode'][@title='Enter your Access Code or Course Key']"));
				Coursekey.sendKeys(Co_Key);
				WebElement Register = driver.findElement(By.xpath("//a[@class='greenWhiteButton'][@role='button']"));
				Register.click();
				Thread.sleep(5000);
				}
	
	}}
	