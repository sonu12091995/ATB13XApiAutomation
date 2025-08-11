package com.sonusharma.TestNG_Example.Parllel.Methods;

import org.testng.annotations.Test;

public class Methd_Lavel {

    @Test
    public void validLogin() {
        System.out.println("validLogin – Thread " + Thread.currentThread().getId());
    }

    @Test
    public void invalidLogin() {
        System.out.println("invalidLogin – Thread " + Thread.currentThread().getId());
    }

    @Test
    public void invalidLogin2() {
        System.out.println("invalidLogin – Thread " + Thread.currentThread().getId());
    }
}
