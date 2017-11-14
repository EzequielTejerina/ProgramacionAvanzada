package test;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import algoritmos.BFS;
import algoritmos.DFS;
import algoritmos.Dijkstra;
import algoritmos.Floyd;
import algoritmos.Kruskall;
import algoritmos.Prim;
import algoritmos.Warshall;

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
	
	@Test
	public void testDijkstra(){
		int[][] grafo = new int[3][3];
		for(int i = 0; i < 3 ; i++)
			for(int j = 0; j < 3 ; j++)
				grafo[i][j] = 10000;
		/*grafo[0][1] = 10;
		grafo[0][3] = 30;
		grafo[0][4] = 100;
		grafo[1][2] = 50;
		grafo[2][4] = 10;
		grafo[3][2] = 20;
		grafo[3][4] = 60;*/
		grafo[0][1] = 8;
		grafo[0][2] = 5;
		grafo[1][0] = 3;
		grafo[2][1] = 2;
		
		Dijkstra k1 = new Dijkstra(0,grafo);
	}
	
	@Test
	public void testBFS(){
		int[][] grafo = new int[9][9];
		grafo[0][1] = 1;
		grafo[0][2] = 1;
		grafo[0][3] = 1;
		grafo[1][0] = 1;
		grafo[1][4] = 1;
		grafo[1][5] = 1;
		grafo[2][0] = 1;
		grafo[2][5] = 1;
		grafo[3][0] = 1;
		grafo[3][6] = 1;
		grafo[4][1] = 1;
		grafo[4][7] = 1;
		grafo[5][1] = 1;
		grafo[5][7] = 1;
		grafo[6][3] = 1;
		grafo[6][7] = 1;
		grafo[6][8] = 1;
		grafo[7][4] = 1;
		grafo[7][5] = 1;
		grafo[7][6] = 1;
		grafo[8][6] = 1;
		
		BFS d1 = new BFS(grafo,0);
	}
	
	@Test
	public void testFloyd(){
		int[][] grafo = new int[3][3];
		grafo[0][1] = 8;
		grafo[1][0] = 3;
		grafo[2][1] = 2;
		grafo[0][2] = 5;
		
		Floyd d1 = new Floyd(grafo);
		d1.resolver();
	}
	
	@Test
	public void testWarshall() {
		
		int[][] grafo = {{0,1,0,0},
						 {0,0,1,0},
						 {1,0,0,1},
						 {0,0,0,0}};
		Warshall w1 = new Warshall(grafo);
		w1.imprimir();
	}
	
	@Test
	public void TestPrim() {

		int x = 999;
		int matAdy[][] = {{x,12,10,15,20},
						  {12,x,12,6,6},
						  {10,12,x,1,4},
						  {15,6,1,x,1},
						  {20,6,4,1,x}};

		Prim p1 = new Prim(matAdy);
		p1.imprimir();
	}
}
