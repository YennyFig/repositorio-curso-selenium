package com.ejerciciosjava;

public class Cat {

	public static boolean isCatPlaying(boolean verano, int temperatura) {

		if (verano) {

			if (temperatura >= 25 && temperatura <= 45) {
				return true;
			} else {
				return false;
			}
		} else if (temperatura >= 25 && temperatura <= 35) {
			return true;
		} else {
			return false;
		}
	}
}
