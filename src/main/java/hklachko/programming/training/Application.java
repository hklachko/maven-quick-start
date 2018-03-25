package hklachko.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.saludos();
	int count = app.countWords("I am the best studient");
	System.out.println ("There ara " + count + " words.");
    }
	
	public void saludos() {
		List<String> saludos = new ArrayList<>();
		saludos.add("Hello");
		saludos.add("Hola");

		
		for (String saludo:saludos) {
			System.out.println(saludo);
		}
	}

	public int countWords(String words) {

		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
}