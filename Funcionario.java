package br.com.atacado.dominio;

import java.time.LocalDate;

public  class Funcionario extends PessoaFisica {

    private String matricula;

    private String login;

    private String senha;

    private String dataContratacao;

    


    public String getMatricula() {
        return matricula;
    }




    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }




    public String getLogin() {
        return login;
    }




    public void setLogin(String login) {
        this.login = login;
    }




    public String getSenha() {
        return senha;
    }




    public void setSenha(String senha) {
        this.senha = senha;
    }




    public String getDataContratacao() {
        return dataContratacao;
    }




    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }




    public Funcionario(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao) {
        super(codigoPessoa, nome, email, site, dataInclusao);
    }




    public Funcionario(int codigopessoa, String nome, String email, String site, LocalDate datanIclusao, String cpf,
            String rg, String sexo, String raca, String nacionalidade, String naturalidade, String nomePai,
            String nomeMae, String matricula, String login, String senha, String dataContratacao) {
        super(codigopessoa, nome, email, site, datanIclusao, cpf, rg, sexo, raca, nacionalidade, naturalidade, nomePai,
                nomeMae);
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
        this.dataContratacao = dataContratacao;
    }

    

    
}
