package goibiboTests;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class sample {
    @Given("^Traveller invokes Goibibo Home Page$")
    public static void sample(){
        //public static void openUrl() {
        System.setProperty("webdriver.chrome.driver", "D://Java/chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Webdriver is instantiated");
        driver.get("https://www.goibibo.com/");
    }
}
