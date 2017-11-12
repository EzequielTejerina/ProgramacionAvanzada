package test;

import static org.junit.Assert.*;

import org.junit.Test;

import algoritmos.DFS;
import algoritmos.Kruskall;

public class TestAlgoritmo {

	@Test
	public void testKruskall() {
		int[][] grafo = new int[5][5];
		for(int i = 0; i < 5 ; i++){
			for(int j = 0; j < 5 ; j++){
				grafo[i][j] = Integer.MAX_VALUE;
			}
		}
		
		grafo[0][1] = 12;
		grafo[0][2] = 10;
		grafo[0][3] = 15;
		grafo[0][4] = 20;
		grafo[1][0] = 12;
		grafo[1][2] = 12;
		grafo[1][3] = 6;
		grafo[1][4] = 6;
		grafo[2][0] = 10;
		grafo[2][1] = 12;
		grafo[2][3] = 1;
		grafo[2][4] = 4;
		grafo[3][0] = 10;
		grafo[3][1] = 6;
		grafo[3][2] = 1;
		grafo[3][4] = 1;
		grafo[4][0] = 20;
		grafo[4][1] = 6;
		grafo[4][2] = 4;
		grafo[4][3] = 1;
		
		Kruskall k1 = new Kruskall(grafo);
	}

	@Test
	public void testDFS(){
		int[][] grafo = new int[9][9];
		grafo[0][1] = 1;
		grafo[0][2] = 1;
		grafo[0][3] = 1;
		grafo[0][4] = 1;
		grafo[2][5] = 1;
		grafo[2][7] = 1;
		grafo[6][1] = 1;
		grafo[5][6] = 1;
		grafo[7][5] = 1;
		grafo[8][4] = 1;
		grafo[8][7] = 1;
		grafo[3][7] = 1;
		
		DFS d1 = new DFS(0,grafo);
	}
}
