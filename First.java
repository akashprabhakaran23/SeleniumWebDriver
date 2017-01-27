import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the ChromeDriver driver
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.google.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.google.com");

		//Wait for 10 Sec
		
			Thread.sleep(10000);
		
		
        // Close the drivers
        driver.quit();
    }
}

