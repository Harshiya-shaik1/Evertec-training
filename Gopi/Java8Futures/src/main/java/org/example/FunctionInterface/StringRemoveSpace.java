package org.example.FunctionInterface;

import java.util.function.Function;

public class StringRemoveSpace {
    public static void main(String[] args) {
        String s=" gopi krishna palem";
        Function<String,String> f=s1->s1.replace(" ","");
        System.out.println(f.apply(s));

    }
}
