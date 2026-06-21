import modelo.Bebida;

public class Crema extends Complemento {

    public Crema(Bebida bebida) {
        super(bebida, 0.10, 0.15, 0.20);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Crema";
    }

}
