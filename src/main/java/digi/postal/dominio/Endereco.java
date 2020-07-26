package digi.postal.dominio;

public class Endereco {

    private String rua;

    private String numero;

    private String bairro;

    private Cidade cidade;

    public static Endereco builder() {
        return new Endereco();
    }

    public Endereco comRua(String rua) {
        this.rua = rua;
        return this;
    }

    public Endereco comBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public Endereco comNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public Endereco comCidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }
}
