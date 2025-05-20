package Natanael;

import java.util.Random;
import java.util.Scanner;

public class JokenPo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("Escolha uma opção:");
		System.out.println("-1 Pedra");
		System.out.println("-2 Papel");
		System.out.println("-3 Tesoura");
		System.out.println("-4 Lagarto");
		System.out.println("-5 Spock");
		
		int usuario = sc.nextInt();
		int computador = rd.nextInt(5) + 1;		
		
		System.out.println("Você escolheu " + nomeEscolha(usuario) );
		System.out.println("Computador escolheu " + nomeEscolha(computador) );
		
		if (usuario == computador) {
			System.out.println("Empate!");
			
		} else if (usuario == 1 && (computador == 3 || computador == 4)) {
			System.out.println("Você venceu!");
			
		} else if (usuario == 2 && (computador == 1 || computador == 5)) {
			System.out.println("Você venceu!");
			
		} else if (usuario == 3 && (computador == 2 || computador == 4)) {
			System.out.println("Você venceu!");
			
		} else if (usuario == 4 && (computador == 2 || computador == 5)) {
			System.out.println("Você venceu!");
			
		} else if (usuario == 5 && (computador == 3 || computador == 1)) {
			System.out.println("Você venceu!");
			
		}else {
			System.out.println("Computador venceu: ");
			
			
			}
		
		sc.close();
		

	}

	
	public static String nomeEscolha(int usuario) {
		if (usuario == 1) return "Pedra";
        else if (usuario == 2) return "Papel";
        else if (usuario == 3) return "Tesoura";
        else if (usuario == 4) return "Lagarto";
        else if (usuario == 5) return "Spock";
        else return "Inválido";
		
		
	}		
	}
