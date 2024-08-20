public class FiatUno extends Carro {

    public FiatUno(int potenciaMotor, String cor) {
        super(potenciaMotor, "Uno", cor);
        if (potenciaMotor > 99) {
            throw new IllegalArgumentException("A potência de motor tem que ser pouca, senão o carro tomba.");
        }
    }

    @Override
    public void trocarMarcha(int marchaAtual) {
        if (this.marchaAtual < 4) {
            super.trocarMarcha(marchaAtual);
            System.out.println("Agora você subiu pra marsha: " + this.marchaAtual);
        } else {
            System.out.println("Cuidado que você está na última marcha. Pega leve.");
        }
    }
}