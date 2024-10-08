package classes.services;

import classes.domain.Cliente;
import classes.services.generic.GenericService;
import cliente.dao.IClienteDAO;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    //private dao.IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        //this.clienteDAO = clienteDAO;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }

}