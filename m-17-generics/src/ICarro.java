public interface ICarro {

    double acelerar(double velocidadeAtual);
    double freiar(double velocidadeAtual);
    void ligarMotor();
    void desligarMotor();
    void trocarMarcha(int marchaAtual);
}