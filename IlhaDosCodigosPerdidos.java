package Atvs;

public class IlhaDosCodigosPerdidos {

	public static void main(String[] args) {
		String[] codigos = {"4H", "7A", "2C"};
        StringBuilder resultado = new StringBuilder();

        for (String codigo : codigos) {
        	
            int tamanho = codigo.length();
            int numero = Integer.parseInt(codigo.substring(0, tamanho - 1));
            char letra = codigo.charAt(tamanho - 1);

            for (int i = 0; i < numero; i++) {
                resultado.append(letra);
            }
        }

        System.out.println("Código reconstruído: " + resultado.toString());
    }


	}


