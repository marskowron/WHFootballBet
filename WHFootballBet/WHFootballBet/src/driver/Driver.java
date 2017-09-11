package driver;

import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {

	
	public static WebDriver Instance;
	//private static final Logger log = LogManager.getLogger(Driver.class.getName());
	public static String baseURL;
	
	public static void Initialize() {
		
		//initialazing instance of driver
		Instance = new ChromeDriver();
		Instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Instance.manage().window().maximize();
		
		baseURL = "http://sports.williamhill.com/betting/en-gb"; 
		
		//going to selected website
		Instance.get(baseURL);
		String currentUrl = Driver.Instance.getCurrentUrl();
		System.out.println(currentUrl);			
	}
	
	public static void closure () {
		//closing driver after test
		Driver.Instance.quit();
	}
}
