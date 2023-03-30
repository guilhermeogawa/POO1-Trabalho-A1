package br.com.atacado.dominio;

import java.time.LocalDate;

public class Frota extends BaseTransporte {
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Frota() {
    }

    public Frota(int codigo) {
        this.codigo = codigo;
    }

    public Frota(int codigo, String descricao, LocalDate dataInsert, int codigoFrota) {
        super(codigo, descricao, dataInsert);
        codigo = codigoFrota;
    }

    



}