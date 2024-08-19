public abstract class Carro implements ICarro {
    protected int potenciaMotor;
    protected String cor;
    protected double velocidadeAtual = 0;
    protected int marchaAtual = 0;
    protected String modelo;
    protected Boolean motorLigado = false;
    protected String direcao;
    protected String sentido;

    public Carro(int potenciaMotor,
                 String modelo,
                 String cor
    ) {
        this.potenciaMotor = potenciaMotor;
        this.cor = cor;
        this.velocidadeAtual = velocidadeAtual;
        this.modelo = modelo;
    }

    @Override
    public double acelerar(double velocidadeAtual) {
        this.velocidadeAtual = this.velocidadeAtual * 1.2;
        return this.velocidadeAtual;
    }

    @Override
    public double freiar(double velocidadeAtual) {
        this.velocidadeAtual = this.velocidadeAtual * 0.75;
        return this.velocidadeAtual;
    }

    @Override
    public void ligarMotor() {
        this.motorLigado = true;
    }

    @Override
    public void desligarMotor() {
        this.motorLigado = false;
    }

    public Boolean getMotorLigado() {
        return motorLigado;
    }

    @Override
    public void trocarMarcha(int marchaAtual) {
        this.marchaAtual = this.marchaAtual + 1;
    }
}
