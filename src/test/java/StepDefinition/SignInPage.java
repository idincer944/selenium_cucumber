package StepDefinition;

import io.cucumber.java.en.When;
import static pages.SignInPage.*;

public class SignInPage {
    @When("^User successfully enters the login details$")
    public void user_logs_in_to_login_page(){
        sendKeys_username();
        sendKeys_password();
        click_login_btn();
    }
}
