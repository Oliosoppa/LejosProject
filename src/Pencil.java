import lejos.hardware.motor.*;
import lejos.hardware.port.*;
import lejos.robotics.*;
/**
 * Controls for moving the pen up and down
 * @author jorino
 *
 */
public class Pencil extends Thread{

	RegulatedMotor pencil = new EV3MediumRegulatedMotor(MotorPort.D); 

	/**
	 * Start the thread
	 */
	public void run() {
	
	}
	
	/**
	 * Method for putting pencil down, pencil.rotate(x) is defined in degree values
	 */
	public void rotateDown() {
		pencil.setSpeed(300);
		pencil.rotate(15);
	}
	/**
	 * Method for lifting the pencil
	 */
	public void rotateUp() {
		pencil.setSpeed(300);
		pencil.rotate(-15);
	}
}