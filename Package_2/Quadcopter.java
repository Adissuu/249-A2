// -----------------------------------------------------
// Part: 1
// Written by: Gabriel Dubois - 40209252
// -----------------------------------------------------

package Package_2;

public class Quadcopter extends Helicopter {

    /** Attributes */
    // max flying speed
    public int maxSpeed;

    // default constructor
    public Quadcopter() {
        maxSpeed = 0;
    }

    // copy constructor
    public Quadcopter(Quadcopter quadcopter) {
        this.maxSpeed = quadcopter.maxSpeed;
    }

    // parametrized constructor
    public Quadcopter(int maxSpeed, String b, double p, int h, int cylinders, int cYear, int pCap) {
        this.maxSpeed = maxSpeed;
        this.brand = b;
        this.price = p;
        this.horsepower = h;
        this.cylinders = cylinders;
        this.creYear = cYear;
        this.pCap = pCap;
    }

    // getter of maxSpeed
    public int getmaxSpeed() {
        return this.maxSpeed;
    }

    // setter of maxSpeed
    public void setmaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // toString method
    public String toString() {
        return ("The quadcopter was manufacutured by " + super.brand + " in " + this.creYear
                + ". It costs $" + super.price + " for a total of " + super.horsepower + " horsepower. "
                + "Its max speed is " + maxSpeed + "km/h and it has " + this.cylinders
                + " cylinders, and its passenger capacity is " + this.pCap + ".");
    }

    // equals method
    public boolean equals(Quadcopter quadcopter) {
        return (super.equals(quadcopter) && this.equals(quadcopter));
    }
}
