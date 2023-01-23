package Model.Engine;

import java.util.HashMap;
public class Engine {

	float sizeL; // expected values between 0.1-20 Liters
	byte cylinders; // expected values between 1-16 Cylinders
	HashMap<Short, Float> torqueCurve; // sampled every 250rpm
	short redline; //expected values between 2,000-15,000 redline

	public Engine(float sizeLIn, byte cylindersIn, float horsepowerIn, short redlineIn){
		this.torqueCurve = new HashMap<Short, Float>();
		this.sizeL = sizeLIn;
		this.cylinders = cylindersIn;
		this.redline = redlineIn;
		this.torqueCurve.put(redlineIn,horsepowerIn); //without further configuration assumes flat torque curve.
	}
	public void configureTorqueCurve(){
		//todo add behavior
	}
}
