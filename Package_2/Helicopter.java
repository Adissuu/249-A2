// -----------------------------------------------------
// Part: 1
// Written by: Gabriel Dubois - 40209252
// -----------------------------------------------------
package Package_2;

import Package_1.Airplane;

public class Helicopter extends Airplane {

    /** Attributes */
    // number of cylinders
    public int cylinders;
    // creation year
    public int creYear;
    // passenger capacity
    public int pCap;

    // default constructor
    public Helicopter() {
        this.cylinders = 0;
        this.creYear = 0;
        this.pCap = 0;
    }

    // copy constructor
    public Helicopter(Helicopter heli) {
        this.cylinders = heli.cylinders;
        this.creYear = heli.creYear;
        this.pCap = heli.pCap;
    }

    // parametrized constructor
    public Helicopter(String b, double p, int h, int cylinders, int cYear, int pCap) {
        this.brand = b;
        this.price = p;
        this.horsepower = h;
        this.cylinders = cylinders;
        this.creYear = cYear;
        this.pCap = pCap;
    }

    // getter cylinders
    public int getCylinders() {
        return this.cylinders;
    }

    // getter creYear
    public int getCreYear() {
        return this.creYear;
    }

    // getter pCap
    public int getPCap() {
        return this.pCap;
    }

    // setter cylinders
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    // setter creYear
    public void setCreYear(int cYear) {
        this.creYear = cYear;
    }

    // setter pCap
    public void setPCap(int pCapacity) {
        this.pCap = pCapacity;
    }

    // toString method
    public String toString() {
        return ("The helicopter was manufacutured by " + super.brand + " in " + this.creYear
                + ". It costs $" + super.price + " for a total of " + super.horsepower + " horsepower. "
                + "It has " + this.cylinders + " cylinders, and its passenger capacity is " + this.pCap + ".");
    }

    // equals method
    public boolean equals(Helicopter heli) {
        // if (this == heli)
        // return true;
        // if (heli == null || getClass() != heli.getClass())
        // return false;
        // if (!super.equals(heli))
        // return false;
        // Helicopter that = (Helicopter) heli;
        // return cylinders == that.cylinders && creYear == that.creYear && pCap ==
        // that.pCap;
        return (this.brand == heli.brand && this.price == heli.price
                && this.horsepower == heli.horsepower
                && this.cylinders == heli.cylinders && this.creYear == heli.creYear
                && this.pCap == heli.pCap);
    }
}
