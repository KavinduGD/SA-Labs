package PizzaFactory;

public class Client {
	public static void main(String[] args) {
		
		PizzaFactory ob=new PizzaFactory(); 
		Pizza p1= ob.createPizza("CHicken");
		
		p1.ServePizzer();
	}

}
