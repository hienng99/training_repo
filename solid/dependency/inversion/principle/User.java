package solid.dependency.inversion.principle;

public class User {
	
	public void saveUser() {
		DBConnector1 connector = new DBConnector1();
		connector.save(this);
	}
	
//	public void saveUser() {
//		DBConnector connector = new DBConnector();
//		connector.save(this);
//	}

}
