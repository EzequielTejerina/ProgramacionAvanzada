package nombresrepetidos;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String Path = new String ("//C://users//ezequ//Desktop//Java//Descubriendo Nombres Repetidos//NombresRepetidos//");
		Juego j1 = new Juego(Path+"nombres.in");
		try {
			j1.resolverJuego();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
