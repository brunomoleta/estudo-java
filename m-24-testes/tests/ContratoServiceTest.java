import dao.ContratoDao;
import dao.IContratoDao;
import dao.mocks.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;
import services.ContratoService;
import services.IContratoService;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();

        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar("arte");

        Assert.assertEquals("arte arte", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroBuscarTest() {
        IContratoDao dao = new ContratoDao();

        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar("arte");

        Assert.assertEquals("arte arte", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir("004");

        Assert.assertEquals("004 excluído", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroExcluirTest() {
        IContratoDao dao = new ContratoDao();

        IContratoService service = new ContratoService(dao);

        String retorno = service.excluir("004");
        Assert.assertEquals("004 excluído", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();

        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar("principal");

        Assert.assertEquals("principal atualizado com sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroAtualizarTest() {
        IContratoDao dao = new ContratoDao();

        IContratoService service = new ContratoService(dao);

        String retorno = service.atualizar("principal");
        Assert.assertEquals("principal atualizado com sucesso", retorno);
    }
}
