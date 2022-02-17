package com.ejerciciosjava;

public class LimiteVelocidad {

	public static void main(String[] args) {
		//Crear un programa que valide el limite de velocidad de un coche cuando vaya en una carretera, zona escolar o calle normal utilizando
		//estructuras condicionales con IF
		
		int limiteVelocidad = 80; //KM*H
		int velocidadActual = 79; // KM*H
		boolean carretera = false; 
		boolean escolar = false;
		boolean calle = true;
		
		if(carretera) {
			if (velocidadActual < limiteVelocidad ) {
				System.out.println("Su velocidad actual es menor a la permitida en carretera: "+ velocidadActual);
			} else {
				System.out.println("Su velocidad actual es mayor a la permitida en carretera: "+ velocidadActual);
			}
			
		}else if (escolar){
		
			if (velocidadActual < limiteVelocidad ) {
				System.out.println("Su velocidad actual es menor a la permitida en zona escolar : "+ velocidadActual);
			} else {
				System.out.println("Su velocidad actual es mayor a la permitida en zona escolar: "+ velocidadActual);
			}
			
		}else if(calle) {
			if (velocidadActual < limiteVelocidad ) {
				System.out.println("Su velocidad actual es menor a la permitida en calle: "+ velocidadActual);
			} else {
				System.out.println("Su velocidad actual es mayor a la permitida en calle: "+ velocidadActual);
			}
			
		}
	}

		
}
