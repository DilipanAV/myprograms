package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_OpenBrowser {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();  		 // Driver manager activating chrome driver.     -------------->      "WebDriverManager"
		WebDriver wd = new ChromeDriver();				 // web driver is return type for chrome driver. -------------->      "WebDriver"
														 // and creating object "wd" for chrome driver to access further.
		
		wd.get("https://www.google.com");				 // "", https:// <-- must	
	}

}
		
	}

}
