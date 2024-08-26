import app.Pessoas;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PessoasTest {

    @Test
    public void testPositivo() {
        String mockInput = "Tamara\nRoberto\nJoao\nMariana\nJannaina\nCawan";
        InputStream in = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(in);

        String mockResultado = "Jannaina, Mariana, Tamara";

        Pessoas pessoas = new Pessoas(new Scanner(System.in));

        pessoas.adicionarVariosNomes(6);
        pessoas.separarPessoasPorGenero();

        String listaMulheres = String.join(", ", pessoas.getMulheres());

        assertEquals(mockResultado, listaMulheres);
    }

    @Test
    public void testNegativo() {
        String mockInput = "Tamara\nRoberto\nJoao\nMariana\nJannaina\nCawan";
        InputStream in = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(in);

        String mockHomens = "Roberto, Joao, Cawan";

        Pessoas pessoas = new Pessoas(new Scanner(System.in));

        pessoas.adicionarVariosNomes(6);
        pessoas.separarPessoasPorGenero();

        String listaMulheres = String.join(", ", pessoas.getMulheres());

        assertNotEquals(mockHomens, listaMulheres);
    }

}