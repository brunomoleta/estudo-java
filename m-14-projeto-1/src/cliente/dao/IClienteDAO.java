package cliente.dao;

import cliente.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

    Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}
