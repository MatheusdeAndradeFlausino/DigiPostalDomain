package digi.postal.dominio;

import digi.postal.dominio.erro.ValorInvalidoException;

public class CPF {

    private String valor;

    public CPF(String valor) {
        if(!isValido(valor)) {
            throw new ValorInvalidoException("Valor de cpf inválido");
        }
        this.valor = valor;
    }

    public boolean isValido(String valor) {
        return true;
    }
}
