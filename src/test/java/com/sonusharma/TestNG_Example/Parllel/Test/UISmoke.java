package com.sonusharma.TestNG_Example.Parllel.Test;

import org.testng.annotations.Test;

public class UISmoke {
    @Test
    public void test_UI_Smoke(){
        System.out.println(Thread.currentThread().getId());
    }
}

