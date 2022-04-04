package com.testng.tutorials;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdClass
{
    @Parameters({"URL","APIKey/UserKey"})
    @Test
    public void thiredClass(){
        System.out.println("third Class");
//        System.out.println(userUrl);
//        System.out.println(key);
    }
    @BeforeTest
    public void prerequisite()
    {
        System.out.println("I will execute First:");
    }
    @BeforeSuite
    public void BeforeSuit()
    {
        System.out.println("No Matter What I will Execute first:");
    }
}
