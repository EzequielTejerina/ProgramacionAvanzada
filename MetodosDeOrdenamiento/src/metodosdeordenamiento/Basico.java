package metodosdeordenamiento;

import java.util.Arrays;

public class Basico {
	double[] coord;
	
	public Basico(int dim){
		coord = new double[dim];
	}
	public double[] getCoord() {
		return coord;
	}
	public void setCoord(double[] coord) {
		this.coord = coord;
	}
	public void seleccion(){
		double auxiliar;
		for( int i=0 ; i < coord.length-1 ; i++ ){
			double menor = coord[i];
			for( int j=i+1 ; j < coord.length ; j++){
				if(menor > coord[j]){
					auxiliar = menor;
					menor = coord[j];
					coord[j] = auxiliar;
				}
			}
			if(menor != coord[i]){
				auxiliar = coord[i];
				coord[i] = menor;
				menor = auxiliar;
			}
		}
	}
	public void burbujeo(){
		double auxiliar;
		for( int i=0 ; i < coord.length ; i++){
			for( int j=0 ; j < coord.length-1 ; j++){
				if(coord[j] > coord[j+1] ){
					auxiliar = coord[j];
					coord[j] = coord[j+1];
					coord[j+1] = auxiliar;
				}
			}
		}
	}
	public void insercion(){
		double menor;
		for( int i=0 ; i < coord.length-1; i++){
			if(coord[i] > coord[i+1]){
				int j;
				menor = coord[i+1];
				for( j=i ; j >= 0 && menor < coord[j] ; j--){
					coord[j+1] = coord[j];	
				}
				coord[j+1] = menor;
			}
		}
	}
	
}
