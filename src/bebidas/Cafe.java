package bebidas;

import modelo.Bebida;
import modelo.Tamano;

import java.util.HashMap;
import java.util.Map;

public abstract class Cafe implements Bebida {
    String descripcion;
    Map<Tamano, Double> precios;
    Tamano tamano;

    public Cafe(String descripcion, double precioN, double precioM, double precioG) {
        this.descripcion = descripcion;
        this.precios = new HashMap<>();
        this.precios.put(Tamano.NORMAL, precioN);
        this.precios.put(Tamano.MEDIANO, precioM);
        this.precios.put(Tamano.GRANDE, precioG);
        this.tamano = Tamano.NORMAL;
    }

    @Override
    public String getDescripcion() {
        return descripcion + " (" + tamano + ")";
    }

    @Override
    public double getCosto() {
        return precios.get(tamano);
    }

    @Override
    public Tamano getTamano() {
        return tamano;
    }

    @Override
    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }
}
