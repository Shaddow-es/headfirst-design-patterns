package es.shaddow.headfirst.designpatterns.singleton;

// Implementación válida con múltiples hilos 
//  - La instancia se inicializa de forma estática
//    Si la creación de la instancia es pesada, se recomienda utilizar otro método que sea lazy-loaded
//    El método getInstance es bueno en rendimiento al no estar sincronizado
public class Singleton {

	private static Singleton uniqueInstance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return uniqueInstance;
	}

	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
