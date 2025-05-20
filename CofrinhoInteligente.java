package Natanael;

import java.util.Scanner;

public class CofrinhoInteligente {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas moedas você tem de R$0,01 ?");
		int cent_1 =sc.nextInt();
		System.out.println("Quantas moedas você tem de R$0,05 ?");
		int cent_5 =sc.nextInt();
		System.out.println("Quantas moedas você tem de R$0,10 ?");
		int cent_10 =sc.nextInt();
		System.out.println("Quantas moedas você tem de R$0,25 ?");
		int cent_25 =sc.nextInt();
		System.out.println("Quantas moedas você tem de R$0,50 ?");
		int cent_50 =sc.nextInt();
		System.out.println("Quantas moedas você tem de R$1,00 ?");
		int cent_100 =sc.nextInt();
		
	    double total = (cent_1 * 0.01) +
	    		       (cent_5 * 0.05) + 
	    		       (cent_10 * 0.10) +
	    		       (cent_25 * 0.25) + 
	    		       (cent_50 * 0.50) +
	    		       (cent_100 * 1.00) ;
	    
	    System.out.printf("Seu total é R$%.2f em moedas.\n", total);
	    
	    double faltapracem = (100 - total);
	    
	    System.out.printf("Faltam R$%.2f pra R$100,00. \n" , faltapracem);

	    	
	   
	   
	    		
		
		
		

	}

}
