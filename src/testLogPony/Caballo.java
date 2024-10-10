package testLogPony;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import logistica.Jinete;

class Caballo {

	@Test
	void test() {
		Jinete jinete = new Jinete();
		assertEquals(1, jinete.caballos(new int[] { 18, 15 }));
		assertEquals(2, jinete.caballos(new int[] { 43, 23, 40, 13 }));
		assertEquals(3, jinete.caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		assertEquals(3, jinete.caballos(new int[] { 51, 51, 51 }));
		assertEquals(4, jinete.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}

}
