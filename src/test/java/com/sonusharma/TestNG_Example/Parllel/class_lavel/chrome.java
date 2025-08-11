package com.sonusharma.TestNG_Example.Parllel.class_lavel;

import org.testng.annotations.Test;

public class chrome {


    @Test
    public void test_chrome1() {
        System.out.println("1");
        System.out.println(Thread.currentThread().getId());


    }
}
