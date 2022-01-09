package com.Exercicios.EstruturaDadosPilha;
/*Exemplo
    topo=3
    NO \ dado= 03 ref= 02 /
    NO \ dado= 02 ref= 01 /
    NO \ dado= 01 ref= null /
 */

public class Pilha {

    No topoReferenciaParaNoAnterior = null;
    //É null pois um No sempre aponta para o anterior
    // e no começo não tem anterior e nem topo

    public void push(No novoNo){// recebe o No que irá para o topo
        No refAuxiliar = topoReferenciaParaNoAnterior; //guarda a referencia atual de topo
        topoReferenciaParaNoAnterior = novoNo; //modifica o No atual do topo pelo novo
        topoReferenciaParaNoAnterior.setRefNo(refAuxiliar); //novo no recebe a referencia antiga de topo
    }

    public No pop(){ //substitui o topo pelo anterior
        if(!isEmpty()){ //se pilha não estiver vazia
            No noPoped = topoReferenciaParaNoAnterior; //pega no do topo que vai ser retirado
            topoReferenciaParaNoAnterior = topoReferenciaParaNoAnterior.getRefNo();//topo recebe anterior
            return noPoped;
        }
        return null;
    }

    public No top(){
        return topoReferenciaParaNoAnterior;
    } //retorna quem tá no topo

    public boolean isEmpty(){//verifica se a pilha esta vazia
        return topoReferenciaParaNoAnterior == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = topoReferenciaParaNoAnterior;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
