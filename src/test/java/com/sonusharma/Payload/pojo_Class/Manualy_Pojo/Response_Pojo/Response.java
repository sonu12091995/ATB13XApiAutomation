package com.sonusharma.Payload.pojo_Class.Manualy_Pojo.Response_Pojo;

import com.sonusharma.Payload.pojo_Class.Manualy_Pojo.RequestPojo.booking_Parent;

public class Response {
    // Response pojo

    /*{
    "bookingid": 16867,
    "booking": {
        "firstname": "viki",
        "lastname": "Sharma",
        "totalprice": 111,
        "depositpaid": true,
        "bookingdates": {
            "checkin": "2018-01-01",
            "checkout": "2019-01-01"
        },
        "additionalneeds": "Breakfast"
    }
}*/
    private String bookingid;
    private booking_Parent booking;// boking_parent class already create all geter setter thats why reuse
    public booking_Parent getBooking() {
        return booking;
    }

    public void setBooking(booking_Parent booking) {
        this.booking = booking;
    }

    public String getBookingid() {
        return bookingid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

   ;




}
