package services;

public interface IContratoService {
    String salvar();

    String buscar(String palavra);
    String excluir(String id);

    String atualizar(String perfil);
}
