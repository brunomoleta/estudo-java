import interfaces.Motor;
import interfaces.PartesCarroFactory;
import interfaces.Portas;
import interfaces.Volante;

class VolanteEsportivo implements Volante {
    @Override
    public void criarVolante() {
        System.out.println("Volante esportido pronto pro combate");
    }
}
class PortasEsportivas implements Portas {
    @Override
    public void criarPortas() {
        System.out.println("Portas esportivas prontas!");
    }
}

class MotorEsportivo implements Motor {
    @Override
    public void criarMotor() {
        System.out.println("Motor potente no jeito!");
    }
}

class PartesCarroEsportivoFactory implements PartesCarroFactory {

    @Override
    public Volante criarVolante() {
        return new VolanteEsportivo();
    }

    @Override
    public Portas criarPortas() {
        return new PortasEsportivas();
    }

    @Override
    public Motor criarMotor() {
        return new MotorEsportivo();
    }
}