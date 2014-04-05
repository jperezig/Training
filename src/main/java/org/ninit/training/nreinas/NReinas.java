package org.ninit.training.nreinas;

import java.util.Arrays;

public class NReinas {
	private int[] tablero;
	private int soluciones = 0;
	private boolean found=false;

	public NReinas(int size) {
		tablero = new int[size];
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = -1;
		}
	}

	public void soluciona(int pos) {
		if (pos == tablero.length) {
			//found=false;
			soluciones++;
			System.out.println("Solucion:" + (soluciones));
			System.out.println("Solucion:" + Arrays.toString(tablero));
			return;
		}
		int j;
		for (j = 0; j < tablero.length; j++) {
			tablero[pos] = j;
			if (isSolucionParcial()) {
				soluciona(pos + 1);
				if (found){
					return;
				}
			}
		}
		if (j == tablero.length) {
			tablero[pos] = -1;
		}
	}

	public boolean isSolucionParcial() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				if (i == j || tablero[i] == -1 || tablero[j] == -1) {
					continue;
				}
				if (seComen(i, tablero[i], j, tablero[j])) {
					return false;
				}

			}
		}
		return true;
	}

	private boolean seComen(int x, int y, int x2, int y2) {

		return x == x2 || y == y2 || (x + y == x2 + y2) || (x - y == x2 - y2)
				|| (y - y2 == x - x2) || (y - y2 == x2 - x);
	}

	public static void main(String args[]) {
		NReinas nReinas = new NReinas(4);
		nReinas.soluciona(0);
	}
}
