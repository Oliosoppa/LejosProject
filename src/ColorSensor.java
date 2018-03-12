import lejos.hardware.sensor.*;
import lejos.hardware.Sound;
import lejos.hardware.port.*;
/**
 * Reads the color of surface and lets user know when white surface is reached
 * @author mikkii
 *
 */
public class ColorSensor extends Thread {
	
	private EV3ColorSensor colorSensor = new EV3ColorSensor(SensorPort.S2);
	private int color;//Sensor gives colors in ints
	private int beeps;//int value for beep counter
	
	/**
	 * Starts the thread
	 */
	public void run() {
		this.beeps = 0;
	}
	/**
	 * Method getting the color values from the sensor
	 */
	public void getColor() {
		this.color = colorSensor.getColorID();
		if (this.color == 6) {//if the color detected is white
			
			if(beeps == 0) {// Play beep-sound, only once during one entrance on white surface
				Sound.beepSequence();
				beeps++;
			}
		}
		else {
			beeps = 0;//Clears the beep values so user can hear the sound again when entering a white surface again
		}	
	}		
}
