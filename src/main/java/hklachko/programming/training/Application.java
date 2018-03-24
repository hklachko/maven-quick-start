package hklachko.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.saludos();
    }
	
	public void saludos() {
		List<String> saludos = new ArrayList<>();
		saludos.add("Hello");
		saludos.add("Hola");

		
		for (String saludo:saludos) {
			System.out.println(saludo);
		}
	}
}