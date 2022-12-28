
package com.oops;

public class Test {

    public static void main(String[] args){
        Client c=new Client();
        System.out.println("Client using SocialMedia");
       c.setName("Arshu");
        System.out.println("Myself: "+ c.getName());
        Whatsapp wn=new Whatsapp();
       wn.videoCall();
       wn.voiceCall();
        System.out.println("I want to change my activity ");
       ActivityOne activity=new ActivityOne();
       activity.usingInstagram();
       activity.reels();
       

    }
}
