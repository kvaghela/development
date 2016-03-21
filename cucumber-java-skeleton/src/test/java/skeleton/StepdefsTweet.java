package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
        driver.close();
    }

    @Given("^I am on the twitter home page$")
    public void i_am_on_the_twitter_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the “Compose new Tweet\\.\\.\\.” text field$")
    public void i_click_on_the_Compose_new_Tweet_text_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter in the message “Hello, this is my first message”$")
    public void i_enter_in_the_message_Hello_this_is_my_first_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click “Tweet”$")
    public void i_click_Tweet() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I wait for a few seconds$")
    public void i_wait_for_a_few_seconds() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see “Hello, this is my first message”$")
    public void i_should_see_Hello_this_is_my_first_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
