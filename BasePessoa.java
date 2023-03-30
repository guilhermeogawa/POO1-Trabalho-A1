package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

    protected int codigopessoa;
    protected String nome;
    protected String email;
    protected String site;
    protected LocalDate dataInclusao;

    public int getCodigopessoa() {
        return codigopessoa;
    }
    public void setCodigoPessoa(int codigoPessoa) {
        this.codigopessoa = codigoPessoa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public LocalDate getDataInclusao() {
        return dataInclusao;
    }
    public void setDataInclusao(LocalDate datanIclusao) {
        this.dataInclusao = datanIclusao;
    }
    public BasePessoa(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao) {
        this.codigopessoa = codigoPessoa;
        this.nome = nome;
        this.email = email;
        this.site = site;
        this.dataInclusao = dataInclusao;
    }

    
}
