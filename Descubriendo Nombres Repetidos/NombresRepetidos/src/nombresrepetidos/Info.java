package nombresrepetidos;

public class Info{

	private String nombre;
	private int cantidad;
	
	public Info(String nom){
		nombre = nom;
		cantidad = 1;
	}
	
	public void incrementarCantidad(){
		cantidad++;
	}
	
	public String getNombre(){
		return new String(this.nombre);
	}
	
	public int getCantidad(){
		return this.cantidad;
	}

	public String toString() {
		return nombre + " " +cantidad ;
	}
	
	
}
