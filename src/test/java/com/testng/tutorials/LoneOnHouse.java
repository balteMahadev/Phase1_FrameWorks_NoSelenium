package com.testng.tutorials;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoneOnHouse
{
    @Parameters({"URL"})
    @Test(groups = "smoke")
    public void WebLoginHomeLoan()
    {
        System.out.println("WebLoginHomeLoan");

    }
    @Test(timeOut = 4000)
    public void MobileLoginHomeLoan()
    {
        System.out.println("MobileLoginHomeLoan");
    }
    @Test
    public void APILoginHomeLoan()
    {
        System.out.println("APILoginHomeLoan");
    }
    @Test
    public void APILogOutHomeLoan()
    {
        System.out.println("APILogOutHomeLoan");
    }
    @Test
    public void APILogDetailsHomeLoan()
    {
        System.out.println("APILogDetailsHomeLoan");
    }
}
