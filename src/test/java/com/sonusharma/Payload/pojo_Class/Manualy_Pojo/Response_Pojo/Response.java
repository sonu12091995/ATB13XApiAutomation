package com.sonusharma.Payload.pojo_Class.Manualy_Pojo.Response_Pojo;

import com.sonusharma.Payload.pojo_Class.Manualy_Pojo.RequestPojo.BookingParent;

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
   // Class representing the booking response
    public class BookingResponse {

        // Unique ID for the booking
        private String bookingId;

        // Booking details (reusing BookingParent class)
        private BookingParent booking;

        // Getter and Setter for bookingId
        public String getBookingId() {
            return bookingId;
        }

        public void setBookingId(String bookingId) {
            this.bookingId = bookingId;
        }

        // Getter and Setter for booking
        public BookingParent getBooking() {
            return booking;
        }

        public void setBooking(BookingParent booking) {
            this.booking = booking;
        }
    }



}
