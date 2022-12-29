package defultMrthods.WithrespectToMultileInterface;

public interface Left {
    default  void m1(){
        System.out.println("I am Left");
    }
}
