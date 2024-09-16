package main.projeto.services;


import main.projeto.domain.Cliente;
import main.projeto.exceptions.DAOException;
import main.projeto.services.generic.IGenericService;

/**
 * @author roberto.dinamite
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}