package logistica;

public class Jinete {

	public Jinete() {
	}

	public int caballos(int[] distancias) {
		/*
		 * distancias es la distancia en millas de una estación hasta la otra
		 */

		int distanciaEntreEstaciones = 0;
		int cantCaballos = 1;

		for (int i = 0; i < distancias.length; i++) {

			if (distancias[i] > 100) {
				throw new Error("Ruta invalida");
			}

			if (distanciaEntreEstaciones + distancias[i] > 100) {
				cantCaballos++;
				distanciaEntreEstaciones = distancias[i];
			} else {
				distanciaEntreEstaciones += distancias[i];
			}
		}

		return cantCaballos;
	}

	public static void main(String[] args) {

		Jinete jinete = new Jinete();

		int sumaArreglo = jinete.caballos(new int[] { 43, 23, 40, 13 });
		System.out.println(sumaArreglo);
	}

}
