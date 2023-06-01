package Singleton;

public class Singleton {

    private static Singleton uniqueObject;

    private Singleton(){};

    public static  Singleton getinstance(){
        if (uniqueObject==null){
            uniqueObject= new Singleton();
            System.out.println("new object creteing");
        }
        System.out.println("object returning");
        return uniqueObject;

    }

}
