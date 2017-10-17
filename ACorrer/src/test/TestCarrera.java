package test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import acorrer.Carrera;

public class TestCarrera {

	@Test
	public void test() {
		try {
			Carrera c1 = new Carrera("carrera.in");
			c1.resolverCarrera();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
