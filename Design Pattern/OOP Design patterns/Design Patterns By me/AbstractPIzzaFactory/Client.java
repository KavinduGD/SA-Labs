package AbstractPIzzaFactory;

public class Client {
		public static void main(String[] args) {
			
			FactoryProducer ob1=new FactoryProducer();
			AbstractFactory chicken=ob1.createFactory("Chicken");
			Chicken mychicken= chicken.createChicken("masala");
			mychicken.serveChicken();
			
			
			AbstractFactory dough=ob1.createFactory("Dough");
			Dough mydough= dough.createDough("thin");
			mydough.serveDough();
		}

}
