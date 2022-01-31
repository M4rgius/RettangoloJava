package rettangolo;

import java.util.Scanner;

public class RettangoloTesting {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Inserisci il valore della base: ");
		int base = input.nextInt();
		
		System.out.println("Inserisci il valore dell'altezza: ");
		int altezza = input.nextInt();
		
		Rettangolo r = new Rettangolo(base, altezza);

		r.stampa();
		r.area();
		r.perimetro();
		
	}

}