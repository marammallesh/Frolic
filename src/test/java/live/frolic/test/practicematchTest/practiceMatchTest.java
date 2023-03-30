package live.frolic.test.practicematchTest;

import static live.frolic.util.Constants.*;

import live.frolic.base.BaseFrolicAutomationPage;
import live.frolic.login.pages.FrolicUserLoginPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.test.BaseTestAutomation;
import org.apache.log4j.Logger;
import live.frolic.usersSearchPages.usersSearchPage;
import live.frolic.practiceMatchPages.practiceMatchPage;
import live.frolic.battles.pages.FrolicBattlePlayNowPage;

public class practiceMatchTest extends BaseTestAutomation {

    public static final Logger logger = Logger.getLogger(BaseTestAutomation.class.getName());

    private practiceMatchPage objPracticeMatch = null;
    private FrolicBattlePlayNowPage objBattlePlay = null;

    @BeforeClass
    @Parameters({"deviceIndex"})
    public void initClass(String deviceIndex) throws Exception {
        logger.info("Starting of initClass method in BattlesTest");

        this.objPracticeMatch = new practiceMatchPage(driver);
        this.objBattlePlay = new FrolicBattlePlayNowPage(driver);

        logger.info("Ending of initClass method in BattlesTest");
    }

    @Test(priority = 1, description = "Verifying Game Search")
    @Description("Verifying Game Search")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Verifying Game Search")
    public void verifyGameSearch() throws InterruptedException
        {
            logger.info("Sarting Game Search method");

                try {
                        objPracticeMatch.clickOnGametab();
                        Assert.assertEquals(objPracticeMatch.getGameTab(), expectedAssertionsProp.getProperty(GAME_TAB));

                        objPracticeMatch.clickOnSearchBox(GAME_NAME);
                        Assert.assertEquals(objPracticeMatch.getSearchBox(), expectedAssertionsProp.getProperty(GAME_NAME_LABEL));

                    }
                catch (Exception e)
                    {

                        Assert.fail("Exception occured while testing Practice Match:" + e.getMessage());
                        logger.error("Exception occured while verifying Practice Match:", e);
                    }
                logger.info("Ending game Search method");
        }

    @Test(priority = 1, description = "Verifying Practice match")
    @Description("Verifying Practice Match")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Verifying Practice match")
    public void verifyPracticeMatch() throws InterruptedException
        {
            logger.info("Starting Practice match method");

            try {
                objBattlePlay.clickOnGameCard();
                Assert.assertEquals(objBattlePlay.getGameNameText(), expectedAssertionsProp.getProperty(GAME_NAME_LABEL));

                objPracticeMatch.clickOnMoreInfo();
                // Assert.assertEquals(objPracticeMatch.getMoreInfo(), expectedAssertionsProp.getProperty(MOREINFO));
            } catch (Exception e)
            {
                Assert.fail("Exception occured while testing Practice Match:" + e.getMessage());
                logger.error("Exception occured while verifying Practice Match:", e);
            }
            logger.info("Ending practice match method");
        }
}
