import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "X:\\AppHangar\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
    }
}
