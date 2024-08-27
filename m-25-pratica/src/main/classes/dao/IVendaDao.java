package classes.dao;

import classes.dao.generic.IGenericDAO;
import classes.domain.Venda;
import classes.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDao extends IGenericDAO<Venda, String> {
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
