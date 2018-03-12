import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
/**
 * 
 * @author tuoma, sofyp, mikkii, jorino
 *
 */
public class ProjektiMain {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		ColorSensor cs = new ColorSensor(); 
		Player player = new Player();
		InfraredSensor infra = new InfraredSensor();
		Motors motors = new Motors();
		TouchSensor touch = new TouchSensor();
		Pencil pen = new Pencil(); // Creating the objects
		pen.start();
		motors.start();
		cs.start();	
		touch.start();
		player.start();// Starting threads
		boolean go = true;
		boolean forward = false;
		
		LCD.drawString("Kovvaa ajua!", 0, 2); // Welcome message for user when everything is ready
	
		// Activating touch and color sensors and creating if-structure for crash 
		while (go) {
			cs.getColor();
			touch.touchSensorTest();
			if (Button.ESCAPE.isDown()) {
				go = false;
				LCD.clear();
				LCD.drawString("LEPOTAUKO", 0, 3);
				break;
			}
		
			 if (touch.touchSensorTest() == 1 && forward ) {
				
   			 forward = false;
       		 motors.stopMotors();
       		 player.playCrash(100);
       		 player.playMyHeart(100);
			
			 }
		
			//Remote controls  
		 switch (infra.getRemoteCommand()){
		 
		 case 1://Drive forward when button 1 is pressed and there's nothing touch sensor detects
         	if(touch.touchSensorTest() == 0) {
         		forward = true;
         		motors.driveForward();
         	}
         	break;
         	
         case 2://Turn left 
         	motors.turnLeft();
         	break;
         case 3://Drive backwards
         	motors.driveBackwards();
         	break;
         case 4://Turn right
        	 motors.turnRight();
        	 break;
         case 5://Stop both motors when both upper buttons are pressed
        	 motors.stopMotors();
        	 break;
         case 6://Lift pencil
        	 pen.rotateUp();
        	 break;
         case 7://Put pencil down
        	 pen.rotateDown();
        	 break;
         case 8://Spins twice
        	 motors.drawCircle();
         default:
		
		 	}
		 }
	} 
}
