package classes.services;

import classes.dao.IProdutoDAO;
import classes.domain.Produto;
import classes.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}