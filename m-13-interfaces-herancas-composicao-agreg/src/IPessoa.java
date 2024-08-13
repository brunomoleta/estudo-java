import java.util.Date;

public interface IPessoa {
    String getName();

    void setName(String nome);

    Date getBirthDate();

    void setBirthDate(Date dataNascimento);

    String getAddress();

    void setAddress(String endereco);
}