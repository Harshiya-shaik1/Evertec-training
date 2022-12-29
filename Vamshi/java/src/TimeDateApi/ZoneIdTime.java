package TimeDateApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdTime {
	public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
    }
    ZoneId la=ZoneId.of("America/Los-Angles");
   ZonedDateTime zt=ZonedDateTime.now();
   //System.out.println(zt);


}
/* for(String s: ZoneId.getAvailableZoneIds()) {
System.out.println(s);

} */