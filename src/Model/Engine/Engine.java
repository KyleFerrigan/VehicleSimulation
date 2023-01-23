package Model.Engine;

public class Engine {

	float sizeL;
	byte cylinders;
	float horsepower;
	short redline;

	public Engine(float sizeLIn, byte cylindersIn, float horsepowerIn, short redlineIn){
		this.sizeL = sizeLIn;
		this.cylinders = cylindersIn;
		this.horsepower = horsepowerIn;
		this.redline = redlineIn;
	}
}
