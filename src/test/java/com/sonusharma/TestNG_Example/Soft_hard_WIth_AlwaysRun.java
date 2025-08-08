package com.sonusharma.TestNG_Example;

import org.testng.annotations.Test;

public class Soft_hard_WIth_AlwaysRun {

    @Test
    public void login() { /* might fail */ }

    @Test(dependsOnMethods = "login")         // Hard dependency
    public void placeOrder() { /* runs only if login passed */ }

    @Test(dependsOnMethods = "login",alwaysRun = true)      // Soft dependency
    public void closeBrowser() {
        System.out.println("close the browser");/* runs even if login failed */ }
}
