package com.sonusharma.TestNG_Example.Parllel.Test;

import org.testng.annotations.Test;

public class DBSmoke {
    @Test
    public void test_DB_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }
}
