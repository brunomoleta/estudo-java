package services;

import dao.IContratoDao;

public class ContratoService implements IContratoService {
    private final IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar(String palavra) {
        contratoDao.buscar();
        return palavra + " " + palavra;
    }

    @Override
    public String excluir(String id) {
        contratoDao.excluir();
        return id + " excluído";
    }

    @Override
    public String atualizar(String perfil){
        contratoDao.atualizar();
        return perfil + " atualizado com sucesso";
    }
}
