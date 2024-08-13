import java.util.Date;

public class Juridica extends PessoaAbstrata implements IJuridica{
    private String cnpj;
    private String presidente;
    private int numeroDeColaboradores;
    private String companySector;

    public Juridica(String nome, Date dataNascimento, String endereco) {
        super(nome, dataNascimento, endereco);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public int getNumeroDeColaboradores() {
        return numeroDeColaboradores;
    }

    public void setNumeroDeColaboradores(int numeroDeColaboradores) {
        this.numeroDeColaboradores = numeroDeColaboradores;
    }

    public String getSetorDaEmpresa() {
        return companySector;
    }

    public void setSetorDaEmpresa(String companySector) {
        this.companySector = companySector;
    }
}