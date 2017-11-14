package algoritmos;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	private Queue<Integer> cola;
	private int[] distancia;

	public BFS(int[][] grafo, int nodoInicial) {

		// Inicializo el vector de acceso con valores negativos

		distancia = new int[grafo.length];
		cola = new LinkedList<Integer>();
		int nodoActual;

		for (int i = 0; i < distancia.length; i++) {
			distancia[i] = Integer.MIN_VALUE;
		}

		distancia[nodoInicial] = 0;
		nodoActual = nodoInicial;
		cola.add(nodoInicial);

		while (!cola.isEmpty()) {

			if (buscarAdyacencia(nodoActual, grafo)) {
				for (int i = 0; i < distancia.length; i++) {
					if (grafo[nodoActual][i] == 1 && distancia[i] == Integer.MIN_VALUE) {
						cola.add(i);
						distancia[i] = distancia[nodoActual] + 1;
					}
				}
			} else {
				cola.poll();
				if (!cola.isEmpty()) {
					nodoActual = cola.peek();
				}
			}

		}

		// Muestro por pantalla el resultado final
		mostrar();
	}

	private void mostrar() {
		System.out.print("Busqueda en anchura\n");
		for (int i = 0; i < distancia.length; i++)
			System.out.print(distancia[i] + " ");
	}

	private boolean buscarAdyacencia(int nd, int[][] grafo) {
		for (int i = 0; i < grafo[nd].length; i++) {
			if (grafo[nd][i] == 1 && distancia[i] == Integer.MIN_VALUE) {
				return true;
			}
		}
		return false;
	}

}
