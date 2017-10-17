package acorrer;

public class CategoriaM {
	
	private int edadMin;
	private int edadMax;
	private int id;
	private int[] top;
	private int cantCompQueFinalizaron;
	
	public CategoriaM(int eMin , int eMax , int i){
		edadMin = eMin;
		edadMax = eMax;
		id = i;
		top = new int[3];
		cantCompQueFinalizaron = 0;
	}

	public int getEdadMin() {
		return edadMin;
	}

	public int getEdadMax() {
		return edadMax;
	}
	
	public void agregarAlTop(Competidor obj){
		if( cantCompQueFinalizaron < 3 ){
			top[cantCompQueFinalizaron] = obj.getId();
			cantCompQueFinalizaron++;
		}
	}
	
	public boolean esCategeoria(int edad){
		if( edad >= edadMin && edad <= edadMax )
			return true;
		return false;
	}
	
	public String listar(){
		return new String(id+" "+top[0]+" "+top[1]+" "+top[2]);
	}
}
