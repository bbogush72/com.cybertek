import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondSelenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "X:\\AppHangar\\Selenium Dependencies\\drivers\\chomedriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://maven.apache.org");
    }
}


/*
above code is only running `WebDriver driver = new ChromeDriver();`

and this `webdriver.chrome.driver` should point to `chomedriver.exe` as part of setup
This is the place you change `WebDriver driver = new FirefoxDriver();` if you want to run on firefox
 */