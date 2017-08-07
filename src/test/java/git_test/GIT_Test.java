package git_test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GIT_Test {
	
	@Test
	public void logintest() throws IOException
	{
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.google.co.in/");
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Nandhini\\Selenium_Workspace\\git-test\\Screenshot"));
	}

}
