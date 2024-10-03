package Interruptores;

public class Interruptor {
    private Lampada lampada;
    
    public Interruptor(Lampada lampada) {
        this.lampada = lampada;
    }
    
    public void ligar() {
        lampada.ligar();
    }
    
    public void desligar() {
        lampada.desligar();
    }
    
    public Lampada getLampada() {
        return lampada;
    }
}
