package fabrica;

import interfaces.Motor;
import interfaces.PartesCarroFactory;
import interfaces.Portas;
import interfaces.Volante;

public class FabricaCarros {
    private final PartesCarroFactory partesCarroFactory;

    public FabricaCarros(PartesCarroFactory partesCarroFactory) {
        this.partesCarroFactory = partesCarroFactory;
    }

    public void montarCarro() {
        Volante volante = partesCarroFactory.criarVolante();
        Portas portas = partesCarroFactory.criarPortas();
        Motor motor = partesCarroFactory.criarMotor();

        volante.criarVolante();
        portas.criarPortas();
        motor.criarMotor();
    }

}
