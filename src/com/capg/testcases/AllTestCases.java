package com.capg.testcases;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.capg.service.OrderAndCartServiceImpl;


@RunWith(Suite.class)
@SuiteClasses({OrderAndCartServiceImpl.class,OrderAndCartPresentationTest.class})
public class AllTestCases {
	public static void main(String[] args) {
	    // code relevant to test suite goes here
		Result results=JUnitCore.runClasses(AllTestCases.class);
		System.out.println("Test Result "+results.wasSuccessful());
		System.out.println("Failure tests count are: "+results.getFailureCount());
		System.out.println(results.getRunCount());
		List<Failure> failure=results.getFailures();
		for(Failure f:failure)
		{
			System.out.println("Failure is "+f);
		}
	}

}

