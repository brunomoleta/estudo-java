import java.util.Scanner;

public class Fluxo {
    private final double[] notas = new double[4];

    public void start() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            if (i == notas.length-1) {
                System.out.println("Qual foi a sua última nota?");
            } else {
                System.out.println("Qual foi a sua " + (i+1) + "ª nota?");
            }
            this.notas[i] = sc.nextDouble();
        }

        sc.close();
    }

    private double calcularMedia() {
        double sum = 0;
        for (double nota : notas) {
            sum += nota;
        }
        return sum / notas.length;
    }
    
    private String resultadoEstudante() {
        if (this.calcularMedia() >= 7) {
            return "foi aprovado";
        } else if (this.calcularMedia() >= 5) {
            return "vai para recuperação";
        } else {
            return "foi reprovado";
        }
    }

    public void imprimirResultadoEstudante() {
        System.out.println("Te informo que você " + this.resultadoEstudante() + ". Isso porque sua média foi: " + this.calcularMedia());
    }
}

