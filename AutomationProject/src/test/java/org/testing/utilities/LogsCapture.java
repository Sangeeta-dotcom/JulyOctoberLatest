package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture 
{
	public static void takeLog(String logmessage,String className)
	{
		DOMConfigurator.configure("../AutomationProject/layout.xml");
		Logger L=Logger.getLogger(className);
		L.info(logmessage);
	}

}
