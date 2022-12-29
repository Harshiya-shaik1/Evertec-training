package org.example.PredicateFunctionalInterface;

import java.util.function.Predicate;

public class NamesStartsWithK {
    public static void main(String[] args) {
  /*      String[] names={"sunny","Kajal","Karthik","Karuna","Gopi"};
        Predicate<String> p= s->s.charAt(0)=='K';
        for(String s:names)
        System.out.println(p.test(s));

    }
}
*/

//remove null

        String[] names={"sunny",null,"Karthik",null,"Gopi",""};
        Predicate<String> p= s->s!=null && s.length()!=0;
        for(String s:names)
            System.out.println(p.test(s));

    }
}
