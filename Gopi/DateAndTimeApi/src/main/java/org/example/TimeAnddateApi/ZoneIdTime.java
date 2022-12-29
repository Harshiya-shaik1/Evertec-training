package org.example.TimeAnddateApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;

public class ZoneIdTime {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
    }
    ZoneId la=ZoneId.of("America/Los-Angles");
   ZonedDateTime zt=ZonedDateTime.now();
   //System.out.println(zt);

}
