package algoritmos;

public class Warshall {
	private int [][] matSolucion;
	
	public Warshall(int[][] grafo) {
		for(int k = 0; k < grafo.length; k++) {
			for(int i = 0; i < grafo.length; i++) {
				for(int j = 0; j < grafo.length; j++) {
					if( (grafo[i][j]) == 1 || (grafo[i][k] == 1 && grafo[k][j] == 1) ) {
						grafo[i][j] = 1;
					}
				}
			}
		}
		matSolucion = grafo.clone();
		
	}
	
	public void imprimir() {
		for (int i = 0; i < matSolucion.length; i++) {
			for (int j = 0; j < matSolucion.length; j++) {
				System.out.print(matSolucion[i][j] + " ");
			}
			System.out.println();
		}
	}

}
