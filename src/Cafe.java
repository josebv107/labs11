public abstract class Cafe implements Bebida {
    String descripcion;
    double precioBase;


    public Cafe(String descripcion, double precioBase) {
        this.descripcion = descripcion;
        this.precioBase = precioBase;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public double getCosto() {
        return precioBase;
    }
}
