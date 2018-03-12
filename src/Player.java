	import java.io.File;
	import lejos.hardware.Sound;
/**
 * 
 * @author tuoma
 * Sound player
 * You can play a sample by calling a method
 *
 */
	public class Player extends Thread {
		//All the sound files imported to device
		private File myHeart = new File("Celine_Dion_-_My_Heart_Will_Go_On.wav");
		private File crash = new File("Tmi_Puuhamies_Pete-[AudioTrimmer.com].wav");
		private File eyeOf = new File("eyeofthe.wav");
		/**
		 * Starts thread
		 */
		public void run() {
			
		}
		/**
		 * Method for playing Celine Dion
		 * @param volume
		 * @return
		 */
		public int playMyHeart(int volume) { // Receives int value from main
				
			Sound.playSample(myHeart, volume); // (Song name, volume value from the main)
			return 20000; // Return sample length in milliseconds
							
			}
		/**
		 * Method for playing Eye of the tiger
		 * @param volume
		 * @return
		 */
		public int playEyeOfThe(int volume) {	
				
			Sound.playSample(eyeOf, volume);
			return 20000;
							
			}
		/**
		 *  Method for puuhamies, the crash sound
		 * @param volume
		 * @return
		 */
		public int playCrash(int volume) {
				
			Sound.playSample(crash, volume);
			return 5000;
							
			}		
	}