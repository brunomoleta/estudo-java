import java.util.Date;

public abstract class PessoaAbstrata implements IPessoa {
    private String nome;
    private Date dataNascimento;
    private String endereco;

    public PessoaAbstrata(String nome, Date dataNascimento, String endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public Date getBirthDate() {
        return dataNascimento;
    }

    public void setBirthDate(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getAddress() {
        return endereco;
    }

    public void setAddress(String endereco) {
        this.endereco = endereco;
    }
}