public class Soya extends Complemento {

    public Soya(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Soya";
    }

}
