package Lotus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static Lotus.DriverManager.driver;

public class LogInStepDefs extends DriverManager
{

   @Before
   public void oprnBr()
   {
       openBrowser();
   }
   @After
   public void closeBr(){
       closBrowser();
   }

    @Given("^I am on log in page$")
    public void i_am_on_log_in_page()
    {

    }

    @When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_valid_username_and_password(String username, String password)
    {
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("btnLogin")).click();

        try
        {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
        catch (Exception e){
        }


    }

    @Then("^I should be able to see homepage\"([^\"]*)\"$")
    public void iShouldBeAbleToSeeHomepage(Boolean result) {
        boolean exp = result ;
        boolean actual;

          actual= driver.findElement(By.className("heading3")).getText().contains("Welcome To Manager's Page of Guru99 Bank");

        Assert.assertTrue(result.equals(actual));

    }






}

