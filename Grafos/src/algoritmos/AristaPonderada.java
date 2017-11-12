package algoritmos;

public class AristaPonderada {

	private int nodo1;
	private int nodo2;
	private int peso;
	
	public AristaPonderada(int n1, int n2, int p){
		nodo1 = n1;
		nodo2 = n2;
		peso = p;
	}

	public int getNodo1() {
		return nodo1;
	}

	public int getNodo2() {
		return nodo2;
	}

	public int getPeso() {
		return peso;
	}
	
	public void mostrar(){
		System.out.println(nodo1 +" "+ nodo2 +" "+ peso);
	}
}
