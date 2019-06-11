package uitesting.upb.org.stepDefinitios;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.google.home.Home;

public class ProjectStepdefs {
    private Home home;

    @Given("^Page loaded$")
    public void pageLoaded() {
        System.out.println("Load home page");
        home = LoadPage.loadProjectHome();
    }

    @And("^Create new Account$")
    public void createNewAccount() {
        System.out.println("Add account");
        home.clickAddAccountButton();
    }

    @And("^Rename main Account$")
    public void renameMainAccount() {
        System.out.println("Add account");
        home.clearCuenta().fillCuenta("juan");

    }

    @Then("^Save Account$")
    public void saveAccount() {
        System.out.println("Save account");
        home.clickSaveAccountButton();
    }
}
