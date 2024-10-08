package logistica;

public class Jinete {

	private int cantCaballo;

	public Jinete() {
		this.cantCaballo = 0;
	}

	public int getCaballo() {
		return cantCaballo;
	}

	public void cambiarCaballo(int caballo) {
		cantCaballo = caballo;
	}

	public int caballos(int[] distancias) {

		int distEstaciones = 0;

		for (int i = 0; i < distancias.length; i++) {

			distEstaciones = distancias[i] + distancias[i + 1];
			if (distEstaciones <= 100) {
				cambiarCaballo(getCaballo() + 1);
			}
		}

		return this.cantCaballo;
	}

}
