package piratassaludables;

public class Escorbuto extends Estado{
	private int contadorJugo;
	private int ataque;
	private int defensa;
	
	public Escorbuto(){
		contadorJugo = 0;
		ataque = 2;
		defensa = 0;
	}
	@Override
	public Estado beberGrog() {
		return this;
	}

	@Override
	public Estado beberJugo() {
		if(++contadorJugo == 1)
			return new Saludable();
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
