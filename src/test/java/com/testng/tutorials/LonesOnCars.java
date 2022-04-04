package com.testng.tutorials;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LonesOnCars
{
    @Parameters({"URL"})
    @Test
    public void WebLoginCarLoan()
    {
        System.out.println("WebLoginCarLoan");

    }
    @Test
    public void MobileLoginCarLoan()
    {
        System.out.println("MobileLoginCarLoan");
    }
    @Test(groups = "smoke")
    public void APILoginCarLoan()
    {
        System.out.println("APILoginCarLoan");
    }
}
