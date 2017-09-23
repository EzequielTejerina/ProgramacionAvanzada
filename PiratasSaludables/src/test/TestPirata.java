package test;

import org.junit.Assert;
import org.junit.Test;

import piratassaludables.Pirata;

public class TestPirata {

	@Test
	public void test() {
	
		Pirata p1 = new Pirata();
		Pirata p2 = new Pirata();
		p1.beberGrog();
		p1.beberGrog();
		p1.beberGrog();
		p1.beberJugo();
		p1.atacar(p2);
		Assert.assertEquals(3, p1.getPuntaje(), 0.1);
		
	}

}
