package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class WebBrowser {

    private static WebDriver driver;
    Properties properties;

    @Before
    public void setup() throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        FileReader reader=new FileReader("configuration/config.properties");
        properties = new Properties();
        properties.load(reader);
    }

    @Given("^I launch the chrome browser$")
    public void i_launch_the_chrome_browser() {


        driver.get("https://www.selenium.dev/");
        System.out.println(driver.getTitle());
    }

    @When("^I enter the default login credentials$")
    public void i_enter_the_default_login_credentials() {
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
    }

    @After
    public void tearDown() {

        driver.quit();
    }
}
