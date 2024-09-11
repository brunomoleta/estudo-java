package test;

import app.dao.ClienteDAO;
import app.dao.IClienteDAO;
import app.domain.Cliente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClienteTest {

        @Test
        public void cadastrarTest() throws Exception {
            IClienteDAO dao = new ClienteDAO();

            Cliente cliente = new Cliente();
            cliente.setCodigo("99");
            cliente.setNome("José Alves");

            Integer qtd = dao.cadastrar(cliente);
            assertEquals(1, (int) qtd);

            Cliente clienteBD = dao.consultar(cliente.getCodigo());
            assertNotNull(clienteBD);
            assertNotNull(clienteBD.getId());
            assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
            assertEquals(cliente.getNome(), clienteBD.getNome());

            Integer qtdDel = dao.excluir(clienteBD);
            assertNotNull(qtdDel);
        }
    }
