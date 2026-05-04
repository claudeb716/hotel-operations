package com.pluralsight;

public class theRoom {
    //Attributes
    private int numberOfBeds;
    private int price;
    private boolean Occupied;
    private  boolean Available;

    //Constructor

    public theRoom() {
    }


    //Getters and Setters


    public boolean isOccupied() {
        return Occupied;
    }

    public void setOccupied(boolean occupied) {
        Occupied = occupied;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean available) {
        Available = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "theRoom{" +
                "numberOfBeds=" + numberOfBeds +
                ", price=" + price +
                ", Occupied=" + Occupied +
                ", Available=" + Available +
                '}';
    }
}
