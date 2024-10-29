package org.testing.Assertion;

import org.testing.utilities.LogsCapture;

public class Assertion //this is soft assertion
{
	public static Boolean assert1(int actual,int expected,String className)
	{
		if(actual==expected)
		{
			LogsCapture.takeLog("Status code is matching", className);
			return true;
		}
		else
		{
			LogsCapture.takeLog("Status code is not matching", className);
			return false;
		}
	}
	public static Boolean assert2(String actual,String expected,String className)//Created one more assertion
	{
		if(actual.equals(expected))
		{
			LogsCapture.takeLog("Assertion is getting passed", className);
			return true;
		}
		else
		{
			LogsCapture.takeLog("Assertion is getting failed", className);
			return false;
			
		}
	}

}
