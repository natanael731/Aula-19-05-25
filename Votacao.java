package Atvs;

import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);	
	
	String[] candidatos = {"Fulano", "Ciclano", "Beltrano"};
	int [] votos = {0, 0, 0};
	
	String entrada;
	
	do {
		System.out.println("Sistema de Votação para o Mascote da Turma");
        System.out.println("Digite o número do candidato ou 'fim' para encerrar a votação.");
        
        
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(i + " - " + candidatos[i]);
        }

        System.out.print("Seu voto: ");
        entrada = sc.nextLine();

        if (!entrada.equalsIgnoreCase("fim")) {
            try {
                int voto = Integer.parseInt(entrada);
                if (voto >= 0 && voto < candidatos.length) {
                    votos[voto]++;
                } else {
                    System.out.println("Número inválido. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número ou 'fim'.");
            }
        }

    } while (!entrada.equalsIgnoreCase("fim"));

   
    int totalVotos = 0;
    for (int voto : votos) {
        totalVotos += voto;
    }

    System.out.println("\nResultado da Votação:");
    for (int i = 0; i < candidatos.length; i++) {
        double porcentagem = totalVotos > 0 ? (votos[i] * 100.0) / totalVotos : 0;
        System.out.printf("%s: %d votos (%.2f%%)%n", candidatos[i], votos[i], porcentagem);
    }

    sc.close();
}
	

	
	
	}


