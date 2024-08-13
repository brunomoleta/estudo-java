public class Calculo {
    private final double primeiraNota;
    private final double segundaNota;
    private final double terceiraNota;
    private final double quartaNota;

    public Calculo(double primeiraNota, double segundaNota, double terceiraNota, double quartaNota) {
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.terceiraNota = terceiraNota;
        this.quartaNota = quartaNota;
    }

    private double calcularMedia() {
        return (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4.0;
    }

    public void imprimirMedia() {
        System.out.println(calcularMedia());
    }

    public static void main(String[] args) {
        Calculo calculo = new Calculo(2.75, 9.125, 5.85, 7.5);
        calculo.imprimirMedia();
    }
}

