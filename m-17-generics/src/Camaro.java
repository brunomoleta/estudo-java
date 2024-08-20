public class Camaro extends Carro {

    public Camaro(int potenciaMotor, String cor) {
        super(potenciaMotor, "Camaro", cor);
        if (potenciaMotor < 240) {
            throw new IllegalArgumentException("A potência de motor tem que ser forte.");
        }
    }

    @Override
    public void trocarMarcha(int marchaAtual) {
        if (this.marchaAtual < 7) {
            super.trocarMarcha(marchaAtual);
            System.out.println("Agora você subiu pra marsha: " + this.marchaAtual);
        } else {
            System.out.println("Cuidado que você já está na última marcha.");
        }
    }
}