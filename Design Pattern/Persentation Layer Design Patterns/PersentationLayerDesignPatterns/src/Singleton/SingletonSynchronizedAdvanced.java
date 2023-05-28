package Singleton;

public class SingletonSynchronizedAdvanced {

    private static SingletonSynchronizedAdvanced  uniqueObject;

    private SingletonSynchronizedAdvanced(){};

    public static  SingletonSynchronizedAdvanced getinstance2(){

        if(uniqueObject==null){
            synchronized (Singleton.class){
                if(uniqueObject==null){
                uniqueObject= new SingletonSynchronizedAdvanced();   
                System.out.println("create a new object");}
            }
           
        }
        System.out.println("returning a object");
        return uniqueObject;
    }
    
}
