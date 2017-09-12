package test;

import org.junit.Before;
import org.junit.Test;

import metodosdeordenamiento.Basico;

public class TestBasicos {
	Basico b1;
	
	@Before
	public void setUp(){
		b1 = new Basico(10);
		double[] coord = {3,1,6,8,2,4,10,5,9,7};
		b1.setCoord(coord);
	}
	@Test
	public void evaluarSeleccion() {
		b1.seleccion();
		for(int i=0;i<b1.getCoord().length;i++)
			System.out.println(b1.getCoord()[i]);
	}
	@Test
	public void evaluarBurbujeo(){
		b1.burbujeo();
		for(int i=0;i<b1.getCoord().length;i++)
			System.out.println(b1.getCoord()[i]);
	}
	@Test
	public void evaluarInsercion(){
		b1.insercion();
		for(int i=0;i<b1.getCoord().length;i++)
			System.out.println(b1.getCoord()[i]);
	}

}
