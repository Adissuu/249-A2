// -----------------------------------------------------
// Part: 1
// Written by: Gabriel Dubois - 40209252
// -----------------------------------------------------

package Package_5;

import Package_4.UAV;

public class MAV extends UAV {
    /** Attributes */
    // model
    public String model;
    // size
    public double size;

    // default constructor
    public MAV() {
        this.model = "";
    }

    // parametrized constructor
    public MAV(double weight, double price, double size, String model) {
        this.price = price;
        this.weight = weight;
        this.size = size;
        this.model = model;
    }

    // The copy constructor
    public MAV(MAV mav) {
        super(mav.weight, mav.price);
        this.size = mav.size;
        this.model = mav.model;
    }

    // Getter method size
    public double getSize() {
        return this.size;
    }

    // Getter method model
    public String getModel() {
        return this.model;
    }

    // Setter method size
    public void setSize(double size) {
        this.size = size;
    }

    // Setter method model
    public void setModel(String model) {
        this.model = model;
    }

    // toString method
    public String toString() {
        return "The weight of the MAV is " + super.weight + " pounds and its price is $" + super.price
                + ". The model is " + this.model + " and the size is " + this.size + "cm.";
    }

    // equals method
    public boolean equals(MAV mav) {
        return (super.equals(mav) && this.equals(mav));
    }
}
