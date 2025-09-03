package view;

import java.util.Scanner;

import business.Calculo;
import business.Divisao;
import business.Multiplicacao;
import business.Soma;
import business.Subtracao;

public class main {

	public static void main(String[] args) {
		Scanner optionScanner = new Scanner(System.in);
		Scanner valueScanner = new Scanner(System.in);
        String operacao;
        int terminou = 0;
        
        Calculo calculo;
        
        double v1 = -1234567.89;
        double v2 = -1234567.89;
        
        do {
        	
        v1 = -1234567.89;
        v2 = -1234567.89;

        System.out.println("Olá, escolha sua operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("Qualquer outro número termina o programa:");

        
            System.out.print("Operação: ");
            operacao = optionScanner.nextLine();

            switch (operacao) {
                case "1":
                	System.out.print("\n-- Soma --\n");
                	
                	System.out.print("Insira o primeiro número: ");
                	while (v1 == -1234567.89) {
                    if (valueScanner.hasNextDouble()) { // Check if the input is a valid double
                        v1 = valueScanner.nextDouble();
                    	}
                	}
                	System.out.println("--");
                	
                	System.out.print("Insira o segundo número: ");
                	while (v2 == -1234567.89) {
                        if (valueScanner.hasNextDouble()) { // Check if the input is a valid double
                            v2 = valueScanner.nextDouble();
                        }
                    }
                    calculo = new Soma(v1, v2);
                    calculo.calcular();
                    
                    System.out.printf("Sua %s é igual a %.2f ! \n", calculo.mostrarOperacao(), calculo.mostrarResultado());
                    System.out.println("");
                    break;
                case "2":
                	System.out.print("\n-- Subtração --\n");
                	
                	System.out.print("Insira o primeiro número: ");
                	while (v1 == -1234567.89) {
                    if (valueScanner.hasNextDouble()) { // Check if the input is a valid double
                        v1 = valueScanner.nextDouble();
                    	}
                	}
                	System.out.println("--");
                	
                	System.out.print("Insira o segundo número: ");
                	while (v2 == -1234567.89) {
                        if (valueScanner.hasNextDouble()) { // Check if the input is a valid double
                            v2 = valueScanner.nextDouble();
                        }
                    }
                    calculo = new Subtracao(v1, v2);
                    calculo.calcular();
                    
                    System.out.printf("Sua %s é igual a %.2f ! \n", calculo.mostrarOperacao(), calculo.mostrarResultado());
                    System.out.println("");
                	break;
                case "3":
                	System.out.print("\n-- Multiplicação --\n");
                	
                	System.out.print("Insira o primeiro número: ");
                	while (v1 == -1234567.89) {
                    if (valueScanner.hasNextDouble()) { // Check if the input is a valid double
                        v1 = valueScanner.nextDouble();
                    	}
                	}
                	System.out.println("--");
                	
                	System.out.print("Insira o segundo número: ");
                	while (v2 == -1234567.89) {
                        if (valueScanner.hasNextDouble()) { // Check if the input is a valid double
                            v2 = valueScanner.nextDouble();
                        }
                    }
                    calculo = new Multiplicacao(v1, v2);
                    calculo.calcular();
                    
                    System.out.printf("Sua %s é igual a %.2f ! \n", calculo.mostrarOperacao(), calculo.mostrarResultado());
                    System.out.println("");
                	break;
                case "4":
                	System.out.print("\n-- Divisão --\n");
                	
                	System.out.print("Insira o primeiro número: ");
                	while (v1 == -1234567.89) {
                    if (valueScanner.hasNextDouble()) { // Check if the input is a valid double
                        v1 = valueScanner.nextDouble();
                    	}
                	}
                	System.out.println("--");
                	
                	System.out.print("Insira o segundo número: ");
                	while (v2 == -1234567.89) {
                        if (valueScanner.hasNextDouble()) { // Check if the input is a valid double
                            v2 = valueScanner.nextDouble();
                        }
                    }
                    calculo = new Divisao(v1, v2);
                    calculo.calcular();
                    
                    System.out.printf("Sua %s é igual a %.2f ! \n", calculo.mostrarOperacao(), calculo.mostrarResultado());
                    System.out.println("");
                	break;
                    

                default:
                	System.out.println("Até!");
                	terminou = 1;
                    break;
            }
        } while (terminou == 0);

        optionScanner.close();
        valueScanner.close();
        
        System.out.println("acabou");

	}

}
