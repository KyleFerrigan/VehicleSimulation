package Model;

import Controller.VCU;
import ErrorHandling.InvalidDrivetrainException;
import Model.Chassis.Chassis;
import Model.Engine.Engine;

public class Vehicle {
	Chassis vehicleChasis;
	Engine vehicleEngine;
	public VCU vehicleController;
	// State of Vehicle
	float throttlePos = 0.0f; //0.0 to 1.0 1.0 is full depressed
	float brakePos = 0.0f; //0.0 to 1.0 1.0 is full depressed
	float speed = 0.0f;
	float groundFrictionCoeff;
	int steeringPosition; //-100 to 100, left to right, 0 is centered
	float demandedgroundfriction; //combination of steering, speed, ground friction
	float slip; //amount of friction needed to fully control vehicle, compare demanded ground friction to groundFrictionCoeff

	public Vehicle(){ //empty constructor makes a basic vehicle
		try{
			vehicleChasis = new Chassis(0.5f,3.0f,"AWD");
			vehicleEngine = new Engine(3.2f, (byte) 6,300f,(short)6000);
			vehicleController = new VCU();
		} catch (InvalidDrivetrainException idte) {
			System.out.println(idte.getMessage());
		}
	}
	//todo make constructor that takes arguments

}
