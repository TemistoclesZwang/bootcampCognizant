package com.Exercicios.EstruturaDadosPilha;

/*Exemplo
    topo=3
    NO \ dado= 03 ref= 02 /
    NO \ dado= 02 ref= 01 /
    NO \ dado= 01 ref= null /
 */
public class No { //criada a classe no
    private int dado; // vai receber um dado do tipo int
    private No refNo = null; // apontará para o No anterior

    public No() {
    }

    public No(int dado) { //construtor para sempre passar um int ao chamar a classe
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {//para imprimir o int e não a referencia de memoria
        return "No{" +
                "dado=" + dado +
                '}';
    }
}