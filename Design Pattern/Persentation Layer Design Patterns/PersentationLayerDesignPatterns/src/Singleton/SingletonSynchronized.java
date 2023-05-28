package Singleton;

public class SingletonSynchronized{

    private static SingletonSynchronized  uniqueObject;

    private SingletonSynchronized(){};

    public static synchronized  SingletonSynchronized getinstance2(){

        if(uniqueObject==null){
            uniqueObject= new SingletonSynchronized();   
            System.out.println("create a new object");
        }
        System.out.println("returning a object");
        return uniqueObject;
    }
}
