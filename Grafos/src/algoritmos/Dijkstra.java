package algoritmos;

import java.util.Stack;

public class Dijkstra {

	private int[] costos;
	private Stack<Integer> conjuntoSolucion; 
	
	
	public Dijkstra(int nodoInicial, int[][] grafo){
		conjuntoSolucion = new Stack<Integer>();
		costos = new int[grafo.length];
		conjuntoSolucion.push(nodoInicial);
		for(int i = 0; i < grafo.length ; i++){
			costos[i] = grafo[nodoInicial][i];
		}
		while(conjuntoSolucion.size() != grafo.length){
			int w = buscarMenor(costos);
			conjuntoSolucion.push(w);
			for(int j = 0; j < costos.length ; j++){
				if(costos[j] > (costos[w]+grafo[w][j]) && j != nodoInicial)
					costos[j] = costos[w]+grafo[w][j];
			}
		}
		for(int i = 0; i < costos.length ; i++)
			conjuntoSolucion.pop();
		mostrar();
	}
	
	private int buscarMenor(int[] c){
		int menor = Integer.MAX_VALUE, menorId = 0;
		for(int i = 0; i < c.length ; i++){
			if(menor > c[i] && conjuntoSolucion.contains(i)==false){
				menor = c[i];
				menorId = i;
			}
		}
		return menorId;
	}
	
	private void mostrar(){
		System.out.println("El camino mas barato a todos los nodos");
		for(int i = 0; i < costos.length ; i++)
			System.out.print(costos[i] +" ");
	}
}
