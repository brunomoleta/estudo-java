import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List {
    private static final ArrayList<String> listaFrutas = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    private void adicionarFruta(int n) {
    System.out.println("Escolha sua " + n + "ª fruta:");
        String fruit = scanner.nextLine();
        listaFrutas.add(fruit);
        Collections.sort(listaFrutas);
    }

    public void adicionarVariasFrutas(int numFruits) {
        for (int i = 0; i < numFruits; i++) {
            adicionarFruta(i+1);
        }
    }

    private ArrayList<String> getLista() {
        return listaFrutas;
    }

    public void imprimirLista() {
        System.out.println("Em ordem alfabética, sua lista de frutas é: " + getLista());
    }
}