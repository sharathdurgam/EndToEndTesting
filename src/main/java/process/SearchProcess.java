package process;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import pageobject.SearchPage;
import utility.BaseClass;

public class SearchProcess extends BaseClass {

	public SearchProcess(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	SearchPage sp = new SearchPage(driver);
	Properties prop = new Properties();
	FileInputStream fis;
	public String textvalue;

	public void SearchResult() throws IOException, InterruptedException {
		fis = new FileInputStream(System.getProperty("user.dir") + "//properties//config.properties");
		prop.load(fis);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='I agree']")).click();
		sp.GoogleSearchTextBox().sendKeys("spark networks");
		sp.ClickSearch().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		textvalue = sp.getTextFirstResult().getText();

	}

	public void SearchResultWithScreenShot() throws IOException {
		driver.findElement(By.xpath("//div[text()='I agree']")).click();
		sp.GoogleSearchTextBox().sendKeys("funny cat memes");
		sp.ClickSearch().sendKeys(Keys.ENTER);
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(System.getProperty("user.dir") + "//screenshot//funnyCat1.png");
		FileUtils.copyFile(SrcFile, DestFile);

	}
}
