public class Test {
    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();

            wrapper.transformarPrimitiveEmWrapper(42);
            wrapper.imprimirNumeroPequeno();  // Shouldn't execute as exception is thrown

            wrapper.transformarPrimitiveEmWrapper(123);
            wrapper.imprimirNumeroPequeno();  // Shouldn't execute as exception is thrown

            wrapper.transformarPrimitiveEmWrapper(0);
            wrapper.imprimirNumeroPequeno();  // Shouldn't execute as exception is thrown

    }
}
