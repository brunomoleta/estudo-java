public class Wrapper {
    private int numeroPequeno;


    public void transformarPrimitiveEmWrapper(Integer numeroWrapper) {
        if (numeroWrapper > 99 || numeroWrapper < 1) {
            throw new IllegalArgumentException("O número " + numeroWrapper + " deve ser menor que 100 e maior que 0");
        }

        this.numeroPequeno = numeroWrapper;
    }

    private Integer getNumeroPequeno() {
        return numeroPequeno;
    }

    public void imprimirNumeroPequeno() {
        System.out.println(getNumeroPequeno());
    }

}
