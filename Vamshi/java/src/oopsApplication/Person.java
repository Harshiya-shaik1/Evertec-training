package oopsApplication;

public abstract class Person  {
    public abstract void ride();

    public String personDetails(String name)
    {
        return name;
    }
    public String personDetails(String name,int age){

        return name +" , "+age;
    }

}
