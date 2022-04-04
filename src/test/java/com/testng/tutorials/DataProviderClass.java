package com.testng.tutorials;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass
{

    @Parameters("URL")
    @Test
    public void FourthTest(String userUrl) {
        System.out.println("FourthTest");
        System.out.println(userUrl);

    }
    @Parameters({"URL","API/Keys"})
    @Test
    public void FifthTest(String userUrl, String API) {
        System.out.println("FifthTest");
        System.out.println(userUrl);
        System.out.println(API);
    }

    @Test(dataProvider = "getData")
    public void data(String username, String password) {

        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getData()
    {
        //1st person username,password with credit history
        //2nd person username,password no credit history
        //3rd person username,password frode credit history
        Object[][] data = new Object[3][2];
        //first combination
        data[0][0] = "mahadev";
        data[0][1] = "123456";

        //second combination
        data[1][0] = "raju";
        data[1][1] = "11111";

        //third combination
        data[2][0] = "kishi";
        data[2][1] = "000000";


        return data;
    }
}
