package com.sonusharma.TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_On_Method {
    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")

    public void test1() {
        System.out.println("method1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void test2() {
        System.out.println("method2");
        Assert.assertTrue(true);

    }
}
