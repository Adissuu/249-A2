// -----------------------------------------------------
// Part: 1
// Written by: Gabriel Dubois - 40209252
// -----------------------------------------------------

package Package_5;

import Package_4.UAV;

public class AgriculturalDrone extends UAV {

    /** Attributes */
    // brand
    public String brand;
    // Carry capactiy
    public int cCap;

    // default constructor
    public AgriculturalDrone() {

        this.brand = "";
        this.cCap = 0;
    }

    // parametrized constructor
    public AgriculturalDrone(double weight, double price, int cCap, String brand) {
        this.brand = brand;
        this.cCap = cCap;
        this.price = price;
        this.weight = weight;
    }

    // copy constructor
    public AgriculturalDrone(AgriculturalDrone agriDrone) {
        super(agriDrone.weight, agriDrone.price);
        this.brand = agriDrone.brand;
        this.cCap = agriDrone.cCap;

    }

    // Getter method brand
    public String getBrand() {
        return this.brand;
    }

    // Getter method carry capacity
    public int getCCap() {
        return this.cCap;
    }

    // Setter method brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Setter method carry capacity
    public void setCCap(int cCap) {
        this.cCap = cCap;
    }

    // toString method
    public String toString() {
        return "The weight of the agricultural drone is " + super.weight + " pounds and its price is $" + super.price
                + ".Also, the brand of this drone is " + this.brand
                + " and the carry capacity is " + this.cCap;
    }

    // equals method
    public boolean equals(AgriculturalDrone agridrone) {
        return (super.equals(agridrone) && this.equals(agridrone));
    }
}
