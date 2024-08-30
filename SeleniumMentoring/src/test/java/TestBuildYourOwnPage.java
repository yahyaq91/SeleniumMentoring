import base.BasePage;
import bmw.pom.BuildYourOwnPage;
import bmw.shared.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBuildYourOwnPage extends BasePage {
    @Test
    public void testBuildYourOwn(){
        Homepage homepage = new Homepage();
        BuildYourOwnPage buildYourOwnPage = homepage.clickBuildYourOwnPage();
        buildYourOwnPage.clickBMWMButton();
        buildYourOwnPage.clickBMWM4Option();
        buildYourOwnPage.clickM4CompetitionXDrive();
        buildYourOwnPage.clickGetQuote();
//        buildYourOwnPage.selectColorDravitGrey();
//        buildYourOwnPage.selectWheels();
//        buildYourOwnPage.selectWheelsColor();

        Assert.assertTrue(isElementInvisible(buildYourOwnPage.buildCarConfirmation));

    }
}
