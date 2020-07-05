package commonMethods;


import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.internal.BaseClassFinder;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class commonMethods {

    static Logger logger = LogManager.getLogger(BaseClassFinder.class.getName());




    @Given("^Traveller invokes Goibibo Home Page$")
    public static void main(){
    //public static void openUrl() {
        System.setProperty("webdriver.chrome.driver", "D://Java/chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Webdriver is instantiated");
        driver.get("https://www.goibibo.com/");
    }



}
