package com.java;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Crea un programa donde te pida un n�mero y muestra si es positivo o negativo y si es par o impar
		
		int num = 20;
		
		if (num > 0) {
			
			System.out.print(num  + " " + "Es un n�mero positivo ");
			
		}	
			
		if (num < 0) {
			
			System.out.print(num  + " " + "Es un n�mero negativo ");
		}
			
		if (num % 2 == 0) {
			
			System.out.print(num  + " " + "Es un n�mero par ");
		}else {
				
			System.out.print(num  + " " + "Es un n�mero impar ");
			}
			
	}
}


