import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pessoas {
    private static final List<String> listaNomes = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    List<String> homens = new ArrayList<>();
    List<String> mulheres = new ArrayList<>();

    private void adicionarNome(int n) {
    System.out.println("Escolha o " + n + "º nome: (por favor coloque nomes com final de letra \"a\" ou \"o\" ");
        String nome = scanner.nextLine();
        listaNomes.add(nome);
        Collections.sort(listaNomes);
    }

    public void adicionarVariosNomes(int numeroNomes) {
        IntStream.range(0, numeroNomes).forEach(i -> adicionarNome(i + 1));
    }

    private String getListaGeral() {
        return String.join(", ", listaNomes);
    }

    private void separarPessoasPorGenero(){
        homens = listaNomes.stream()
                .filter(pessoa -> pessoa.endsWith("o"))
                .collect(Collectors.toList());

        mulheres = listaNomes.stream()
                .filter(pessoa -> pessoa.endsWith("a"))
                .collect(Collectors.toList());
    }

    public String frasePorGrupos(){
        this.separarPessoasPorGenero();
        String homensString = String.join(", ", homens);
        String mulheresString = String.join(", ", mulheres);
        return "\nHomens: " + homensString + "\nMulheres: " + mulheresString;
    }

    public void imprimirListas() {
        System.out.println("Em ordem alfabética, sua lista de pessoas é: " + getListaGeral());
        System.out.println("Por gênero, os grupos são: " + frasePorGrupos());
    }

}