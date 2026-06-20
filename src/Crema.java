public class Crema extends Complemento {

    public Crema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Crema";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 0.10;
    }
}
