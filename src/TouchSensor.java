import lejos.hardware.port.*; 
import lejos.hardware.sensor.*;
/**
 * @author sofyp
 * public class Touch returns a sample to Main,
 * which reacts according instructions
 */

public class TouchSensor extends Thread{ 

	/**
	 * public class TouchSensor creates a float array called sample
	 */
	EV3TouchSensor touchSensor = new EV3TouchSensor(SensorPort.S4);  
    private float[] sample = new float[touchSensor.sampleSize()];
    public TouchSensor() {
    
    }
    /**
     * Starts Thread
     */
    public void run() {
    	
    }
    /**
     * Method returns sample value to Main
     * if touch sensor gets a hit, sample value is 1
     * @return
     */
    public float touchSensorTest() {
        touchSensor.fetchSample(sample, 0);
        
        if (sample[0]==1) {
        	return 1;
  
        } else {
        	return 0;
        }   
    }   	
}