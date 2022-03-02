// -----------------------------------------------------
// Part: 1
// Written by: Gabriel Dubois - 40209252
// -----------------------------------------------------

package Package_3;

import Package_2.Helicopter;

public class Multirotor extends Helicopter {

    /** Attributes */
    // number of rotors
    public int rotors;

    // default constructor
    public Multirotor() {
        rotors = 0;
    }

    // copy constructor
    public Multirotor(Multirotor multirotor) {

        this.rotors = multirotor.rotors;
    }

    // parametrized constructor
    public Multirotor(int rotors, String b, double p, int h, int cylinders, int cYear, int pCap) {
        this.rotors = rotors;
        this.brand = b;
        this.price = p;
        this.horsepower = h;
        this.cylinders = cylinders;
        this.creYear = cYear;
        this.pCap = pCap;
    }

    // getter of rotors
    public int getRotors() {
        return this.rotors;
    }

    // setter of rotors
    public void setRotors(int rotors) {
        this.rotors = rotors;
    }

    public String toString() {
        return ("The multirotor was manufacutured by " + super.brand + " in " + this.creYear
                + ". It costs $" + super.price + " for a total of " + super.horsepower + " horsepower. "
                + "It has " + this.cylinders + " cylinders and " + rotors + " rotors, and its passenger capacity is "
                + this.pCap + ".");
    }
}
