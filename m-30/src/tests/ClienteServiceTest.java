package tests;


import main.projeto.dao.IClienteDAO;
import main.projeto.domain.Cliente;
import main.projeto.exceptions.DAOException;
import main.projeto.exceptions.TipoChaveNaoEncontradaException;
import main.projeto.services.ClienteService;
import main.projeto.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.dao.ClienteDaoMock;

/**
 * @author roberto.dinamite
 *
 */
public class ClienteServiceTest {

    private final IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Roberto Dinamite");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("BA");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setCep("119999");
    }

    @Test
    public void pesquisarCliente() throws DAOException {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() throws DAOException {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        cliente.setNome("roberto dinamite");
        clienteService.alterar(cliente);

        Assert.assertEquals("roberto dinamite", cliente.getNome());
    }
}