public class Leche extends Complemento {

    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Leche";
    }

    @Override
    public double getCosto() {
        return super.getCosto();
    }
}
