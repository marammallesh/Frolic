package live.frolic.test.postsSearchTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import live.frolic.base.BaseFrolicAutomationPage;
import live.frolic.postsSearchPages.postsSearchPage;
import live.frolic.test.BaseTestAutomation;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import live.frolic.usersSearchPages.usersSearchPage;

import static live.frolic.util.Constants.*;

public class postsSearchTest extends BaseTestAutomation {

    public static final Logger logger = Logger.getLogger(BaseTestAutomation.class.getName());

    private postsSearchPage objPostsSearch = null;
    private usersSearchPage objUserSearch = null;

    @BeforeClass
    @Parameters({"deviceIndex"})
    public void initClass(String deviceIndex) throws Exception
        {
            logger.info("Starting of initClass method in PostSearch");

            this.objPostsSearch = new postsSearchPage(driver);
            this.objUserSearch = new usersSearchPage(driver);

            logger.info("Ending the initClass method in PostSearch");
        }

    @Test(priority = 2, description = "Verifying PostSearch")
    @Description("Verifying PostSearch")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Verifing PostSearch")

    public void verifyingPostSearch () throws InterruptedException
        {
            logger.info("Starting of PostSearch method");

            try
                {
                    objPostsSearch.clickOnpostsTab();
                    Assert.assertEquals(objPostsSearch.getPostsTab(), expectedAssertionsProp.getProperty(POSTS_TAB));

                    objPostsSearch.clickOnSearchBox(POST_DATA);
                    Assert.assertEquals(objPostsSearch.getSearchBox(), expectedAssertionsProp.getProperty(POSTS_TEXT));

                }
            catch (Exception e)
                {

                    Assert.fail("Exception occured while testing PostSearch: " + e.getMessage());
                    logger.error("Exception occured while verifying PostSearch:", e);

                }
            logger.info("Ending PostSearch method");
        }
    @Test(priority = 2, description = "Verifying PostResult")
    @Description("Verifying PostResult")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Verifying PostResult")

    public void verifyingPostSearchResult () throws InterruptedException
            {
                logger.info("Starting of PostSearch method");

                try
                    {
                        objPostsSearch.clickOnPostResult();

                       Thread.sleep(3000);

                       objPostsSearch.getVailidatePostResult();
                      Assert.assertEquals(objPostsSearch.getVailidatePostResult(), expectedAssertionsProp.getProperty(POSTRESULT));

                        objUserSearch.clickOnBackButton();

                    }
                catch (Exception e)
                    {
                        objUserSearch.clickOnBackButton();

                        Assert.fail("Exception occured while testing PostResult: " + e.getMessage());
                        logger.error("Exception occured while verifying PostResult:", e);

                    }

            }


}

