package seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orangelogin {
     @Test
	public static void VerifyloginpageTitle(){
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("OrangeHRM")){
			 System.out.println("title is the matched");
		 }
		 else {
			 System.out.println("title is mitchmatched");
		 }
		
boolean b1=driver.findElement(By.xpath("//img[@src='/webres_5fee89a90600f2.94309009/themes/default/images/login/logo.png']")).isDisplayed();
  Assert.assertTrue(b1, "logo is displayed on loginpage");
	//Assert.assertTrue(b1);
 System.out.println(b1);
	
}
}
