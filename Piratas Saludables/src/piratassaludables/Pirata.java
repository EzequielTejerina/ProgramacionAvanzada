package piratassaludables;

public class Pirata {
	private int puntaje;
	private Estado estado;
	
	public Pirata(){
		puntaje = 0;
		estado = new Saludable();
	}
	
	public void beberJugo(){
		estado = estado.beberJugo();
	}
	
	public void beberGrog(){
		estado = estado.beberGrog();
	}
	
	public void atacar(Pirata obj){
		puntaje += (estado.atacar() - obj.estado.defender());
	}
		
	public int getPuntaje(){
		return puntaje;
	}
	
	
	
	
}
