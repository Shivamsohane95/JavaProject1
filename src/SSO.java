

public class SSO extends Flows {
	public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivamsohane\\Desktop\\Selenium\\new chromedriver\\chromedriver_win32\\chromedriver.exe");
		Flows run;
		run = new Flows();
		
		
		run.Set_Cookies();
		//run.Random();
		//run.AccessCode();
		
		
		//run.NewUser();
		
		run.Newuser_AccessCode();
		
		//run.NewUser_Coursekey();
		//run.NewUser_CoursekeyInt();
	
	//run.Returning_User_Homepage();
		
		//run.MindtapCourseCreation();
		//run.ltrcourse();
		//run.CnowCourseCreation();
		//run.google();
		
				
		
	

}
}
