package com.FailedRetryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

	//counter to keep track of retry attempts
	int counterForRetryAttempts = 0;
	
	//Set max limit for retry
	int setMaxLimitForRetry = 3;

	//Method to retry failed test cases
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess())
		{
			if(counterForRetryAttempts < setMaxLimitForRetry)
			{
				counterForRetryAttempts++;
				return true;
			}
		}
		
		return false;
	}
	
	//Set max 
}
