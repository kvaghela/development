package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs {

    private Belly belly;

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly = new Belly();
        belly.eat(cukes);
    }

    @Then("^I should have digested (\\d+) items")
    public void I_should_have_digested_items(int cukes) throws Throwable {
        Assert.assertEquals(cukes, belly.getDigestor().getDigestedItems());
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//   TODO     throw new PendingException();
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//   TODO     throw new PendingException();
    }

    @Then("^I go to sleep for (\\d+) seconds$")
    public void i_go_to_sleep_for_seconds(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
