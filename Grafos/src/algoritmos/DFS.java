package algoritmos;

import java.util.Stack;

public class DFS {
    private int[] vectorResultado;
    private Stack<Integer> pila;
    
	public DFS(int nodoOrigen, int[][] grafo){
		vectorResultado = new int[grafo.length];
		pila = new Stack<Integer>();
		int i = 1, nodoAdyacente;
		//Inicializo el vector de acceso con valores negativos
		for(int j = 0; j < vectorResultado.length ; j++)
			vectorResultado[j] = Integer.MIN_VALUE;
		
		vectorResultado[nodoOrigen] = i;
		obtenerAdyacencia(nodoOrigen, grafo);
		while(!pila.empty()){
			nodoAdyacente = pila.pop();
			if(vectorResultado[nodoAdyacente] == Integer.MIN_VALUE)
				vectorResultado[nodoAdyacente] = ++i;
			obtenerAdyacencia(nodoAdyacente, grafo);
		}
		//Muestro por pantalla el resultado final
		mostrar();
	}
	
	private void mostrar(){
		System.out.print("\nBusqueda en profundidad\n");
		for(int i = 0 ; i < vectorResultado.length ; i++)
			System.out.print(vectorResultado[i]+" ");
	}
	
	private void obtenerAdyacencia(int nd, int [][] grafo){
		for(int i = 0; i < grafo.length ; i++){
			if(grafo[nd][i] == 1 && nd != i && vectorResultado[i] == Integer.MIN_VALUE)
				pila.push(i);
		}
	}
}
