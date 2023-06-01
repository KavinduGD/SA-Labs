package SingletonLoginByMadam;

public class Login {
	
	private static Login uniqueInstance;
	
	private Login() {
		
	}
	
	static public Login getuniqueInstance() {
		if(uniqueInstance==null)
			uniqueInstance=new Login();
		return uniqueInstance;
	}
	
}
