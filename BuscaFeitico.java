package Atvs;

import java.util.Scanner;

public class BuscaFeitico {

	public static void main(String[] args) {

		        String[] feiticos = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite o feitiço que deseja encontrar: ");
		        String alvo = sc.nextLine();

		        int inicio = 0;
		        int fim = feiticos.length - 1;
		        int posicao = -1;

		        while (inicio <= fim) {
		            int meio = (inicio + fim) / 2;
		            int comparacao = alvo.compareToIgnoreCase(feiticos[meio]);

		            if (comparacao == 0) {
		                posicao = meio;
		                break;
		            } else if (comparacao < 0) {
		                fim = meio - 1;
		            } else {
		                inicio = meio + 1;
		            }
		        }

		        if (posicao != -1) {
		            System.out.println("Feitiço encontrado na posição " + posicao);
		        } else {
		            System.out.println("Feitiço não encontrado.");
		        }

		        sc.close();
		    }

	}

