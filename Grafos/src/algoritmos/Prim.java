package algoritmos;

import java.util.ArrayList;

public class Prim {
	private int nodoInicio;
	private int costo;
	private int[][] matrizAdy;
	private int[][] matrizSol;
	private ArrayList<Integer> conjSolucion = new ArrayList<Integer>();
	private ArrayList<Integer> conjNS = new ArrayList<Integer>();
	private ArrayList<Integer> listaNodos = new ArrayList<Integer>();
	
	public Prim(int [][] matAdy) {
		nodoInicio = 1;
		costo = 0;
		matrizAdy = matAdy;
		
		for(int i = 1; i <= matAdy.length; i++) {
			conjNS.add(i); /*AGREGO AL CONJ NUEVO TODOS LOS ELEMENTOS DE LA MATRIZ(GRAFO) */
		}
		listaNodos = (ArrayList<Integer>) conjNS.clone();
		matrizSol = new int [matAdy.length][matAdy.length];
		for(int i = 0; i < matAdy.length; i++) {
			for( int j = 0; j < matAdy.length; j++) {
				matrizSol[i][j] = 999; /* EL 999 LO TOMO COMO INFINITO */
			}
		}
		
		int nodoATratar, x;
		
		/* PASO NODO INICIO AL CONJ_SOLUCION */
		conjSolucion.add(nodoInicio);
		
		/*AHORA SACO DEL CONJ_NS EL NODO INICIAL */
		conjNS.remove((Object)nodoInicio);
		
		while(!conjNS.isEmpty()) {
			/* BUSCO UN NODO_A_TRATAR QUE SERIA EL MENOR DE TODAS LAS DISTANCIAS
			 *  QUE OBTUVE Y LO PASO AL CONJ_SOL Y LO SACO DE CONJ_NS
			 */
			nodoATratar = buscarMenor();
			x = nodoATratar + 1;
			conjSolucion.add(x);
			conjNS.remove((Object) x);
		}
	}
	
	private int buscarMenor() {
		int menor = Integer.MAX_VALUE;
		int fila = 0;
		int col = -1; /*Lo que voy a retornar */
		
		for(Integer list : conjSolucion) {
			for( int i = 0; i < matrizAdy.length; i++) {
				if(conjNS.contains(i+1) && matrizAdy[listaNodos.indexOf(list)][i] != 999 &&
				   menor >= matrizAdy[listaNodos.indexOf(list)][i]) {
						menor = matrizAdy[listaNodos.indexOf(list)][i];
						fila = list-1;
						col = i;
				}
			}
		}
		costo += matrizAdy[fila][col];
		matrizSol[fila][col] = matrizAdy[fila][col];
		return col;
	}
	
	public void imprimir() {
		for (int i = 0; i < matrizSol.length; i++) {
			for (int j = 0; j < matrizSol.length; j++) {
				if(matrizSol[i][j] != 999) {
					System.out.println(Integer.valueOf(i+1) + " " +
				    Integer.valueOf(j+1) + " - " + matrizSol[i][j]);
				}
			}
		}
		System.out.println("El costo minimo es: " + costo);
	}

}
