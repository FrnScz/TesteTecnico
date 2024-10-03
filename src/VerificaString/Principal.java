package VerificaString;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra:");
        var input = scanner.nextLine();
        var contador = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char letra = input.charAt(i);
            
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        
        if (contador > 0) {
            System.out.println("A letra 'a' (maiuscula ou minuscula) ocorre: " + contador + " vez (es) na string.");
        }
        else {
            System.out.println("A letra 'a' (maiuscula ou minuscula) não foi encontrada na string.");
        }
        
    }
}
