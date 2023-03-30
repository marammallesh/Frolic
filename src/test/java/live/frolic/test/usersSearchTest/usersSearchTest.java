package live.frolic.test.usersSearchTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.base.BaseFrolicAutomationPage;
import live.frolic.test.BaseTestAutomation;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import static live.frolic.util.Constants.*;
import static live.frolic.util.Constants.USER_DATA;
import live.frolic.usersSearchPages.usersSearchPage;

public class usersSearchTest extends BaseTestAutomation {

    public static final Logger logger = Logger.getLogger(BaseTestAutomation.class.getName());

    private usersSearchPage objUserSearch = null;

    @BeforeClass
    @Parameters({"deviceIndex"})
    public void initClass(String deviceIndex) throws Exception
        {
            logger.info("Starting of initClass method in User Search");

            this.objUserSearch = new usersSearchPage(driver);

            logger.info("Ending the initClass method in usersearch");
        }

    @Test(priority = 0, description = "Verifying Useruearch")
    @Description("Verifying Useruearch")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Verifing Useruearch")

    public void verifyUserSearch() throws InterruptedException
    {
        logger.info("Starting UserSearch method");

        try
            {
                objUserSearch.clickOnSearchTab();
                Assert.assertEquals(objUserSearch.getSearchTab(), expectedAssertionsProp.getProperty(SEARCH_TAB));

                objUserSearch.clickOnUserTab();
                Assert.assertEquals(objUserSearch.getUsersTab(), expectedAssertionsProp.getProperty(USER_TAB));

                objUserSearch.clickOnTextBox(TEXT);
                Assert.assertEquals(objUserSearch.getTextBox(), expectedAssertionsProp.getProperty(USER_DATA));
            }
        catch (Exception e)
            {
                Assert.fail("Exception occured while testing Usersearch: " + e.getMessage());
                logger.error("Exception occured while verifying Usersearch:", e);
            }
        logger.info("Ending UserSearch method");
    }

    @Test(priority = 1, description = "Verifying Searched user profile")
    @Description("Verifying Searched user profile")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Verifing Searched user profile")

    public void verifySearchedUserProfile() throws InterruptedException
    {
        logger.info("Starting SearchedUserProfile method");

        try
            {
                objUserSearch.clickOnSearchResult();

                Thread.sleep(1000);

               objUserSearch.clickOnUsername();
                Assert.assertEquals(objUserSearch.getUsername(), expectedAssertionsProp.getProperty(USERNAME));

                objUserSearch.clickOnBackButton();
            }
        catch (Exception e)
            {
                objUserSearch.clickOnBackButton();

                Assert.fail("Exception occured while testing Searched user profile: " + e.getMessage());
                logger.error("Exception occured while verifying Usersearch:", e);
            }
        logger.info("Endind SearchedUserProfile method");
    }
}

