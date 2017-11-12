package algoritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kruskall {
	
	private int[] padre;
	private ArrayList<AristaPonderada> aristas;
	private ArrayList<AristaPonderada> aristasResultado;
	private int costoTotal;

	public Kruskall(int grafo[][]){
		aristas = new ArrayList<AristaPonderada>();
		aristasResultado = new ArrayList<AristaPonderada>();
		padre = new int[grafo.length];
		for(int i = 0 ; i < grafo.length ; i++){
			for(int j = 0 ; j < grafo.length ; j++){
				if(grafo[i][j] != Integer.MAX_VALUE){
					aristas.add(new AristaPonderada(i,j,grafo[i][j]));
				}
			}
		}
		Collections.sort(aristas, new Comparator<AristaPonderada>(){
			public int compare(AristaPonderada a1 , AristaPonderada a2){
				return a1.getPeso() - a2.getPeso();
			}
		});
		makeSet(grafo.length);
		costoTotal = 0;
		for(AristaPonderada obj : aristas){
			if(find(obj.getNodo1()) != find(obj.getNodo2())){
				union(obj.getNodo1(),obj.getNodo2());
				aristasResultado.add(obj);
				costoTotal += obj.getPeso();
			}
		}
		
		System.out.println("\nCosto Total del arbol de expansión minima: "+ costoTotal);
		for(AristaPonderada obj : aristasResultado){
			obj.mostrar();
		}
		
	}
	
	public void makeSet(int n){
		for(int i = 0 ; i < n ; i++)
			padre[i] = i;
	}
	
	public int find(int x){
		if( x == padre[x] )
			return x;
		else return find(padre[x]);
	}
	
	public void union(int x , int y){
		int xRoot = find(x);
		int yRoot = find(y);
		padre[xRoot] = yRoot;
	}
	
	
}
