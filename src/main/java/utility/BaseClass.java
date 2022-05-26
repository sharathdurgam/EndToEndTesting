package utility;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BaseClass {

	public static WebDriver driver;

	public static Wait<WebDriver> wait;

	protected final static long Fluent_Wait_Timeout = 30;
	protected final static long Fluent_wait_Polling_Every = 5;

	public BaseClass(WebDriver driver) throws IOException {

		this.driver = driver;

		wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(Fluent_Wait_Timeout))
				.pollingEvery(Duration.ofSeconds(Fluent_wait_Polling_Every)).ignoring(NoSuchElementException.class);

	}

	protected static WebElement getElementById(String ElementLocator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ElementLocator)));
	}

	protected static WebElement getElementByName(String ElementLocator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(ElementLocator)));
	}

	protected static WebElement getElementByXpath(String ElementLocator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ElementLocator)));
	}

	protected static WebElement getElementByLinkText(String ElementLocator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(ElementLocator)));
	}
	
	
}
