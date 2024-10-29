package org.testing.reportCapture;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportCapture 
{
	
	public static ExtentReports takeReport()
	{
		ExtentReports report=new ExtentReports("D:\\Report\\report.html",false);
		
	    return report;
	}

}
