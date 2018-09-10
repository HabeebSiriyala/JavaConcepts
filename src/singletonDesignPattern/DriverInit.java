package singletonDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInit {

	public static DriverInit instanceDriver = null;
	private WebDriver driver;

	private DriverInit() {

	}

	public WebDriver openBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\Habeeb01\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
	}

	public static DriverInit getInstance() {
		if (instanceDriver == null)
			instanceDriver = new DriverInit();
		return instanceDriver;
	}
}
