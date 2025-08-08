package com.sonusharma.TestNG_Example;

import org.testng.annotations.Test;

public class Invocation_count {

    @Test(invocationCount = 2)
    public void test01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void test02(){
        System.out.println("Bye");
    }
}
