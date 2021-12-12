package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebBrowser {

    private static WebDriver driver;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @Given("^I launch the chrome browser$")
    public void i_launch_the_chrome_browser() {


        driver.get("https://www.selenium.dev/");
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown() {

        driver.quit();
    }
}
