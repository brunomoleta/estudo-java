package classes.services.generic;

import classes.dao.IProdutoDAO;
import classes.domain.Produto;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}