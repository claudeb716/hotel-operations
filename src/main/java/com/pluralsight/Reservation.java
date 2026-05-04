package com.pluralsight;

public class Reservation {
    //Attributes
    private String roomType;
    private double price;
    private int numberOfNights;
    private  boolean weekend;
    private double reservationTotal;

    //Constructor

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }
    public Reservation(String roomType, double price) {
        this.roomType = roomType;
        this.price = price;
    }

    public Reservation(String roomType, double price, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.weekend = weekend;
    }
    // Getters and Setters

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        if (roomType.equalsIgnoreCase("King")) {

        } else if (roomType.equalsIgnoreCase("Double")) {
            price = 124.00;
        }
        this.roomType = roomType;
    }

    public double getPrice() {
        double kingSize = 139.00;
        double doubleSize = 124.00;
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {

        this.weekend = weekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "roomType='" + roomType + '\'' +
                ", price=" + price +
                ", numberOfNights=" + numberOfNights +
                ", weekend=" + weekend +
                ", reservationTotal=" + reservationTotal +
                '}';
    }
}
