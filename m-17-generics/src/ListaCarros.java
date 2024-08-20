import java.util.ArrayList;
import java.util.List;

public class ListaCarros {

    private static final List<Carro> listaCarros = new ArrayList<>();

    public static void listaCarros() {
        FiatUno uno = new FiatUno(70, "prateado");
        Camaro camaro = new Camaro(300, "amarelo");

        listaCarros.add(camaro);
        listaCarros.add(uno);

        System.out.println(getListaCarros());
    }

    public static String getListaCarros() {
        StringBuilder fraseCompleta = new StringBuilder("A lista de carros é: ");
        int quantidadeCarros = listaCarros.size();
        int counter = 1;

        for (Carro carro : listaCarros) {
            fraseCompleta.append(carro.getModelo());
            if (counter < quantidadeCarros) {
                fraseCompleta.append(", ");
            } else {
                fraseCompleta.append(".");
            }
            counter++;
        }
        return fraseCompleta.toString();
    }
}