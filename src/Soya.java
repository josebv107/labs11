public class Soya extends Complemento {

    public Soya(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Soya";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 0.15;
    }
}
