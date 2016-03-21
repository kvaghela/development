package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepdefsTweet {
    WebDriver driver = new FirefoxDriver();


    @Given("^I go to “http://www\\.twitter\\.com”$")
    public void i_go_to_http_www_twitter_com() throws Throwable {
        driver.get("http://www.twitter.com");
        driver.findElement(By.className("StreamsLogin")).click();
    }

    @Given("^I enter in the “username” field “myusername”$")
    public void i_enter_in_the_username_field_myusername() throws Throwable {
        driver.findElement(By.xpath("//form[@data-element='login']/div[@class='LoginForm-input LoginForm-username']/input")).sendKeys("gary");
    }

    @Given("^I enter in the “password” field “password(\\d+)”$")
    public void i_enter_in_the_password_field_password(int arg1) throws Throwable {
        driver.findElement(By.xpath("//form[@data-element='login']/div[@class='LoginForm-input LoginForm-password']/input")).sendKeys("gary2222");
    }

    @Given("^I click on “Sign In”$")
    public void i_click_on_Sign_In() throws Throwable {
        driver.findElement(By.xpath("//form[@data-element='login']/div[@class='LoginForm-rememberForgot']/label/input")).click();

        driver.findElement(By.xpath("//form[@data-element='login']/input[@value='Log in']")).click();

    }

    @Then("^I close browser$")
    public void i_close_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }
}
