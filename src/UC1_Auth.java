import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Authorized {

    @Test
    void testCheckLogin() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:/Driverweb/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");	

        // Close the browser
        driver.quit();
    }
}