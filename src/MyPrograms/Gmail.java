package MyPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	public WebDriver driver;
	
	public void openurl() {
		
		driver = new ChromeDriver();
		driver.get("http://gmail.com");	
		
	}
	
	public void login() {
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		

	}

}
