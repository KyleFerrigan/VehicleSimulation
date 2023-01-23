package ErrorHandling;

public class InvalidDrivetrainException extends Exception {
	public InvalidDrivetrainException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}
