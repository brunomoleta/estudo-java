package main.projeto.exceptions;

/**
 * @author roberto.dinamite
 */
public class TipoChaveNaoEncontradaException extends Exception {

    private static final long serialVersionUID = -1389494676398525746L;

    public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }
}