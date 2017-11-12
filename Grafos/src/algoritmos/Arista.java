package algoritmos;

public class Arista {

	private int nodo1;
	private int nodo2;
	
	public Arista(int n1, int n2){
		nodo1 = n1;
		nodo2 = n2;
	}

	public int getNodo1() {
		return nodo1;
	}

	public int getNodo2() {
		return nodo2;
	}
	
	public void mostrar(){
		System.out.println(nodo1 +" "+ nodo2);
	}
}
