package rettangolo;

public class Rettangolo {
	private int base;
	private int altezza;


public Rettangolo(int base, int altezza) {
	this.base=base;
	this.altezza=altezza;
}


public Rettangolo() {
	base = 0;
	altezza =0;
}




public int getBase() {
	return base;
}


public void setBase(int base) {
	this.base = base;
}


public int getAltezza() {
	return altezza;
}


public void setAltezza(int altezza) {
	this.altezza = altezza;
}


public void stampa() {
	System.out.println("Rettangolo" + "base"  + this.getBase() + "Altezza" + this.getAltezza());
}

public void perimetro() {
	
	int perimetro = (this.base+ this.altezza)*2;
	System.out.println("Il perimetro è: " + perimetro);
	
}

public void area() {
	int area = (this.base*this.altezza);
	System.out.println("L'area è: " + area);
}


}
