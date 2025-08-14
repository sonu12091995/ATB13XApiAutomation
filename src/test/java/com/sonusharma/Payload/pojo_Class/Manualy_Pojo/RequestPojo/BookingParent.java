package com.sonusharma.Payload.pojo_Class.Manualy_Pojo.RequestPojo;

public class BookingParent {
    // w have to JSON parent and child
    /*`
{
    "firstname" : "Jim",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {// should be create bookingdates child class
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}

*/   // Parent class representing the booking request JSON


        // Customer's first name
        private String firstname;

        // Customer's last name
        private String lastname;

        // Total price of the booking
        private Integer totalprice;

        // Indicates if the deposit has been paid
        private Boolean depositpaid;

        // BookingDates is a child object containing check-in and check-out dates
        private BookingDates bookingdates;// BookingDates should be creating class

        // Additional needs for the booking (e.g., breakfast, late checkout)
        private String additionalneeds;

        // Getters and Setters
        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public Integer getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(Integer totalprice) {
            this.totalprice = totalprice;
        }

        public Boolean getDepositpaid() {
            return depositpaid;
        }

        public void setDepositpaid(Boolean depositpaid) {
            this.depositpaid = depositpaid;
        }

        public BookingDates getBookingdates() {
            return bookingdates;
        }

        public void setBookingdates(BookingDates bookingdates) {
            this.bookingdates = bookingdates;
        }

        public String getAdditionalneeds() {
            return additionalneeds;
        }

        public void setAdditionalneeds(String additionalneeds) {
            this.additionalneeds = additionalneeds;
        }
    }