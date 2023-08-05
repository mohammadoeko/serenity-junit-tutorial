package serenityswag.authenication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {


    @Step("Log in as a standard user")
    public void asStandardUser() {

        openUrl("https://www.saucedemo.com/v1/index.html");

        $("[data-test='username']").sendKeys("standard_user");
        $("[data-test='password']").sendKeys("secret_sauce");
        $("[id='login-button']").click();
    }
}
