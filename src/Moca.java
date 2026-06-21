public class Moca extends Complemento {

    public Moca(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Moca";
    }

}
