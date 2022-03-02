// -----------------------------------------------------
// Part: 1
// Written by: Gabriel Dubois - 40209252
// -----------------------------------------------------

package Package_4;

import Package_1.FlyingObject;

public class UAV extends FlyingObject {

    /** Attributes */
    // weight
    public double weight;
    // price
    public double price;

    // default constructor
    public UAV() {
        this.weight = 0;
        this.price = 0;
    }

    // copy constructor
    public UAV(UAV uav) {
        this.weight = uav.weight;
        this.price = uav.price;
    }

    // parametrized constructor

    public UAV(double weight, double price) {
        this.price = price;
        this.weight = weight;
    }

    // Getter method weight
    public double getWeight() {
        return this.weight;
    }

    // Getter method price
    public double getPrice() {
        return this.price;
    }

    // Setter method weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Setter method price
    public void setPrice(double price) {
        this.price = price;
    }

    // toString method
    public String toString() {
        return "The weight of the UAV is " + weight + " pounds and its price is $" + price;
    }

    // equals method
    public boolean equals(UAV uav) {
        return (this.price == uav.price && this.weight == uav.weight);
    }
}
