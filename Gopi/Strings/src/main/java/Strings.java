public class Strings {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Apple";
        if (str1 == str2) {
            System.out.println("str1 == str2"); //str1 == str2
        } else {
            System.out.println("str1 != str2");
        }

        //String object by using new key word
        String str3 = new String("Apple");
        String str4 = new String("Apple");
        if (str3 == str4) {
            System.out.println("str3 == str4");
        } else {
            System.out.println("str3 != str4"); //str3 != str4

        }
        //compare real content
        if (str3.equals(str4)) {
            System.out.printf("Both Strings are equal");

        } else {
            System.out.println("Both String are not equal");
        }
        if (str3.compareTo(str4) == 0) {
            System.out.println("\nstr3 compared to str4");
        } else {
            System.out.println("\nstr3 not compared to str4");
        }
        //String methods
        String str = "Jhon,Jennie,Jim,Jack,Joe";
        int len = str.length();
        System.out.println("lenght of the string of str: " + len);
        System.out.println(str.charAt(0) + " " + str.charAt(len - 1));
        String s1 = str.toUpperCase();
        System.out.println("str ofter upper case" + str);//Jhon,Jennie,Jim,Jack,Joe
        System.out.println("s1" + s1);//JHON,JENNIE,JIM,JACK,JOE
        if (str.contains("Jim")) {
            System.out.println("str contains Jim");
        } else {
            System.out.println("str not contains Jim");
        }
        String S2 = str.substring(5);
        System.out.println("s2 " + S2);//Jennie,Jim,Jack,Joe


        String S3 = str.substring(6, 10);
        System.out.println(S3);


        String S4 = str.replace("J", "k");
        char[] chArr = str.toCharArray();
        for (char ch : chArr) {
            System.out.print(ch);
        }
        String[] strArr = str.split(",");
        for (String s : strArr)
            System.out.println(s);


        //Strings are immutable
        String s = new String("hello");
        s.concat("Jhon");
        System.out.println(s);// hello
        //with ref we create new string obj
        String str5=s.concat(" Joy");
        System.out.println(str5);

        //string buffer and string builder are mutable

        StringBuffer br = new StringBuffer("String");//1.2v thread safe slow operation
        br.append("Buffer");
        System.out.println(br);

        StringBuilder blr = new StringBuilder("string");//1.5v not thread safe fast opearation

        blr.append("builder");
        System.out.println(blr);



    }

}


