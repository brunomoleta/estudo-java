package classes.exceptions;

import java.io.Serial;

public class TipoChaveNaoEncontradaException extends Exception {

    @Serial
    private static final long serialVersionUID = -1389494676398525746L;

    public void TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public void TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }
}