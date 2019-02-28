package com.learn.reports;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport 
{
	public ExtentReports report;
	
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUp()
	{
		ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/Reports/Test1.html"));
		
		report=new ExtentReports();
		
		report.attachReporter(extent);
	}
	
	@AfterMethod
	
	public void teardown()
	{
		report.flush();
	}
}


	