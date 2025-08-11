package com.sonusharma.TestNG_Example.Parllel.class_lavel;

import org.testng.annotations.Test;

public class Firefox {

        @Test
        public void test_firefox(){
            System.out.println("2");
            System.out.println(Thread.currentThread().getId());

        }
    }

