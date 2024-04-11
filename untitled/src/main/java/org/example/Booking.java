package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public class Booking {

    private int bookingID;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private List<HotelRoom> rooms;
    private int persons;

    /**
     * Aðeins BookingController á að nota þennan constructor
     */
    public Booking(int id, LocalDate checkIn, LocalDate checkOut, int nrPers, List<HotelRoom> rooms){
        this.bookingID = id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.persons = nrPers;
        this.rooms = rooms;
    }

    /**
     * Notið þennan til að senda upplýsingar til gagnagrunns í gegnum BookingController úr viðmóti
     * @param checkIn
     * @param checkOut
     * @param nrPers
     * @param owner
     */
    public Booking(Date checkIn, Date checkOut, int nrPers, User owner){

    }
}