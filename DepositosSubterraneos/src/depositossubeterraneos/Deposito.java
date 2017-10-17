package depositossubeterraneos;

public class Deposito {

	private double superficie;
	private int profundidad;
	private int usado;
	
	public Deposito(double sup, int prof){
		superficie = sup;
		profundidad = prof;
		usado = 0;
	}

	public double getSuperficie() {
		return superficie;
	}

	public int getProfundidad() {
		return profundidad;
	}
	
	public int getUsado(){
		return usado;
	}
	
	public void setUsado(){
		usado = 1;
	}
	
}
