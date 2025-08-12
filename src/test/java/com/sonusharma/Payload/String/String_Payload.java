package com.sonusharma.Payload.String;

import org.testng.annotations.Test;

public class String_Payload {

    @Test
    public void stringpayload(){
        String payload = "{\n" +
                "    \"firstname\" : \"meenu\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

    }
}
