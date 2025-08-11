package com.sonusharma.Test_Assurtion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg_Hard_Soft_Example {


//    @Test
//    public void test_hardAssertExample() {
//        System.out.println("Start of the program");
//        Assert.assertEquals("pramod", "Pramod");
//        System.out.println("End of the program");
//    }

// Soft assertions allow the test to continue even if an assertion fails.
    @Test
    public void test_softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("pramod","Pramod");
        System.out.println("End of program");
        softAssert.assertAll();
    }
}
