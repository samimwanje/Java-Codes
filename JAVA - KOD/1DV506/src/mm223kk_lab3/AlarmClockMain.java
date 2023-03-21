/* 
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab3;

public class AlarmClockMain {

	public static void main(String[] args) {

	// 1. St�lla v�ckarklockan till den tiden 23:48.
	
	// 2. Visa tiden.
	
	// 3. St�lla in v�ckningstiden till 6:15.
	
	// 4 L�ta klocka g� 500 minuter.
	
    // 5. Visa tiden igen.
		
	long timer = 0;
		
	AlarmClock clock = new AlarmClock(23, 48);
	
	clock.displayTime();
	
	clock.setAlarm(6, 57);
	
	clock.displayAlarmTime();
		
	
	timer = System.currentTimeMillis();
	
	// L�ter g� 500 minuter Allts�: 3.0 � 10^7 millis.

	while(System.currentTimeMillis() - timer <= 30000000) {
		
	}
	
	// Visar klockan igen... Lite os�ker p� om man ska skapa en riktig klocka till denna??
	
	clock.displayTime();


		
	}

}
