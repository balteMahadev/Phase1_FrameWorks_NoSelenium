package com.testng.tutorials;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class TestNgListeners implements ITestListener
{
    @Override
    public void onTestStart(ITestResult result)
    {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("passed");
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
       //screenshot code
        System.out.println("I'm failed :"+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
