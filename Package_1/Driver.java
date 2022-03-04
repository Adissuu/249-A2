// -----------------------------------------------------
// Part: 1
// Written by: Gabriel Dubois - 40209252
// -----------------------------------------------------
package Package_1;

import Package_2.*;
import Package_3.*;
import Package_4.*;
import Package_5.*;

public class Driver {
    public static void main(String[] args) {
        // Array of 21 objects
        FlyingObject objs[] = new FlyingObject[21];

        objs[0] = new Airplane("Bombardier", 950000, 1000);
        objs[1] = new Airplane("Bombardier", 950000, 1000);
        objs[2] = new Airplane("Nintendog", 605000, 600);
        // ---
        objs[3] = new Helicopter("Bombardier", 950000, 1000, 5, 2000, 12);
        objs[4] = new Helicopter("Percée", 100000, 900, 6, 2010, 6);
        objs[5] = new Helicopter("Percée", 100000, 900, 6, 2010, 6);
        // ---
        objs[6] = new Quadcopter(100, "Bombardier", 950000, 1000, 5, 2000, 12);
        objs[7] = new Quadcopter(60, "NZXT", 100000, 900, 6, 2010, 6);
        objs[8] = new Quadcopter(80, "Apple", 62000, 600, 4, 2022, 2);
        // ---
        objs[9] = new Multirotor(8, "YESA", 62000, 600, 4, 2022, 2);
        objs[10] = new Multirotor(6, "EVGA", 100000, 900, 6, 2010, 6);
        objs[11] = new Multirotor(4, "SANS", 950000, 1000, 5, 2000, 12);
        // ---
        objs[12] = new UAV(1000, 9000);
        objs[13] = new UAV(300, 5000);
        objs[14] = new UAV(300, 5000);
        // ---
        objs[15] = new MAV(999, 8999, 800, "MK-1");
        objs[16] = new MAV(600, 7000, 600, "MK-2");
        objs[17] = new MAV(600, 7000, 600, "MK-2");
        // ---
        objs[18] = new AgriculturalDrone(1000, 10000, 600, "Microsoft");
        objs[19] = new AgriculturalDrone(2000, 15000, 1200, "Apex");
        objs[20] = new AgriculturalDrone(1500, 17500, 1800, "KCORP");

        for (int i = 0; i < objs.length; i++) {
            int d = 1;
            System.out.println("==================================\n" + objs[i].toString()
                    + "\n Checking if equals the precedent object: " + objs[i].equals(objs[d]));
            d++;
            if (d == 20)
                d = 0;
        }
    }

    public static void findLeastAndMostExpensiveUAV(UAV[] array) {
        double[] Num = new double[array.length];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            Num[i] = array[i].price;
        }
        if (array.length > 1) {
            double maxValue = Num[0];
            for (int i = 0; i < Num.length; i++) {
                if (Num[i] > maxValue) {
                    maxValue = Num[i];
                    maxIndex = i;
                }
            }
            double minValue = Num[0];
            for (int i = 0; i < Num.length; i++) {
                if (Num[i] < minValue) {
                    minValue = Num[i];
                    minIndex = i;
                }
            }
            System.out
                    .println("UAV " + (maxIndex + 1) + " has the highest price. " + array[maxIndex].toString() + "\n");
            System.out.println("UAV " + (minIndex + 1) + " has the lowest price. " + array[minIndex].toString() + "\n");

        } else if (array.length == 0)

        {
            System.out.println("There is no objects found in the array.");

        } else if (array.length == 1) {
            System.out.println("There is only one uav given. " + array[0].toString());
        }
    }
}
