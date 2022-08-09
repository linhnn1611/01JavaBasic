package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		submitSuccessfully();
		verifyEmail();
//		checkBox();

	}
// TestCase01
	public static void submitSuccessfully() {
		String userName = "Linh";
		String userEmail = "Linh@gmail.com";
		String currentAddress = "Ha Noi";
		String permanentAddress = "Viet Nam";
		
		TestBase testBase = new TestBase();
		testBase.openBrowser();

		HomePage homePage = new HomePage(testBase.driver);
		homePage.scroll();
		ElementsPage elementsPage = homePage.clickOnElements();
		TextBoxPage textBoxPage = elementsPage.clickOnTextBox();
		textBoxPage.inputData(userName, userEmail, currentAddress, permanentAddress);
		textBoxPage.clickOnSubmit();
		textBoxPage.verifyData(textBoxPage.lbNameElement, userName);
		textBoxPage.verifyData(textBoxPage.lbEmailElement, userEmail);
		textBoxPage.verifyData(textBoxPage.lbCurrentAddressElement, currentAddress);
		textBoxPage.verifyData(textBoxPage.lbPermanentAddressElement, permanentAddress);
	}
//TestCase02	
	public static void verifyEmail()
	{
		String userName = "Linh";
		String userEmail = "Linhgmail.com";
		String currentAddress = "Ha Noi";
		String permanentAddress = "Viet Nam";
		TestBase testBase = new TestBase();
		testBase.openBrowser();

		HomePage homePage = new HomePage(testBase.driver);
		homePage.scroll();
		ElementsPage elementsPage = homePage.clickOnElements();
		TextBoxPage textBoxPage = elementsPage.clickOnTextBox();
		textBoxPage.inputData(userName, userEmail, currentAddress, permanentAddress);
		textBoxPage.clickOnSubmit();
		textBoxPage.verifyRedBorder(textBoxPage.lbEmailElement);
		
	}
//TC CheckBox	
	public static void verifyCheckBox()
	{
		String b="You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile";
		TestBase testBase = new TestBase();
		testBase.openBrowser();
		HomePage homePage = new HomePage(testBase.driver);
		homePage.scroll();
		ElementsPage elementsPage = homePage.clickOnElements();
		CheckBoxPage checkBoxPage=elementsPage.clickOnCheckBox();
		checkBoxPage.clickHome();
		checkBoxPage.verifyText(checkBoxPage.text, b);
	}
//TC CheckAll	
	public static void verifyCheckAll()
	{
		TestBase testBase = new TestBase();
		testBase.openBrowser();
		HomePage homePage = new HomePage(testBase.driver);
		homePage.scroll();
		ElementsPage elementsPage = homePage.clickOnElements();
		CheckBoxPage checkBoxPage=elementsPage.clickOnCheckBox();
		checkBoxPage.clickHome();
		checkBoxPage.clickAll();
		checkBoxPage.verifyCheckAll(checkBoxPage.lbDesktopElement);
		checkBoxPage.verifyCheckAll(checkBoxPage.lbDocumentsElement);
		checkBoxPage.verifyCheckAll(checkBoxPage.lbDownloadsElement);
	}

}
