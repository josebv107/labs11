public abstract class Cafe implements Bebida {

    @Override
    public String getDescripcion() {
        return "Café";
    }

    public double getCosto() {
        return 0.0;
    }
}
