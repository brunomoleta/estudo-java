import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fisica extends PessoaAbstrata implements IFisica {
    private List<String> hobbies = new ArrayList<>();
    private boolean sabeNadarNoRio;
    private String comidaPredileta;

    public Fisica(String nome, Date dataNascimento, String endereco) {
        super(nome, dataNascimento, endereco);
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public boolean getSabeNadarNoRio() {
        return sabeNadarNoRio;
    }

    public void setSabeNadarNoRio(boolean sabeNadarNoRio) {
        this.sabeNadarNoRio = sabeNadarNoRio;
    }

    public String getComidaPredileta() {
        return comidaPredileta;
    }

    public void setComidaPredileta(String comidaPredileta) {
        this.comidaPredileta = comidaPredileta;
    }
}