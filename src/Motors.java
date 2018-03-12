import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

/**
 * Driving motors defined and the methods for driving
 * @author tuoma
 *
 */
public class Motors extends Thread {
	//Names for large motors
	EV3LargeRegulatedMotor motorLeft;
    EV3LargeRegulatedMotor motorRight;
    Player sound = new Player();
    /**
     * Starting thread and creating left&right motors
     */
    public void run() {
    	motorLeft = new EV3LargeRegulatedMotor(MotorPort.B);
    	motorRight = new EV3LargeRegulatedMotor(MotorPort.A);
    }
    /**
     * Method for driving forward
     */
    public void driveForward() {
		motorRight.setSpeed(500);
		motorLeft.setSpeed(500);
		motorLeft.forward();
		motorRight.forward();
		
	}
	/**
	 * Method for driving backwards
	 */
    	public void driveBackwards() {	
    	motorRight.setSpeed(500);
		motorLeft.setSpeed(500);
		motorLeft.backward();
		motorRight.backward();
		
	}
	/**
	 * Method for turning left
	 */
	public void turnLeft() {
		motorRight.setSpeed(250);
		motorLeft.setSpeed(250);
		motorLeft.backward();
		motorRight.forward();
		
	}
	/**
	 * Method for driving right
	 */
	public void turnRight() {
		motorRight.setSpeed(250);
		motorLeft.setSpeed(250);
		motorLeft.forward();
		motorRight.backward();
		
	}
	/**
	 * Method to stop moving
	 */
	public void stopMotors() {
		motorRight.setSpeed(0);
		motorLeft.setSpeed(0);
	}
	/**
	 * Method for spinning around twice
	 */
	public void drawCircle() {
		
		motorLeft.setSpeed(200);
		motorRight.setSpeed(200);
		motorLeft.backward();
		motorRight.forward();
		sound.playEyeOfThe(100);
		stopMotors();//Stops motors after spinning two times
	}
}
