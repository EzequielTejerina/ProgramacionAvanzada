package depositossubeterraneos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	
	private ArrayList<Deposito> depositos;
	private double volumenIngresado;
	
	public Almacen(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		int cantDep = sc.nextInt();
		depositos = new ArrayList<Deposito>();
		for( int i = 0 ; i < cantDep ; i++){
			depositos.add(new Deposito(sc.nextDouble(),sc.nextInt()));
		}
		volumenIngresado = sc.nextDouble();
		sc.close();
	}
	
	private double obtenerVolumenTotalDelAlmacen(){
		double resultado=0;
		for(Deposito obj : depositos){
			resultado += obj.getSuperficie() * obj.getProfundidad();
		}
		return resultado;
	}
	
	public void resolverProblema() throws FileNotFoundException{
		double volumenUsado = volumenIngresado;
		int cantDepUsados = 0, nivelFluido = depositos.get(0).getProfundidad();
		PrintWriter salida = new PrintWriter(new File("depositos.out"));
		if( obtenerVolumenTotalDelAlmacen() < volumenIngresado ){
			int desborde = (int) (volumenIngresado-obtenerVolumenTotalDelAlmacen());
			salida.println("Desborda: "+ desborde );
		}
		else {
			while( volumenUsado > 0 ){
				for( Deposito obj : depositos){
					if( obj.getProfundidad() >= nivelFluido){
						if(obj.getUsado() == 0){
							cantDepUsados++;
							obj.setUsado();
						}
						volumenUsado -= obj.getSuperficie();
					}
				}
				nivelFluido--;
			}
			salida.println(cantDepUsados);
			salida.println(nivelFluido);
		}
		salida.close();
	}
}


