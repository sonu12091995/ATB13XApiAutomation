package com.sonusharma.TestNG_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {

    // reg -> all the 3 testcase
    // sanity -> sanity run = 1
    // smoke -> smoke run = 1


    @Test(groups = {"reg","sanity"})
    public void test_sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");

    }

    @Test(groups = {"reg"})
    public void test_regRun() {
        System.out.println("Reg");

    }

    @Test(groups = {"reg","smoke"})
    public void test_smokeRun() {
        System.out.println("Smoke");

    }

}
