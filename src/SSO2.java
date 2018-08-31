import org.testng.annotations.Test;

public class SSO2 extends Flows {
	//public static void main(String[] args)throws InterruptedException {
		
	
	
	@Test
	public void createUsers(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivamsohane\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		Flows run;
		run = new Flows();
		
		//run.Set_Cookies();
		//run.Random();
		//run.AccessCode();
		
		try {
			run.NewUser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		//run.Newuser_AccessCode();
		
		//run.NewUser_Coursekey();
	
	//run.Returning_User_Homepage();
		

		
				
		
	


}
