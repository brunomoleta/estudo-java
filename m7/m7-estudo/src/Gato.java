/**
 * Esta é a classe Gato class.
 * It is the blueprint from which individual cat objects are created
 * @author bruno-moleta
 * @version 1.0
 */
public class Gato {

    private String nome;
    private String raca;
    private String personalidade;

    public Gato(String nome, String raca, String personalidade) {
        this.nome = nome;
        this.raca = raca;
        this.personalidade = personalidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPersonalidade() {
        return this.personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    public void miar() {
        System.out.println("Miau!");
    }
}