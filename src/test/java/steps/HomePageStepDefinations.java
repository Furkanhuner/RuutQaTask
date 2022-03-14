package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.apache.log4j.Logger;
import pages.HomePage;

import java.util.List;
import java.util.Map;

public class HomePageStepDefinations extends HomePageSteps {

    HomePage homePage;
    private Logger logger = Logger.getLogger(HomePageStepDefinations.class);

    @Given("User try to open defined Url")
    public void userTryToOpenDefinedUrl() {
        goToDefinedUrl();
        logger.info("User try to open defined Url");
    }

    @And("User try to click apply button")
    public void userTryToClickApplyButton() {
        waitForElementAndClick(homePage.APPLY_BUTTON);
        logger.info("User try to click apply button");
    }

    @And("User try to click button and checks message")
    public void userTryToClickButtonAndChecksMessage(List<Map<String, String>> elementsList){
        Map<String, String> parameters = elementsList.get(0);
        clickButtonAndCheckMessage(parameters.get("button"),parameters.get("message"));
    }

}
