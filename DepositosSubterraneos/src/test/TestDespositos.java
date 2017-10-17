package test;


import java.io.FileNotFoundException;

import org.junit.Test;

import depositossubeterraneos.Almacen;

public class TestDespositos {

	@Test
	public void test() {
		try {
			Almacen a1 = new Almacen("depositos.in");
			a1.resolverProblema();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
