package SingletonLoginByMadam;

public class Mymain {

		public static void main(String[] args) {
			
			//Login ob1=new Login();
			
			Login ob1=Login.getuniqueInstance();
			Login ob2=Login.getuniqueInstance();
		}
}
