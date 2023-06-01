package Builder.Example1;

public class Shop {

    public static void main(String[] args) {
        
        Phone p1=new Phone("Android", "i3", 6, 1600, 2);
        System.out.println(p1);

        Phone p2= new Phone("IOS", null, 0, 0, 0);
        System.out.println(p2);

        //Builder Pattern
        Phone p3= new PhoneBuilder().setOs("Android").setProcessor("i3").getPhone();
        System.out.println(p3);



        
    }
    
}
