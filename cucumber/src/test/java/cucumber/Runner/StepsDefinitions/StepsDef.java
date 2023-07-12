package cucumber.Runner.StepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;

public class StepsDef {
	
	@Given("^Open google page$")
	public void openGoogle()
	{
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", "./src/main/java/drivers/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver obj=new ChromeDriver(opt);
		
		obj.manage().window().maximize();
		//Assert.assertEquals(obj.getTitle(),"Hello");
		System.out.println("hiiiiiiiiii");
		obj.get("https://www.google.com");
		
	}

}
