package uitesting.upb.org.managepage.google.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

/**
 * @autor Marcelo Garay
 */
public class Home extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'DEMO_KEY Rate Limits')]")
    private WebElement demoKey;

    @FindBy(xpath = "//a[contains(text(),'Authentication')]")
    private WebElement authentication;

    @FindBy(xpath = "//li[contains(text(),'30')]")
    private WebElement hourly30;

    @FindBy(xpath = "//li[contains(text(),'50')]")
    private WebElement daily50;


    @FindBy(id = "tocify-header1")
    private WebElement listing;

    public void clickListingButton(){
        Events.click(listing);
    }
    public void clickDemoButton(){
        Events.click(demoKey);
    }
    public void clickAuthenticationButton(){
        Events.click(authentication);
    }
    public void searchQuizButton(){
        clickListingButton();
        clickListingButton();
        clickAuthenticationButton();
        clickDemoButton();
        String h30=hourly30.getText();
        String d50=daily50.getText();
        System.out.println("El texto buscado es: "+h30+" y "+d50);

    }
}
