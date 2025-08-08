package com.sonusharma.TestNG_Example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Passing {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hi i am demo");
        System.out.println("You are running this param");

        // Running the browser based on the parameter passed
        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Start the firefox");
        }
        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome!");
        }
       if (value.equalsIgnoreCase("safari")){
            System.out.println("Start the safari!");
        }
        if (value.equalsIgnoreCase("edge")){
            System.out.println("Start the edge!");
        }
        if (value.equalsIgnoreCase("opera")){
            System.out.println("Start the opera!");
        }

    }
}
