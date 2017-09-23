package piratassaludables;

public class Hipersaludable extends Estado{
	private int contadorGrog;
	private int contadorJugo;
	private int ataque;
	private int defensa;
	
	public Hipersaludable(){
		contadorGrog = 0;
		contadorJugo = 0;
		ataque = 10;
		defensa = -2;
	}
	@Override
	public Estado beberGrog() {
		if(++contadorGrog == 1)
			return new Saludable();
		return this;
	}

	@Override
	public Estado beberJugo() {
		if(++contadorJugo == 1)
			return new Iluminado();
		return this;
	}

	@Override
	public int atacar() {
		return ataque;
	}

	@Override
	public int defender() {
		return defensa;
	}
	
}
