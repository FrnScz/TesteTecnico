package Fibonacci;

public class Fibonacci {
    private int numero;
    
    public Fibonacci (int numero) {
        this.numero = numero;
    }
    
    public boolean pertenceASequencia () {
        int a = 0, b = 1, proximo;
        
        while(a <= numero) {
            if (a == numero) {
                return true;
            }
            proximo = a + b;
            a = b;
            b = proximo;
        }
    return false;
    }
    
    public int getNumero () {
        return numero;
    }
}
