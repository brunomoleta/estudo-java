import java.util.function.Predicate;

public class Reflection {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("ExemploTabela");
            Tabela tabelaAnnotation = clazz.getAnnotation(Tabela.class);
            String nomeTabela = tabelaAnnotation.nome();

            System.out.println("O nome da tabela é: " + nomeTabela);

        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada.");
            e.printStackTrace();
        }
    }
}