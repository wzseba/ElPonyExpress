package testLogPony;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import logistica.Jinete;

class Caballo {

	@Test
	void test() {
		Jinete jinete = new Jinete();

		assertEquals(1, jinete.caballos(new int[] { 18, 15 }));
	}

}
