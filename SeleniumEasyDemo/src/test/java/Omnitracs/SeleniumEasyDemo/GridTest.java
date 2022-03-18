package Omnitracs.SeleniumEasyDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
	public static void main(String[] args) throws MalformedURLException{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = "http://192.168.1.4:9412/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("https://demo.seleniumeasy.com/");
	}

}
