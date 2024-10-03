package ValorSoma;

public class Principal {
    public static void main (String[] args) {
        var indice = 12;
        var soma = 0;
        var k = 1;
        
        do {
            k += 1;
            soma += k;
            System.out.println(soma);
        } while (k < indice);
        
        System.out.println("O Valor de soma é: " + soma);
    }
}
