package SITS;

import org.openqa.selenium.chrome.ChromeDriver;
import 

public class first_web_drive {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//jerri//Desktop\\chromedriver");
		ChromeDriver driver=new ChromeDriver ();
		driver.get("https://www.google.com");
		driver.findElementByLinkText("https://mail.google.com/mail/?tab=rm&authuser=0").click();
		driver.findElementByLinkText("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-n-en").click();
		driver.findElementByName("firstname").sendKeys("jerri");
		driver.findElementByName("lastName").sendKeys("mengstu");
		driver.findElementByName("Username").sendKeys("jmen1857");
		driver.findElementByName("Passwd").sendKeys("123jeme");
		driver.findElementByName("ConfirmPasswd").sendKeys("123jeme");
		
		
		
	}
	
}

/*
import org.openqa.selenium.safari.SafariDriver;

public class first_web_drive {


	public static void main(String[] args) {
		
	System.setProperty("webdriver.Safari.driver", "//Users//jerri//bin//safaridriver");
	SafariDriver driver=new SafariDriver ();
	driver.get("https://www.facebook.com");
	
	//driver.findElement(By.name("firstname")).sendKeys("jerri");
	

	}

}
*/