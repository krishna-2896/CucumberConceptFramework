package com.common;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	// 1.BrowserLaunch
	public static WebDriver ChromeBrowserLaunch() {
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver EdgeBrowserLaunch() {
		driver = new EdgeDriver();
		return driver;
	}

	public static WebDriver IEBrowserLaunch() {
		driver = new InternetExplorerDriver();
		return driver;
	}

	public static WebDriver FireFoxBrowserLaunch() {
		driver = new FirefoxDriver();
		return driver;
	}

	// 2LoadUrl
	public static void loadUrl(String url) {
		driver.get(url);
	}

	// 3.maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// 4.getTitle
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 5.getCurrentUrl
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	// 6.sendkeys
	public static void sendkeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	// 7.click
	public static void click(WebElement element) {
		element.click();
	}

	// 8.getText
	public  static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// 9.get attribute
	public static String getAttribute(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}

	// 10.findLocatorById
	public static WebElement findLocatorById(String attributeValue) {
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}

	// 11.findLocatorByName
	public  static WebElement findLocatorByName(String attributeValue) {
		WebElement findElement = driver.findElement(By.name(attributeValue));
		return findElement;
	}

	// 12.findLocatorByClassName
	public static WebElement findLocatorByClassName(String attributeValue) {
		WebElement findElement = driver.findElement(By.className(attributeValue));
		return findElement;
	}

	// 13.findLocatorByXpath
	public  static WebElement findLocatorByXpath(String attributeValue) {
		WebElement findElement = driver.findElement(By.xpath(attributeValue));
		return findElement;
	}

	// 14.getAttribute other thanValue
	public String getAttribute(String attributeName, WebElement element) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	// to get text from text box
	public String getAttributee(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// 15.Sleep

	public static void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	// 16.moveToElement
	public void moveToElement(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
	}

	// 17.dragAndDrop
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target);
	}

	// 18.contextClick(rightclick)
	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// 19.KeyDown
	public void keyDown(CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyDown(key);
	}

	// 20.KeyUp
	public void keyUp(CharSequence key) {
		Actions actions = new Actions(driver);
		actions.keyUp(key);

	}

	// 21.double click
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	// 22.Accept Alert
	public void acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// 23.Dismiss Alert
	public void dismissAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	// 24.JavaScript insert text
	public void insertTextJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value'," + text + ")", element);
	}

	// 25.JavaScript print text
	public Object printTextJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("return arguemnt[0].getAttribute('value')", element);
		return executeScript;
	}

	// 26.JavaScript click
	public void clickjs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0],click()", element);
	}

	// 27.Scroll Down JavaScript
	public void scrollDownJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].scrollIntoView(true)", element);
	}

	// 28.Scroll Up JavaScript
	public void scrolUpJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].scrollIntoView(false)", element);
	}

	// 29.Take Screenshot
	public static byte[] screenShotWithByte() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] file = screenshot.getScreenshotAs(OutputType.BYTES);
		return file;
	}

	public static File screenShotWithFile() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		return file;
	}

	// 30.Take ScreenShot for WebElement
	public static File screenshotWebElement(WebElement element) {
		File file = element.getScreenshotAs(OutputType.FILE);
		return file;
	}

	// 31.Create new File
	public static File newFile(String location) {
		File f = new File(location);
		return f;
	}

	// 32.Copy and Paste File
	public static void copypastefile(String srcfile, String destFile) throws IOException {
		File s = new File(srcfile);
		File d = new File(destFile);
		FileUtils.copyFile(s, d);
	}
	//33. Current date and time for screenshot
	public static String getCurrentDateTime() {
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        return LocalDateTime.now().format(dTF);
    }

	// 34.implicitly Wait
	public static void implicitiwait(int num) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));

	}
	// Explicity Wait
	public static WebElement waitForVisibility(WebElement webElement, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated((By) webElement));
    }
	public static WebElement waitForClickable(WebElement webElement, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
	public static WebElement waitForPresence(By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
	public static void waitForUrlContains(String partialUrl, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.urlContains(partialUrl));
    }
	public static void waitForTitleContains(String title, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.titleContains(title));
    }



	// 35.close particular page
	public static void close() {
		driver.close();
	}

	// 36.quit close entire pages
	public static void quit() {
		driver.quit();
	}

	public static void copypastefile1(File s, File d) throws IOException {

		FileUtils.copyFile(s, d);

	}



}
