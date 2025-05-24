package Atvs;

import java.util.Scanner;

public class RankingHerois {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX_HEROIS = 10;

        String[] nomes = new String[MAX_HEROIS];
        int[] forca = new int[MAX_HEROIS];
        int[] intel = new int[MAX_HEROIS];
        int[] vel = new int[MAX_HEROIS];
        double[] poderes = new double[MAX_HEROIS];

        int totalherois = 0;
        int opcao;

        do {
            System.out.println("\n==== MENU DE OPÇÕES ====");
            System.out.println("1 - Adicionar herói");
            System.out.println("2 - Mostrar Ranking");
            System.out.println("3 - Comparar dois heróis");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                if (totalherois < MAX_HEROIS) {
                    sc.nextLine();

                    System.out.print("Nome do herói: ");
                    nomes[totalherois] = sc.nextLine();

                    System.out.print("Força (0-100): ");
                    forca[totalherois] = sc.nextInt();

                    System.out.print("Inteligência (0-100): ");
                    intel[totalherois] = sc.nextInt();

                    System.out.print("Velocidade (0-100): ");
                    vel[totalherois] = sc.nextInt();

                    poderes[totalherois] = forca[totalherois] * 0.5 +
                                           intel[totalherois] * 0.3 +
                                           vel[totalherois] * 0.2;

                    totalherois++;
                    System.out.println("Herói adicionado com sucesso!");
                } else {
                    System.out.println("Limite de heróis atingido.");
                }

            } else if (opcao == 2) {
                for (int i = 0; i < totalherois - 1; i++) {
                    for (int j = i + 1; j < totalherois; j++) {
                        if (poderes[j] > poderes[i]) {
                            String tempNome = nomes[i];
                            nomes[i] = nomes[j];
                            nomes[j] = tempNome;

                            int tempF = forca[i];
                            forca[i] = forca[j];
                            forca[j] = tempF;

                            int tempI = intel[i];
                            intel[i] = intel[j];
                            intel[j] = tempI;

                            int tempV = vel[i];
                            vel[i] = vel[j];
                            vel[j] = tempV;

                            double tempP = poderes[i];
                            poderes[i] = poderes[j];
                            poderes[j] = tempP;
                        }
                    }
                }

                System.out.println("\n==== RANKING DE HERÓIS ====");
                for (int i = 0; i < totalherois; i++) {
                    System.out.printf("%dº - %s | Poder: %.2f\n", i + 1, nomes[i], poderes[i]);
                }

            } else if (opcao == 3) {
                if (totalherois < 2) {
                    System.out.println("Adicione pelo menos dois heróis antes de comparar.");
                } else {
                    sc.nextLine();
                    System.out.print("Nome do primeiro herói: ");
                    String nome1 = sc.nextLine();

                    System.out.print("Nome do segundo herói: ");
                    String nome2 = sc.nextLine();

                    int indice1 = -1, indice2 = -1;

                    for (int i = 0; i < totalherois; i++) {
                        if (nomes[i].equalsIgnoreCase(nome1)) {
                            indice1 = i;
                        }
                        if (nomes[i].equalsIgnoreCase(nome2)) {
                            indice2 = i;
                        }
                    }

                    if (indice1 == -1 || indice2 == -1) {
                        System.out.println("Um ou ambos os heróis não foram encontrados.");
                    } else {
                        System.out.println("\nComparando:");
                        System.out.printf("%s - Poder: %.2f\n", nomes[indice1], poderes[indice1]);
                        System.out.printf("%s - Poder: %.2f\n", nomes[indice2], poderes[indice2]);

                        if (poderes[indice1] > poderes[indice2]) {
                            System.out.println(nomes[indice1] + " é mais poderoso!");
                        } else if (poderes[indice1] < poderes[indice2]) {
                            System.out.println(nomes[indice2] + " é mais poderoso!");
                        } else {
                            System.out.println("Os dois têm o mesmo poder!");
                        }
                    }
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
