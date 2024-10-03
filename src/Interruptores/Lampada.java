package Interruptores;

public class Lampada {
    private String nome;
    private boolean estado; // true para ligada, false para desligada
    
    public Lampada(String nome) {
        this.nome = nome;
        this.estado = false; // Lâmpada começa desligada
    }
    
    public void ligar() {
        estado = true;
    }
    
    public void desligar() {
        estado = false;
    }
    
    public boolean isLigada() {
        return estado;
    }
    
    public String getNome() {
        return nome;
    }
}
