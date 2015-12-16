package es.shaddow.headfirst.designpatterns.singleton;

// Implementación válida con múltiples hilos 
//  - La instancia se comprueba dos veces antes de ser creada
//    La primera comprobación no está sincronizada, por lo que es rápida.
//    La segunda comprobación se realiza de forma sincronizada por lo que es más lento, pero solo se llegaría aquí la primera vez.
//  - En versiones anteriores a java 1.5 podría fallar. JAVA 1.5+ REQUIRED
public class Singleton {

	private static volatile Singleton uniqueInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

	// other useful methods here
	public String getDescription() {
		return "I'm a double cheched initialized Singleton!";
	}
}
