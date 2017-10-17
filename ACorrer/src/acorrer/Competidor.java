package acorrer;

public class Competidor {
	
	private int edad;
	private String sexo;
	private int id;
	
	public Competidor(int e , String s , int i){
		edad = e;
		sexo = s;
		id = i;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Competidor [edad=" + edad + ", sexo=" + sexo + ", id=" + id + "]";
	}
	
	
}
