import java.io.*;

public class MySingleton {

	private static MySingleton instance = null;

	/* A private Constructor prevents any other
	* class from instantiating.
	*/
	private MySingleton() { }

	/* Static 'instance' method */
	public static MySingleton getInstance( ) {
		if(instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}

	/* Other methods protected by singleton-ness */
	protected static void demoMethod( ) {
		System.out.println("demoMethod for singleton");
	}
}