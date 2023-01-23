package Model.Chassis;

import ErrorHandling.InvalidDrivetrainException;
import java.util.HashSet;
import java.util.Set;
public class Chassis {
	// Variables
	float dragCoefficient;
	float wheelbaseMeters;
	float brakesCoeff; //todo implement
	float tiresCoeff; //todo implement
	float bodyroll; //todo implement
	String drivenWheels;
	static final Set<String> validDrivenWheels = new HashSet<String>(){{
		add("AWD");
		add("FWD");
		add("RWD");
	}};

	//Constructor
	public Chassis(float dragCoefficientIn, float wheelbaseIn, String drivenWheelsIn) throws InvalidDrivetrainException {
		this.dragCoefficient = dragCoefficientIn;
		this.wheelbaseMeters = wheelbaseIn;
		if (validDrivenWheels.contains(drivenWheelsIn)){
			this.drivenWheels = drivenWheelsIn;
		} else {
			throw new InvalidDrivetrainException("Driven wheels does not equal AWD, FWD, or RWD");
		}
	}
}
