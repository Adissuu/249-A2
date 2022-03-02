// -----------------------------------------------------
// Part: 1
// Written by: Gabriel Dubois - 40209252
// -----------------------------------------------------

package Package_1;

import java.util.Objects;

public class Airplane extends FlyingObject {
    /** Attributes */
    // Brand of airplane
    protected String brand;
    // price of airplane
    protected double price;
    // horsepower of airplane
    protected int horsepower;

    /** Default constructor */
    public Airplane() {
        this.brand = "";
        this.price = 0.0;
        this.horsepower = 0;
    }

    /** Copy constructor */
    public Airplane(Airplane plane) {
        this.brand = plane.brand;
        this.price = plane.price;
        this.horsepower = plane.horsepower;
    }

    /** parametrized constructor */
    public Airplane(String b, double p, int h) {
        this.brand = b;
        this.price = p;
        this.horsepower = h;
    }

    // getter brand
    public String getBrand() {
        return this.brand;
    }

    // getter price
    public double getPrice() {
        return this.price;
    }

    // getter horsepower
    public int getHorsepower() {
        return this.horsepower;
    }

    // setter brand
    public void setBrand(String b) {
        this.brand = b;
    }

    // setter price
    public void setPrice(double p) {
        this.price = p;
    }

    // setter horsepower
    public void setHorsepower(int h) {
        this.horsepower = h;
    }

    // toString method
    public String toString() {
        return ("The airplane is manufacutured by " + this.brand + " and it costs $"
                + this.price + " for a total of " + this.horsepower + " horsepower.");
    }

    // equals method
    public boolean equals(Airplane plane) {
        if (this == plane)
            return true;
        if (plane == null || getClass() != plane.getClass())
            return false;
        else {
            return Double.compare(plane.price, price) == 0 && horsepower == plane.horsepower
                    && Objects.equals(brand, plane.brand);
        }
    }
}
