package org.testing.trigger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class runner 
{
public static void main(String[] args) throws BiffException, IOException 
{
	XmlSuite xs= new XmlSuite();  //Created xmlsuite object
	xs.setName("suite1");    //given some name to the suite
	
	XmlTest xt=new XmlTest(xs);   //created xmlTest object
	
	File f=new File("../AutomationProject/Testcases.xls"); //excel file connection (testcases)
	Workbook wk=Workbook.getWorkbook(f);  //created object of workbook class
	Sheet s=wk.getSheet(0);                //sheet
	int rows=s.getRows();                 //to get rows
	ArrayList<XmlClass> al=new ArrayList<XmlClass>();
	for(int i=1;i<rows;i++)              //started loop from 1 because 1st line headers
	{
		Cell c=s.getCell(4, i);
		if(c.getContents().equals("Y"))
		{
			Cell pkg=s.getCell(2, i);
			Cell classname=s.getCell(3, i);
			String v=pkg.getContents()+ "." + classname.getContents();
			
			XmlClass c1=new XmlClass(v);
			al.add(c1);
		}
	}
	System.out.println(al.size());
	xt.setClasses(al);
	
	ArrayList<XmlTest> al2=new ArrayList<XmlTest>();
	al2.add(xt);
	
	xs.setTests(al2);
	
	ArrayList<XmlSuite> al3=new ArrayList<XmlSuite>();
	al3.add(xs);
	
	TestNG t=new TestNG();
	t.setXmlSuites(al3);
	t.run();
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

