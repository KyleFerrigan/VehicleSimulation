package Model;

import ErrorHandling.InvalidDrivetrainException;
import Model.Chassis.Chassis;
import Model.Engine.Engine;

public class Vehicle {
	Chassis vehicleChasis;
	Engine vehicleEngine;

	float throttlePos = 0.0f; //0.0 to 1.0 1.0 is full depressed
	float brakePos = 0.0f; //0.0 to 1.0 1.0 is full depressed

	public Vehicle(){
		try{
			vehicleChasis = new Chassis(0.5f,3.0f,"AWD");
			vehicleEngine = new Engine(3.2f, (byte) 6,300f,(short)6000);
		} catch (InvalidDrivetrainException pte) {
			System.out.println(pte.getMessage());
		}
	}
	Boolean startEngine(){
		return false; //todo add behavior
	}
	void rev(float throttlePos){

	}
}
