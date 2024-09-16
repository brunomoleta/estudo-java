package main.projeto.services;


import main.projeto.dao.IProdutoDAO;
import main.projeto.domain.Produto;
import main.projeto.services.generic.GenericService;

/**
 * @author roberto.dinamite
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}