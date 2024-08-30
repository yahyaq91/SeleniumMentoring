package bmw.pom;

import bmw.shared.Homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnPage extends Homepage {
    @FindBy(xpath = "//li[@class='btn-navbar']//button[contains(text(),'BMW M')]")
    public WebElement bmwM;
    @FindBy(xpath = "//div//a[@href='#/series/M4/coupe']")
    public WebElement bmwM4;
    @FindBy(xpath = "//div//a[@href='#/studio/22DC']")
    public WebElement m4CompetitionXDrive;
    @FindBy(xpath = "//*[@id=\"byo-studio-rail-exterior\"]//div[7]")
    public WebElement dravitGrey;
    @FindBy(xpath = "//input[@id='Wheels_selector']")
    public WebElement wheelsSelector;
    @FindBy(xpath = "//div[@class='byo-rail-option-base selected']")
    public WebElement mDoubleSpokeBiColorWheels;
    @FindBy(xpath = "//a[@class=\"button-quote byo-core-type label-1 theme-core\"]")
    public WebElement getQuote;

    public BuildYourOwnPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickBMWMButton(){
        clickOnElement(bmwM);
    }
    public void clickBMWM4Option(){
        clickOnElement(bmwM4);
    }
    public void clickM4CompetitionXDrive(){
        clickOnElement(m4CompetitionXDrive);
    }
    public void selectColorDravitGrey(){
        clickOnElement(dravitGrey);
    }
    public void selectWheels(){
        clickOnElement(wheelsSelector);
    }
    public void selectWheelsColor(){
        clickOnElement(mDoubleSpokeBiColorWheels);
    }
    public void clickGetQuote(){
        clickOnElement(getQuote);
    }
}
