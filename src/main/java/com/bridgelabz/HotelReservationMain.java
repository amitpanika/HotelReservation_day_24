package com.bridgelabz;

public class HotelReservationMain {
    public static void main(String[] args) {
        System.out.println(" Welcome To Hotel Reservation System");
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        hotelReservation.printHotelList();
    }
}
