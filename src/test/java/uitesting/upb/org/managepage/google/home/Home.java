package uitesting.upb.org.managepage.google.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

/**
 * @autor Marcelo Garay
 */
public class Home extends BasePage {

    @FindBy(xpath = "//div[@id='Mateo']//input[@name='nombreCuenta']")
    private WebElement searchFillCuenta;

    @FindBy(id = "CrearCuenta")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id='Mateo']//button[@id='btnEditar']")
    private WebElement saveButton;

    public Home fillCuenta(String text){
        Events.fillField(searchFillCuenta, text);
        return this;
    }

    public void clickAddAccountButton(){
        Events.click(searchButton);
    }
    public Home clearCuenta(){
        Events.blankField(searchFillCuenta);
        return this;
    }
    public void clickSaveAccountButton(){
        Events.click(saveButton);
    }

    public void addAccountAndRenameButton(String text){
        clickAddAccountButton();
        clearCuenta().fillCuenta(text).clickSaveAccountButton();
    }
}
