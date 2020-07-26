package digi.postal.dominio;

import digi.postal.dominio.erro.ErrosValidacao;

public class Usuario {

    private String nome;

    private CPF cpf;

    private Endereco endereco;

    public Usuario(String nome, CPF cpf, Endereco endereco) {
        ErrosValidacao errosValidacao = new ErrosValidacao();
        errosValidacao.add("");

    }

}
