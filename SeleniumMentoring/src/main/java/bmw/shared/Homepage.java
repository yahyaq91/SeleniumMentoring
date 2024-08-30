package bmw.shared;

import base.BasePage;
import bmw.pom.BuildYourOwnPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//ul[@class='globalnav-primary__links']//a[@href='/build-your-own.html']")
    public WebElement buildYourOwn;

    @FindBy(xpath = "//h1[@class='headline-4']")
    public WebElement buildCarConfirmation;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }
    public BuildYourOwnPage clickBuildYourOwnPage(){
        clickOnElement(buildYourOwn);

        return new BuildYourOwnPage();
    }
}
