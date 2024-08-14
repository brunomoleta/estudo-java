import fabrica.FabricaCarros;
import interfaces.PartesCarroFactory;

public class FabricaCarrosApp {
    public FabricaCarrosApp(String[] args) {
        PartesCarroFactory partesCarroEsportivoFactory = new PartesCarroEsportivoFactory();
        FabricaCarros fabricaCarrosEsportivos = new FabricaCarros(partesCarroEsportivoFactory);
        fabricaCarrosEsportivos.montarCarro();
    }

}
