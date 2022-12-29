import java.util.Collection;

public class Strings {
    public static void main(String[] args) {



      /*  String s1 = "gopi";
        s1 ="gopi";
        s1="vamshi";
        s1=s1.concat("krishna");
        System.out.println(s1);

        System.out.println(s1.contains("v"));
        String s2="  java t point  ";
        System.out.println(s2.trim());



    StringBuffer sb= new StringBuffer("gopi");
     sb=new StringBuffer("go2pi");
        System.out.println(sb);
        char ch=93;
        System.out.println(ch);
*/


        //case 1:immutable and mutable

/*
        String s1=new String("Gopi");
        s1.concat("krishna");
        System.out.println(s1);*///gopi


        /*String s1= new String("Gopi");
        String s2=s1.concat("krishna");
        System.out.println(s2);//Gopikrishna*/

/*
        StringBuffer sb =new StringBuffer("Gopi");
        sb.append("krishna");
        System.out.println(sb);*/

        //case2 == & .equal
        /*String s1=new String("gopi");
        String s2=new String("gopi");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s1));//true*/

        StringBuffer sb = new StringBuffer("Gopi");
        StringBuffer sb1 = new StringBuffer("Gopi");
        System.out.println(sb == sb1); //false
        System.out.println(sb.equals(sb1));//false
        System.out.println(sb.toString().equals(sb1.toString()));//true
        char[] ch = new char[sb.length()];
        System.out.println(ch);

               /* for(char c:ch) {
                    System.out.println(c);

                }*/
        for (int i = 0; i < sb.length(); i++) {
            ch[i] = sb.charAt(i);
            System.out.println(ch);
        }
        System.out.println(ch);


        /*
        the case of .equals method ment for content compariosion in string
                address or reference comparion in stringBuffer*/


    /*    String s1 = new String("yccm");
        String s2 = new String("yccm");
        System.out.println(s1 == s2);//false




        String s3 = "yccm";
        System.out.println(s1 == s3);//false

        String s4 = "yccm";
        System.out.println(s3 == s4);//true

        String s5 = "yc" + "cm";
        System.out.println(s4 == s5);// true

        String s6 = "yc";
        String s7 = s6 + "cm";
        System.out.println(s4 == s7);//false



        final String s8="yc";
        String s9=s8+"cm";
        System.out.println(s4==s9);//true
    }*/



    }
}

