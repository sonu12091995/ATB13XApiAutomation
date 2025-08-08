package com.sonusharma.TestNG_Example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_Test {

    // PUT Request
    // 1. getToken
    // 2. getBookingId
    // 3. test_PUT ( which will use the above two methods)
    // 4. closeAllThings

    @BeforeTest // Second run
    public void getToken(){
        System.out.println("Before GET token");
    }

    @BeforeTest// first(Natural ordering)
    public void getBookingID(){
        System.out.println("Before GET BOOKING");
    }

    @Test
    public void test_PUT(){
        // token and BookingID
        System.out.println(" PUT REQUEST");
    }

    @AfterTest
    public void closeAllThings(){
        System.out.println("Close");
    }

}
