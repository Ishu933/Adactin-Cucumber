package org.sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.page.LogInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasePon {
	public static WebDriver driver;
	public JavascriptExecutor javaScriptExecutor;
	public Select select;
	public Actions actions;
	public static SeleniumBasePon seleniumBasePon = new SeleniumBasePon();
	public static LogInPage logInPage;

	public void initDriver(String BrowserType) {
		switch (BrowserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;

		default:
			break;
		}

	}

	public void launchURL(String url) {
		driver.get(url);

	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public void sendKeysByjava(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);

	}

	public void clickByJava(WebElement element) {
		element.click();

	}

	public void sendKeysByJSE(WebElement element, String KeysToSend) {
		javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguments[0].setAttribute('value','" + KeysToSend + "')", element);

	}

	public void sleep(long sleep) {
		try {
			Thread.sleep(sleep);
		} catch (Exception e) {

		}

	}

	public void clickByJSE(WebElement element) {
		javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguemens[0].click()", element);

	}

	public Object getAttributeByJSE(WebElement element) {
		javaScriptExecutor = (JavascriptExecutor) driver;
		Object executeScript = javaScriptExecutor.executeScript("return arguments[0].getAttribute('value')", element);
		return executeScript;

	}

	public String getTextAttributeByJava(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public void selectByText(WebElement element, String value, String selectType) {
		select = new Select(element);
		switch (selectType) {
		case "value":
			select.selectByValue(value);

			break;
		case "byText":
			select.selectByVisibleText(value);

			break;

		default:
			break;
		}

	}

	public void selectByNumber(WebElement element, int indexNo) {
		select = new Select(element);
		select.selectByIndex(indexNo);

	}

	public void clear(WebElement element) {

		element.clear();
	}

	public void clickByActions(WebElement targetElement, String element) {
		actions = new Actions(driver);
		switch (element) {
		case "click":
			actions.click(targetElement).build().perform();
			break;
		case "doubleClick":
			actions.doubleClick(targetElement).build().perform();
			break;

		default:
			break;
		}

	}

	public void mouseOverAction(WebElement target) {
		actions = new Actions(driver);
		actions.moveToElement(target);

	}

	public void selectByRobot() {
		try {
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);

			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (Exception e) {

		}

	}

	public void alert(String accept_dismiss) {
		switch (accept_dismiss) {
		case "accept":
			driver.switchTo().alert().accept();
			break;
		case "dismiss":
			driver.switchTo().alert().dismiss();
			break;

		default:
			break;
		}

	}

	public String windowsHandling(int requiredWindowsIdNumber) {

		String currentWindows = driver.getWindowHandle();
		Set<String> allWindowsId = driver.getWindowHandles();

		List<String> list = new LinkedList<String>();
		list.addAll(allWindowsId);

		String requiredWindowsId = list.get(requiredWindowsIdNumber);
		return requiredWindowsId;

	}

	public void switchToWindows(String requiredWindowsId) {
		driver.switchTo().window(requiredWindowsId);

	}

	public void scrolling(WebElement element, String scrollTypes) {
		javaScriptExecutor = (JavascriptExecutor) driver;
		switch (scrollTypes) {
		case "up":
			javaScriptExecutor.executeScript("arguments[0].scrollIntoView(false)", element);
		case "down":
			javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true)", element);
			break;

		default:
			break;
		}

	}

	public void navigation(String commands) {

		switch (commands) {

		case "refresh":
			driver.navigate().refresh();
			break;

		case "back":
			driver.navigate().back();
			break;

		case "forward":
			driver.navigate().forward();
			break;

		default:

			break;
		}

	}

	public void screenCapture(String name) {
		try {
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			File target = new File(
					"C:\\Users\\USER\\eclipse-workspace\\JanuaryFramework2025Batch\\ErrorImage\\" + name + ".png");
			FileUtils.copyFile(source, target);

		} catch (Exception e) {

		}

	}

	public void screenCapture2() {
		try {
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File source1 = takesScreenshot.getScreenshotAs(OutputType.FILE);
			File target1 = new File("C:\\Users\\USER\\eclipse-workspace\\JanuaryFramework2025Batch\\ErrorImage\\"
					+ System.currentTimeMillis() + ".png");
			FileUtils.copyFile(source1, target1);

		} catch (Exception e) {

		}

	}

	public static String getDatasFromWorkBook(String name, int rowNum, int CellNum) {

		String Value = null;
		try {

			File file = new File("DataBase\\InputDatas.xlsx");

			FileInputStream fileInputStream = new FileInputStream(file);

			Workbook book = new XSSFWorkbook(fileInputStream);

			Sheet sheet = book.getSheet(name);

			Row row = sheet.getRow(rowNum);

			Cell cell = row.getCell(CellNum);

			CellType cellType = cell.getCellType();

			switch (cellType) {

			case STRING:
				Value = cell.getStringCellValue();
				break;

			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date value2 = cell.getDateCellValue();
					SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
					Value = SimpleDateFormat.format(value2);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
					Value = valueOf.toString();

				}

				break;
			default:
				break;
			}

		} catch (Exception e) {

		}
		return Value;
	}

	public static String getDataFromProperties(String propertyKey) {

		String property = null;

		try {

			File file = new File("DataBase\\Config.properties");

			FileReader fileReader = new FileReader(file);

			Properties properties = new Properties();

			properties.load(fileReader);

			property = properties.getProperty(propertyKey);

		} catch (Exception e) {

		}

		return property;

	}

	public void quit_Close(String quit_close) {

		switch (quit_close) {
		case "quit":
			driver.quit();
			break;

		case "close":
			driver.close();
			break;

		default:
			break;
		}

	}
}