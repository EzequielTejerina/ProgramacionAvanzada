package luchadoresjaponeses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Torneo {
	 private Luchador[] luchadores;
	 
	 public Torneo (String path) throws FileNotFoundException{
		 Scanner sc = new Scanner(new File(path));
		 luchadores = new Luchador[sc.nextInt()];
		 for( int i = 0 ; i < luchadores.length ; i++){
			 luchadores[i]= new Luchador(sc.nextInt(), sc.nextInt());
		 }
		 sc.close();
	 }
	 public void resolver()throws IOException{
		 PrintWriter salida = new PrintWriter(new File("sumo.out"));
		 
		 for(int i = 0 ; i < luchadores.length ; i++ ){
			 int cantDominadosXLuchador = 0;
			 for(int j = 0 ; j < luchadores.length ; j++ ){
				 if( luchadores[i].domina(luchadores[j]) )
					 cantDominadosXLuchador++;
			 }
			 salida.println(cantDominadosXLuchador);
		 }
		 salida.close();
	 }
}
