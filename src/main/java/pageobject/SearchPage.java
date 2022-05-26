package pageobject;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BaseClass;

public class SearchPage extends BaseClass{

	public SearchPage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static final String Google_Search_Text="//input[@title='Search']";
	public static final String SearchTextResult= "//h3[text()='Spark Networks SE | A global leading dating company']";
	
	private WebElement element =null;
	
	

	public WebElement GoogleSearchTextBox()
	{
		element= getElementByXpath(Google_Search_Text);
		
		return element;
	}
	
	public WebElement ClickSearch()
	{
		element= getElementByXpath(Google_Search_Text);
		
		return element;
	}
	
	
	public WebElement getTextFirstResult()
	{
		element = getElementByXpath(SearchTextResult);
		return element;
	}
	
}
