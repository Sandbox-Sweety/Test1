package htmldom;

public class UIMap {

	//CirroSecure Login Page
	public static final String SignInPage_Title = "//*[contains(text(), 'Sign in')]";
	public static final String Email_TextBox = "//[@id='user_email2']";
	public static final String Password_TextBox = "id='user_password'";
	public static final String SignIn_Button = "value='Sign in'";
	
	//Home Page with Dashboard displaying installed Cloud Apps detail
	public static final String DashboardPageTitle = "//p[contains(text(), 'Signed in successfully.')]";
	public static final String AddCloudApp_Button = "//a[contains(text(), 'Add a Cloud App')]"; 
	public static final String SignOut_Button = "///a[contains(text(), 'Sign Out')]/";
}
