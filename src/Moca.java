public class Moca extends Complemento {

    public Moca(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Moca";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 0.20;
    }
}
