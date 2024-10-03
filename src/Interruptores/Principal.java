package Interruptores;

public class Principal {
    public static void main (String[] args) {
        Lampada lampada1 = new Lampada("Lampada 1");
        Lampada lampada2 = new Lampada("Lampada 2");
        Lampada lampada3 = new Lampada("Lampada 3");
        
        Interruptor interruptor1 = new Interruptor(lampada1);
        Interruptor interruptor2 = new Interruptor(lampada2);
        Interruptor interruptor3 = new Interruptor(lampada3);
        
        Interruptor[] interruptores = {interruptor1, interruptor2, interruptor3};
        Sala sala = new Sala(interruptores);
        
        sala.descobrirLuz();
    }
}
