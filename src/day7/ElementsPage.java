package day7;

import org.openqa.selenium.WebDriver;

public class ElementsPage extends Page {
	public ElementsPage(WebDriver dr) {
		super(dr);
	}

	public TextBoxPage clickOnTextBox() 
	{
		return new TextBoxPage(testBase.driver);
	}
	public CheckBoxPage clickOnCheckBox() 
	{
		return new CheckBoxPage(testBase.driver);
	}
}
