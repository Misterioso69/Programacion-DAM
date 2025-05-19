package ej3;

import java.util.Iterator;

public class Electrodomestico {
	private float  precio_base = 100f;
	private String color ="blanco" ;
	private char consumo_enegico ;
	private double peso  = 5;
	
	public Electrodomestico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electrodomestico(float precio_base, String color, char consumo_enegico, double peso) {
		super();
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_enegico = consumo_enegico;
		this.peso = peso;
	}
	
	public Electrodomestico(float precio_base, double peso) {
		this.precio_base = precio_base;
		this.peso = peso ;
	}
	
	public Electrodomestico ( char consumo_enegico , String color) {
		super();
		this.consumo_enegico = consumo_enegico;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_enegico="
				+ consumo_enegico + ", peso=" + peso + "]";
	}

	public float getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(float precio_base) {
		this.precio_base = precio_base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo_enegico() {
		return consumo_enegico;
	}

	public void setConsumo_enegico(char consumo_enegico) {
		this.consumo_enegico = consumo_enegico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void comprobarConsumoEnergetico(char letra) {
		char[] letras = {'a','b','c','e','f'};
		char letra_defecto = 'f';
		for ( int i = 0 ; i<letras.length ;i++) {
			if ( letras[i]==letra ) {
				consumo_enegico = letra;
				return;
			}else {
				consumo_enegico = letra_defecto;
			}
		}
	}
	
	public void comprobarColor(String a) {
		String [] colores = {"negro","rojo","azul","gris"};
		String color_defecto = "blanco ";
		for ( int i = 0 ; i<colores.length ;i++) {
			if ( colores[i]==a ) {
				color = a;
				return;
			}else {
				color= color_defecto;
			}
		}
	}
	public double precioFinal() {
		System.out.println("Precio final");
		return 0 ;
	}
	
	
}
	