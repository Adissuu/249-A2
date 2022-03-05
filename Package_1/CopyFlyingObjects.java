// -----------------------------------------------------
// Part: 2
// Written by: Gabriel Dubois - 40209252 
// and Ali Fetanat - 40158208
// -----------------------------------------------------

package Package_1;

import Package_2.*;
import Package_3.*;
import Package_4.*;
import Package_5.*;

public abstract class CopyFlyingObjects {

     
public static FlyingObject[] copyFlyingObjects (FlyingObject[] objs2) {
	
	FlyingObject[] objs1= new FlyingObject[objs2.length];
	
	for (int i=0;i<objs1.length;i++) 
	{
		objs1[i]= new FlyingObject(objs2[i]);
	}
	return objs1;
}
	public static void main(String[] args) {
		
		FlyingObject objs1[] = new FlyingObject[21];
		objs1[0] = new Airplane("Bombardier", 950000, 1000);
        objs1[1] = new Airplane("Bombardier", 950000, 1000);
        objs1[2] = new Airplane("Nintendog", 605000, 600);
        // ---
        objs1[3] = new Helicopter("Bombardier", 950000, 1000, 5, 2000, 12);
        objs1[4] = new Helicopter("Percée", 100000, 900, 6, 2010, 6);
        objs1[5] = new Helicopter("Percée", 100000, 900, 6, 2010, 6);
        // ---
        objs1[6] = new Quadcopter(100, "Bombardier", 950000, 1000, 5, 2000, 12);
        objs1[7] = new Quadcopter(60, "NZXT", 100000, 900, 6, 2010, 6);
        objs1[8] = new Quadcopter(80, "Apple", 62000, 600, 4, 2022, 2);
        // ---
        objs1[9] = new Multirotor(8, "YESA", 62000, 600, 4, 2022, 2);
        objs1[10] = new Multirotor(6, "EVGA", 100000, 900, 6, 2010, 6);
        objs1[11] = new Multirotor(4, "SANS", 950000, 1000, 5, 2000, 12);
        // ---
        objs1[12] = new UAV(1000, 9000);
        objs1[13] = new UAV(300, 5000);
        objs1[14] = new UAV(300, 5000);
        // ---
        objs1[15] = new MAV(999, 8999, 800, "MK-1");
        objs1[16] = new MAV(600, 7000, 600, "MK-2");
        objs1[17] = new MAV(600, 7000, 600, "MK-2");
        // ---
        objs1[18] = new AgriculturalDrone(1000, 10000, 600, "Microsoft");
        objs1[19] = new AgriculturalDrone(2000, 15000, 1200, "Apex");
        objs1[20] = new AgriculturalDrone(1500, 17500, 1800, "KCORP");
        
        FlyingObject[] Airplaneer1= copyFlyingObjects(Airplane);
		FlyingObject[] Helicopter1= copyFlyingObjects(Helicopter);
		FlyingObject[] Quadcopter1= copyFlyingObjects(Quadcopter);
		FlyingObject[] Multirotor1= copyFlyingObjects(Moltirotor);
		FlyingObject[] UAV1= copyFlyingObjects(UAV);
		FlyingObject[] AgriculturalDrone1= copyFlyingObjects(AgriculturalDrone);
		FlyingObject[] MAV1= copyFlyingObjects(MAV);
	}

}
