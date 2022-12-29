package TimeDateApi;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int y=sc.nextInt();
        Year year=Year.of(y);
        if(year.isLeap()){
            System.out.println("Year is leap year"+year);
        }else{
            System.out.println("the year is not leap year"+year);
        }

    }
}
