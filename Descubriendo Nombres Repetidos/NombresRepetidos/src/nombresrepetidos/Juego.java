package nombresrepetidos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Juego{
	
	//private Info[] nombresChicos;
	private ArrayList<Info> nombresAcumulados;
	private int top;
	
	public Juego(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		int flag = 0;
		int cantidadNombres = sc.nextInt();
		top = sc.nextInt();
		nombresAcumulados = new ArrayList<Info>();
		for ( int i = 0 ; i < cantidadNombres ; i++){
			Info dato = new Info(sc.next());
			for( int j = 0 ; j < nombresAcumulados.size() && flag==0; j++){
				if(dato.getNombre().equals((nombresAcumulados.get(j)).getNombre())){
					(nombresAcumulados.get(j)).incrementarCantidad();
					flag = 1;
				}
			}
			if( flag == 0){
				nombresAcumulados.add(dato);
			}
			else flag = 0;
		}
		/*nombresChicos = new Info[sc.nextInt()];
		top = sc.nextInt();
		for( int i = 0; i<nombresChicos.length; i++){
			nombresChicos[i] = new Info(sc.next());
		}*/
		sc.close();
	}
	
	public void resolverJuego() throws IOException {
		PrintWriter salida = new PrintWriter(new File("nombres.out"));
		/*ArrayList<Info> nombresAcumulados = new ArrayList<Info>();
		int flag = 0;
		for(int i = 0; i < nombresChicos.length; i++){
			for(Info dato : nombresAcumulados){
				if((dato.getNombre()).equals(nombresChicos[i].getNombre()) ){
					dato.incrementarCantidad();
					flag = 1;
				}
			}
			if(flag == 0){
				nombresAcumulados.add(nombresChicos[i]);
				flag = 0;
			}
		}*/
		Collections.sort(nombresAcumulados,comparator);
		for(int i = 0 ; i < top ; i++){
		salida.println(nombresAcumulados.get(i).toString());
		}
		salida.close();
	}
	
	Comparator<Info> comparator = new Comparator<Info>(){
		public int compare(Info i1, Info i2) {
			return i2.getCantidad()-i1.getCantidad();
		}
	};

}
