package luchadoresjaponeses;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String Path = new String("//C://Users//Laboratorios//Desktop//prueba//LuchadoresJaponeses//");
		Torneo torneo1 = new Torneo(Path+"sumo.in");
		torneo1.resolver();
		
	}

}
