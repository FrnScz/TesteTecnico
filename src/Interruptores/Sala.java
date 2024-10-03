package Interruptores;

public class Sala {
    private Interruptor[] interruptores;
    
    public Sala (Interruptor[] interruptores) {
        this.interruptores = interruptores;
    }
    
    public void descobrirLuz () {
        System.out.println("Ligando o primeiro interruptor...");
        interruptores[0].ligar();
        try {
            Thread.sleep(10000); // Espera 10 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Desligando o primeiro interruptor e ligando o segundo...");
        interruptores[0].desligar();
        interruptores[1].ligar();
        verificarLuz();
    }
    
    private void verificarLuz() {
        for (Interruptor interruptor : interruptores) {
            Lampada lampada = interruptor.getLampada();
            String estado = lampada.isLigada() ? "ligada" : "desligada";
            System.out.println("A lâmpada " + lampada.getNome() + " está " + estado);
        }
    }
}