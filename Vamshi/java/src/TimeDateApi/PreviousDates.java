package TimeDateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class PreviousDates {
	public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(1947, 8, 14, 12, 06, 5);
        LocalDate d=LocalDate.now();
        System.out.println(dt);
        System.out.println("before eight months"+dt.minusMonths(8));
        System.out.println("After six monts"+dt.plusMonths(6));
        System.out.println(d);
        
      /*  for(String s: ZoneId.getAvailableZoneIds()) {
        	System.out.println(s);
        	
        }*/

    }

}
