package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
    String hotelName;
    int rating;
    double regularCustomerRate;
    Scanner sc = new Scanner(System.in);
    /**
     * Creating ArrayList of Hotel named hotelList of Hotel type
     */
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    /**
     * hotel - Instance (object) of Hotel Class
     */
    Hotel hotel;
    public boolean addHotel() {

        System.out.println("Enter hotel name:");
        hotelName = sc.next();
        System.out.println("Enter hotel rating:");
        rating = sc.nextInt();
        System.out.println("Enter regular customer rate:");
        regularCustomerRate = sc.nextDouble();
        hotel = new Hotel(hotelName, rating, regularCustomerRate);
        return hotelList.add(hotel);
    }

    /**
     * Method to Print ArrayList hotelList
     */
    public void printHotelList() {
        System.out.println(hotelList);
    }

}
