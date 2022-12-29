package TimeDateApi;

import java.time.LocalDate;
import java.time.Period;

public class TimePeriod {
	public static void main(String[] args) {
        LocalDate Dob=LocalDate.of(2000,01,8);
        LocalDate today=LocalDate.now();
        Period p=Period.between(Dob,today);
        System.out.println("year"+p.getYears()+"months"+ p.getMonths()+" days"+p.getDays());
    }

}
