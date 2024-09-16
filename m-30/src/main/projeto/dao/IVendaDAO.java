package main.projeto.dao;


import main.projeto.dao.generic.IGenericDAO;
import main.projeto.domain.Venda;
import main.projeto.exceptions.DAOException;
import main.projeto.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author roberto.dinamite
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}