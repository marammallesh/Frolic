package frolic_prod.helpdesk.pages;

import frolic_prod.base.BaseFrolicAutomationPage;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * @author b2btesters
*/

public class FrolicRaiseTicketPage extends BaseFrolicAutomationPage {

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.TextView[@text = 'General']")
	private WebElement btnGeneral;

	@FindBy(xpath = "//android.widget.TextView[@text = 'View all']")
	private WebElement btnViewAll;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Closed']")
	private WebElement txtClosed;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Contact Us']")
	private WebElement btnContactSupport;

	@FindBy(id = "live.frolic.app:id/ed_email")
	private WebElement txtEmail;

	@FindBy(id = "live.frolic.app:id/ed_comment")
	private WebElement txtQuery;

	@FindBy(id = "live.frolic.app:id/btn_add_attachment")
	private WebElement btnAttachment;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement btnAllow;

	@FindBy(xpath = "//android.widget.LinearLayout[6]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
	private WebElement imgFile;

	@FindBy(id = "live.frolic.app:id/iv_thumbnail")
	private WebElement imgSelectFile;

	@FindBy(id = "live.frolic.app:id/btn_close_preview")
	private WebElement btnClosePreview;

	@FindBy(id = "live.frolic.app:id/btn_create_ticket")
	private WebElement btnRaiseTicket;

	@FindBy(xpath = "//android.widget.TextView[@text = 'My Tickets']")
	private WebElement txtMyTickets;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Open']")
	private WebElement txtOpen;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Ticket Details']")
	private WebElement txtTicketDetails;

	@FindBy(id = "live.frolic.app:id/tv_ticket_number")
	private WebElement txtTicketId;

	@FindBy(id = "live.frolic.app:id/tv_description")
	private WebElement txtTicketDescription;

	@FindBy(xpath = "//android.widget.TextView[@text = 'Chat with us']")
	private WebElement btnChatWithUs;

	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.RelativeLayout[4]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	private WebElement txtverifyChat;

	@FindBy(id = "live.frolic.app:id/freshchat_conv_detail_reply_text")
	private WebElement txtSendMsg;

	@FindBy(id = "live.frolic.app:id/freshchat_conv_detail_send_reply_button")
	private WebElement btnSendMsgIcon;

	@FindBy(id = "live.frolic.app:id/freshchat_conv_detail_attach_image")
	private WebElement iconAttachFile;

	@FindBy(xpath = "//android.widget.ImageButton")
	private WebElement btnBackIcon;

	@FindBy(id = "live.frolic.app:id/btn_cancel")
	private WebElement btnCancel;

	@FindBy(id = "com.google.android.documentsui:id/refresh_layout")
	private WebElement getLayout;

	@FindBy(id = "com.google.android.documentsui:id/option_menu_search")
	private WebElement btnSelect;

	private static final Logger logger = Logger.getLogger(FrolicRaiseTicketPage.class.getName());

	public FrolicRaiseTicketPage(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);
		logger.info("Starting of FrolicRaiseTicketPage method");

		PageFactory.initElements(appiumDriver, this);

		logger.info("Ending of FrolicRaiseTicketPage method");
	}

	public void clickOnGeneralButton() {
		logger.info("Starting of clickOnGeneralButton method");

		clickOnElement(btnGeneral);

		logger.info("Ending of clickOnGeneralButton method");
	}

	public void clickOnSelectButton() {
		logger.info("Starting of clickOnSelectButton method");

		clickOnElement(btnSelect);

		logger.info("Ending of clickOnSelectButton method");
	}

	public void clickOnViewAllButton() {
		logger.info("Starting of clickOnViewAllButton method");

		clickOnElement(btnViewAll);

		logger.info("Ending of clickOnViewAllButton method");
	}

	public void clickOnCancelButton() {
		logger.info("Starting of clickOnCancelButton method");

		clickOnElement(btnCancel);

		logger.info("Ending of clickOnCancelButton method");
	}

	public void clickOnLayOut() {
		logger.info("Starting of clickOnLayOut method");

		clickOnElement(getLayout);

		this.scroll();

		logger.info("Ending of clickOnLayOut method");
	}

	public void clickOnMyTickets() {
		logger.info("Starting of clickOnMyTickets method");

		clickOnElement(txtMyTickets);

		logger.info("Ending of clickOnMyTickets method");
	}

	public String getClosedText() {
		logger.info("Starting of getClosedText method");

		logger.info("Ending of getClosedText method");

		return getText(txtClosed);
	}

	public String getAllowText() {
		logger.info("Starting of getAllowText method");

		logger.info("Ending of getAllowText method");

		return getText(btnAllow);
	}

	public void clickOnContactSupport() {
		logger.info("Starting of clickOnContactSupport method");

		clickOnElement(btnContactSupport);

		logger.info("Ending of clickOnContactSupport method");
	}

	public String getContactSupportText() {
		logger.info("Starting of getContactSupportText method");

		logger.info("Ending of getContactSupportText method");

		return getText(btnContactSupport);
	}

	public void setEmail(String email) {
		logger.info("Starting of setEmail method");

		clear(txtEmail);
		clickOnElement(txtEmail);
		sendKeys(txtEmail, email);
		driver.hideKeyboard();

		logger.info("Ending of setEmail method");
	}

	public void setQuery(String query) {
		logger.info("Starting of setQuery method");

		clear(txtQuery);

		clickOnElement(txtQuery);

		sendKeys(txtQuery, query);

		driver.hideKeyboard();

		logger.info("Ending of setQuery method");
	}

	public void clickOnAttachmentIcon() {
		logger.info("Starting of clickOnAttachmentIcon method");

		clickOnElement(btnAttachment);

		logger.info("Ending of clickOnAttachmentIcon method");
	}

	public void clickOnAllowButton() {
		logger.info("Starting of clickOnAllowButton method");

		clickOnElement(btnAllow);

		logger.info("Ending of clickOnAllowButton method");
	}

	public void clickOnGetSelectedImage() {
		logger.info("Starting of clickOnGetSelectedImage method");

		clickOnElement(imgFile);

		logger.info("Ending of clickOnGetSelectedImage method");
	}

	public void clickOnImagePreview() {
		logger.info("Starting of clickOnImagePreview method");

		clickOnElement(imgSelectFile);

		logger.info("Ending of clickOnImagePreview method");
	}

	public void clickOnCancelPreviewIcon() {
		logger.info("Starting of clickOnCancelPreviewIcon method");

		clickOnElement(btnClosePreview);

		logger.info("Ending of clickOnCancelPreviewIcon method");
	}

	public void clickOnRaiseTicketButton() {
		logger.info("Starting of clickOnRaiseTicketButton method");

		clickOnElement(btnRaiseTicket);

		logger.info("Ending of clickOnRaiseTicketButton method");
	}

	public String getMyTicketsText() {
		logger.info("Starting of getMyTicketsText method");

		logger.info("Ending of getMyTicketsText method");

		return getText(txtMyTickets);
	}

	public String getOpenTicketsText() {
		logger.info("Starting of getOpenTicketsText method");

		logger.info("Ending of getOpenTicketsText method");

		return getText(txtOpen);
	}

	public String getTicketDeatailsText() {
		logger.info("Starting of getTicketDeatailsText method");

		logger.info("Ending of getTicketDeatailsText method");

		return getText(txtTicketDetails);
	}

	public String getTicketIdText() {
		logger.info("Starting of getTicketIdText method");

		logger.info("Ending of getTicketIdText method");

		return getText(txtTicketId);
	}

	public String getTicketDescriptionText() {
		logger.info("Starting of getTicketDescriptionText method");

		logger.info("Ending of getTicketDescriptionText method");

		return getText(txtTicketDescription);
	}

	public void clickOnChatWithUs() {
		logger.info("Starting of clickOnChatWithUs method");

		explicitWait(btnChatWithUs);

		clickOnElement(btnChatWithUs);

		logger.info("Ending of clickOnChatWithUs method");
	}

	public String getChatWithUsText() {
		logger.info("Starting of getTextChatWithUs method");

		logger.info("Ending of getTextChatWithUs method");

		return getText(btnChatWithUs);
	}

	public String getChatCurrentStatusText() {
		logger.info("Starting of getChatCurrentStatusText method");

		logger.info("Ending of getChatCurrentStatusText method");

		return getText(txtverifyChat);
	}

	public void setChatMessage(String msg) {
		logger.info("Starting of setChatMessage method");

		clear(txtSendMsg);

		clickOnElement(txtSendMsg);

		sendKeys(txtSendMsg, msg);

		driver.hideKeyboard();

		logger.info("Ending of setChatMessage method");
	}

	public void clickOnSendMessageIcon() {
		logger.info("Starting of clickOnSendMessageIcon method");

		clickOnElement(btnSendMsgIcon);

		logger.info("Ending of clickOnSendMessageIcon method");
	}

	public void clickOnAttachFileIcon() {
		logger.info("Starting of clickOnAttachFileIcon method");

		clickOnElement(iconAttachFile);

		logger.info("Ending of clickOnAttachFileIcon method");
	}

	public void clickOnBackIcon() {
		logger.info("Starting of clickOnBackIcon method");

		clickOnElement(btnBackIcon);

		logger.info("Ending of clickOnBackIcon method");
	}

}