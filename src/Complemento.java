public abstract class Complemento implements Bebida {
    protected Bebida bebida;

    public Complemento(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    public double getCosto() {
        return bebida.getCosto();
    }
}
