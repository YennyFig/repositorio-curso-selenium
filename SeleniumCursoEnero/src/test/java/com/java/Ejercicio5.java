package com.java;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Crea un programa donde te pida un número y muestra si es positivo o negativo y si es par o impar
		
		int num = 20;
		
		if (num > 0) {
			
			System.out.print(num  + " " + "Es un número positivo ");
			
		}	
			
		if (num < 0) {
			
			System.out.print(num  + " " + "Es un número negativo ");
		}
			
		if (num % 2 == 0) {
			
			System.out.print(num  + " " + "Es un número par ");
		}else {
				
			System.out.print(num  + " " + "Es un número impar ");
			}
			
	}
}


