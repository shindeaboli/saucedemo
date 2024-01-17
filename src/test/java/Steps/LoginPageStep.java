package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass{
		static LoginPage loginpage;

		@Given("user is on login page")
		public void user_is_on_login_page() {
			BaseClass.initialization();
		}

		@When("user enter valid username and password")
		public void user_enter_valid_username_and_password() {
			loginpage = new LoginPage();
			loginpage.enterUsenameAndPassword("standard_user", "secret_sauce");
		}

		@Then("user click on login button")
		public void user_click_on_login_button() {
			loginpage.clickOnLoginButton();
		}
	}


