package piratassaludables;

public class Saludable extends Estado {
	private int contadorGrog;
	private int contadorJugo;
	private int ataque;
	private int defensa;
	
	public Saludable(){
		contadorGrog = 0;
		contadorJugo = 0;
		ataque = 5;
		defensa = 2;
	}
	@Override
	public Estado beberGrog() {
		if(++contadorGrog == 3)
			return new Escorbuto();
		return this;
	}

	@Override
	public Estado beberJugo() {
		if(++contadorJugo == 1)
			return new Hipersaludable();
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

