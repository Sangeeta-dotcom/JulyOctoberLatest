package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture 
{
public static void takeScreenshot(ChromeDriver driver,String filePath) throws IOException
{
	File source=driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File(filePath));
}
	
}
