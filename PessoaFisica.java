package br.com.atacado.dominio;

import java.time.LocalDate;

public class PessoaFisica extends BasePessoa {
    
    private String cpf;
    
    private String rg;
    
    private String sexo;
    
    private String raca;

    private String nacionalidade;

    private String naturalidade;

    private String nomePai;

    private String nomeMae;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public PessoaFisica(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao) {
        super(codigoPessoa, nome, email, site, dataInclusao);
    }
    
    public PessoaFisica(int codigopessoa, String nome, String email, String site, LocalDate datanIclusao, String cpf,
            String rg, String sexo, String raca, String nacionalidade, String naturalidade, String nomePai,
            String nomeMae) {
        super(codigopessoa, nome, email, site, datanIclusao);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.raca = raca;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    

    
    
}
