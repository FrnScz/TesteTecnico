package SequenciasLogicas;

public class SequenciasLogicas {
    private int[] sequenciaA = {1, 3, 5 ,7};
    private int[] sequenciaB = {2,4,8,16,32,64};
    private int[] sequenciaC = {0,1,4,9,16,25,36};
    private int[] sequenciaD = {4,16,36,64};
    private int[] sequenciaE = {1,1,2,3,5,8};
    private int[] sequenciaF = {2,10,12,16,17,18,19};
    
    
    public int proximoElementoA () {
        return sequenciaA[sequenciaA.length - 1] + 2;
    }
    
    public int proximoElementoB () {
        return sequenciaB[sequenciaB.length - 1] * 2;
    }
    
    public int proximoElementoC () {
        int ultimoIndice = (int) (Math.sqrt ( sequenciaC [ sequenciaC.length - 1 ] ));
        return (ultimoIndice + 1) * (ultimoIndice + 1);
    }
    
    public int proximoElementoD () {
        int ultimoIndicePar = (int) (Math.sqrt( sequenciaD [ sequenciaD.length - 1 ] ));
        return (ultimoIndicePar + 1) * (ultimoIndicePar + 1);
    }
    
    public int proximoElementoE () {
        return sequenciaE [ sequenciaE.length - 1 ] + sequenciaE [ sequenciaE.length - 2 ];
    }
    
    public int proximoElementoF () {
        return sequenciaF [ sequenciaF.length - 1 ] + 1;
    }
    
}
