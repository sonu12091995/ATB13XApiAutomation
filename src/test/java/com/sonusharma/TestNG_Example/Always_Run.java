package com.sonusharma.TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Always_Run {
    @Test
    public void test_new_register() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_normal() {
        Assert.assertTrue(true);
    }
}
