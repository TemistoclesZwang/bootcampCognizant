package com.Desafios.Banco.bancoModificado.src.Modificacoes;

import com.Desafios.Banco.bancoModificado.src.Banco;

import java.util.List;

public class ListaBancos {

    private List<Banco> listaBancos;

//!fazer um metodo aqui que retorna a lista de todos os bancos

    public List<Banco> getListaBancos() {

        return listaBancos;
    }

    public void setListaBancos(List<Banco> listaBancos) {
        this.listaBancos = listaBancos;
    }

}

