package Lotus;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 29/11/2016.
 */
public class DriverManager
{ protected static WebDriver driver;


    public DriverManager()
    {
        PageFactory.initElements(driver,this );
    }

    public void openBrowser (){
        String browser = "chrome";
        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver" , "src\\test\\Resources\\MultiBrowser\\chromedriver.exe");
        }
        else if (browser.equalsIgnoreCase("ie"))
        {

            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\MultiBrowser\\IEDriverServer.exe");
        }
        else
        {
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/v4/");

    }

    public void closBrowser()
    {
        driver.quit();
    }
}
