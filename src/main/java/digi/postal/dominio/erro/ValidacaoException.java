package digi.postal.dominio.erro;

public class ValidacaoException extends RuntimeException {

    private ErrosValidacao errosValidacao;

    public ValidacaoException(ErrosValidacao errosValidacao) {
        this.errosValidacao = errosValidacao;
    }
}
