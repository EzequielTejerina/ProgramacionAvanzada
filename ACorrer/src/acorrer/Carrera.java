package acorrer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrera {
	
	private ArrayList<Competidor> competidores;
	private ArrayList<CategoriaF> categoriasFemeninas;
	private ArrayList<CategoriaM> categoriasMasculinas;
	private int[] competidoresFin;
	
	public Carrera(String path) throws FileNotFoundException{
		int cantCompetidores , cantCatF , cantCatM , cantCompFin;
		Scanner sc = new Scanner(new File(path));
		competidores = new ArrayList<Competidor>();
		categoriasFemeninas = new ArrayList<CategoriaF>();
		categoriasMasculinas = new ArrayList<CategoriaM>();
		cantCompetidores = sc.nextInt();
		cantCatF = sc.nextInt();
		cantCatM = sc.nextInt();
		cantCompFin = sc.nextInt();
		competidoresFin = new int[cantCompFin];
		for( int i = 0 ; i < cantCatF ; i++)
			categoriasFemeninas.add(new CategoriaF(sc.nextInt(),sc.nextInt(),i+1));
		for( int i = 0 ; i < cantCatM ; i++)
			categoriasMasculinas.add(new CategoriaM(sc.nextInt(),sc.nextInt(),i+1));
		for( int i = 0 ; i < cantCompetidores ; i++){
			int edad = sc.nextInt();
			String s = sc.nextLine();
			competidores.add(new Competidor(edad,s,i+1));
		}
		for( int i = 0 ; i < cantCompFin ; i++){
			competidoresFin[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public void resolverCarrera() throws FileNotFoundException{
		Competidor aux;
		PrintWriter salida = new PrintWriter(new File("carrera.out"));
		for( int i = 0 ; i < competidoresFin.length ; i++){
			aux = obtenerCompetidor(competidoresFin[i]);
			if( aux .getSexo() == "F"){
				agregarAlTopF(aux);
			}
			else {
				agregarAlTopM(aux);
			}
		}
		for( CategoriaF obj : categoriasFemeninas){
			salida.println(obj.listar());
		}
		for( CategoriaM obj : categoriasMasculinas){
			salida.println(obj.listar());
		}
		salida.close();
	}
	
	private void agregarAlTopM(Competidor aux) {
		for( CategoriaM obj : categoriasMasculinas){
			if( obj.esCategeoria(aux.getEdad()))
				obj.agregarAlTop(aux);
		}
	}

	private void agregarAlTopF(Competidor aux) {
		for( CategoriaF obj : categoriasFemeninas){
			if( obj.esCategeoria(aux.getEdad()))
				obj.agregarAlTop(aux);
		}	
	}

	private Competidor obtenerCompetidor(int id){
		Competidor aux = null;
		for ( Competidor obj : competidores){
			if(obj.getId() == id){
				aux = obj;
			}
		}
		return aux;
	}
}
