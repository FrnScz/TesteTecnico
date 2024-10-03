package Fibonacci;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        int numeroInformado = scanner.nextInt();
        
        var fibonacci = new Fibonacci(numeroInformado);
        if (fibonacci.pertenceASequencia()) {
            System.out.println(fibonacci.getNumero() + " pertence a sequência de Fibonacci.");
        }
        else {
            System.out.println(fibonacci.getNumero() + " não pertence a sequência de Fibonacci");
        }
    }
}
