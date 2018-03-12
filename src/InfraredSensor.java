import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;

/**
 * Gets commands from the remote control
 * @author sofyp
 *
 */
public class InfraredSensor {
	
	EV3IRSensor infraredSensor = new EV3IRSensor(SensorPort.S1); //Creating infraredsensor 
	
	public InfraredSensor() {
		
	}
	/**
	 * Gets commands from remote controller and returns them in ints
	 * @return
	 */
	public int getRemoteCommand() {
		int remoteCommand = infraredSensor.getRemoteCommand(0);
		return remoteCommand;
	}
}
