package view;

import business.Figura;
import business.Quadrado;

public class Main {

	public static void main(String[] args) {
		// *** Exemplo de upcasting *** 
		Quadrado quadradinho = new Quadrado();
		quadradinho.setLado(5);
		
		Figura figurinha = quadradinho;
		System.out.println(String.format("[Upcasting] Área da Figura: %.2f cm2", figurinha.calcularArea()));
		
		// *** Exemplo de downcasting ***
		
		Figura figurita = new Quadrado();

		Quadrado quadradito = (Quadrado) figurita;
		quadradito.setLado(7);
		System.out.println(String.format("[Upcasting] Área da Figura: %.2f cm2", figurita.calcularArea()));
	}

}
