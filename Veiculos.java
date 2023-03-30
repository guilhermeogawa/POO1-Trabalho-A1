package br.com.atacado.dominio;

import java.time.LocalDate;

public  class Veiculos extends Frota{

    private String placa;

    private int Frota;
    
    


    public String getPlaca() {
        return placa;
    }




    public void setPlaca(String placa) {
        this.placa = placa;
    }




    public int getFrota() {
        return Frota;
    }




    public void setFrota(int frota) {
        Frota = frota;
    }




    public Veiculos() {
    }




    public Veiculos(String placa, int frota) {
        this.placa = placa;
        Frota = frota;
    }




    public Veiculos(int codigo, String placa, int frota) {
        super(codigo);
        this.placa = placa;
        Frota = frota;
    }




    public Veiculos(int codigo, String descricao, LocalDate dataInsert, int codigoFrota, String placa, int frota) {
        super(codigo, descricao, dataInsert, codigoFrota);
        this.placa = placa;
        Frota = frota;
    }




    




    

    
}
