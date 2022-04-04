package com.testng.tutorials;

import org.testng.annotations.*;

public class FirstAndSecondMethods {
    @AfterTest
    public void lastExecute() {
        System.out.println("I will execute last:");
    }
    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("I will follow you:");
    }
    @AfterSuite
    public void AfterSuit()
    {
        System.out.println("No matter what i will execute last:");
    }
    @BeforeMethod
    public void BeforeMethod()
    {
        System.out.println("Be Cool Don't hurry:");
    }

    @Test(groups = "smoke")
    public void FirstTest() {
        System.out.println("FirstTest");
    }

    @Test(enabled = false)
    public void SecondTest() {
        System.out.println("SecondTest");
    }
    @BeforeClass
    public void BeforeClass()
    {
        System.out.println("Iam FirstAndSecondMethods Class:");
    }
    @AfterClass
    public void AfterClass()
    {
        System.out.println("FirstAndSecondMethods completed:");
    }

}
