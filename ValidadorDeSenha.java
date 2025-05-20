package Natanael;

import java.util.Scanner;

public class ValidadorDeSenha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha para validar:");
		String senha = sc.nextLine();
		
		  boolean temMaiuscula = false;
	        boolean temPrimo = false;
	        boolean temEspecial = false;
	        boolean vogalDuplicada = false;
	        
	        String vogais ="aeiouAEIOU";
	        
	        for (int i = 0; i < senha.length(); i++) {
	        	  char c = senha.charAt(i);
	        	  if (Character.isUpperCase(c)) {
	                  temMaiuscula = true;
	              }

	              if (Character.isDigit(c)) {
	                  int digito = Character.getNumericValue(c);
	                  if (digito == 2 || digito == 3 || digito == 5 || digito == 7) {
	                      temPrimo = true;
	                  }
	              }

	              if (!Character.isLetterOrDigit(c)) {
	                  temEspecial = true;
	              }

	              if (i > 0) {
	                  char anterior = senha.charAt(i - 1);
	                  if (vogais.indexOf(anterior) != -1 &&
	                      vogais.indexOf(c) != -1 &&
	                      Character.toLowerCase(anterior) == Character.toLowerCase(c)) {
	                      vogalDuplicada = true;
	                  }
	              }
	          }

	          if (temMaiuscula && temPrimo && temEspecial && !vogalDuplicada) {
	              System.out.println("Senha válida!");
	          } else {
	              System.out.println("Senha inválida. Motivos:");
	              if (!temMaiuscula) System.out.println("- Deve conter ao menos uma letra maiúscula");
	              if (!temPrimo) System.out.println("- Deve conter ao menos um número primo (2, 3, 5 ou 7)");
	              if (!temEspecial) System.out.println("- Deve conter ao menos um caractere especial");
	              if (vogalDuplicada) System.out.println("- Não pode conter vogais duplicadas seguidas");
	          }

	          sc.close();
	        }

	        

	}


