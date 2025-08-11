package com.sonusharma.TestNG_Example.Parllel.Test;

import org.testng.annotations.Test;

public class APISmoke {
    @Test
    public void test_API_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }
}
