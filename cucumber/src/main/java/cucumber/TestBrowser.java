package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBrowser {
	
	public static void main(String arg[]) {
		
	
System.setProperty("webdriver.chrome.driver", "C:/Maven Projects/cucumber framework/cucumber/resource/drivers/chromedriver.exe");
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--incognito");
WebDriver obj=new ChromeDriver(opt);
//System.out.println("hi");
obj.get("https://www.google.com");
	}

	}