package SequenciasLogicas;

public class Principal {
    public static void main (String[] args) {
        
        var sequenciaA = new SequenciasLogicas();
        var sequenciaB = new SequenciasLogicas();
        var sequenciaC = new SequenciasLogicas();
        var sequenciaD = new SequenciasLogicas();
        var sequenciaE = new SequenciasLogicas();
        var sequenciaF = new SequenciasLogicas();
        
        
        System.out.println("Próximo elemento de A: " + sequenciaA.proximoElementoA() + "\n");
        System.out.println("Próximo elemento de B: " + sequenciaB.proximoElementoB() + "\n");
        System.out.println("Próximo elemento de C: " + sequenciaC.proximoElementoC() + "\n");
        System.out.println("Próximo elemento de D: " + sequenciaD.proximoElementoD() + "\n");
        System.out.println("Próximo elemento de E: " + sequenciaE.proximoElementoE() + "\n");
        System.out.println("Próximo elemento de F: " + sequenciaF.proximoElementoF());
    }
}
