package FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		String baseURL= "https://google.com";
		String expectedTitle= "Google";
		String expectedUrl= "google.co.in";
		
		/*System.setProperty("webdriver.gecko.driver","E://Selenium training//Google_Login//Executable//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();*/
		
		 /*System.setProperty("webdriver.ie.driver","E://Selenium training//Google_Login//Executable//IEDriverServer.exe");
      WebDriver driver = new InternetExplorerDriver();*/
		 
		/* WebDriver driver = new SafariDriver();*/
		
		/*WebDriver driver = new HtmlUnitDriver();*/
		 
		
		System.setProperty("webdriver.chrome.driver", "E://Selenium training//Google_Login//Executable//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get(baseURL);
		System.out.println("Open Browser");
		driver.manage().window().maximize();
		System.out.println("Maximize window");
		String actualTitle= driver.getTitle();
		System.out.println("Title Verification");
		if(!expectedTitle.equals(actualTitle))
		{
			System.out.println("Title: Fail");
			System.out.println(expectedTitle);
		}
		String actualURL=driver.getCurrentUrl();
		System.out.println("URL Verification");
		if(!actualURL.contains(expectedUrl))
		{
			System.out.println("URL: Fail");
			System.out.println(expectedUrl);
		}
		Thread.sleep(5000);
		driver.close();
		System.out.println("Close Window");
		
		

	}

}
