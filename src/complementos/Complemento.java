package complementos;

import modelo.Bebida;
import modelo.Tamano;

import java.util.HashMap;
import java.util.Map;

public abstract class Complemento implements Bebida {
    protected Bebida bebida;
    protected Map<Tamano, Double> precios;

    public Complemento(Bebida bebida, double precioN, double precioM, double precioG) {
        this.bebida = bebida;
        this.precios = new HashMap<>();
        this.precios.put(Tamano.NORMAL, precioN);
        this.precios.put(Tamano.MEDIANO, precioM);
        this.precios.put(Tamano.GRANDE, precioG);
    }

    public String getDescripcion() {
        return bebida.getDescripcion();
    }


    public double getCosto() {
        return bebida.getCosto() + precios.get(bebida.getTamano());
    }

    @Override
    public Tamano getTamano() {
        return bebida.getTamano();
    }

    @Override
    public void setTamano(Tamano tamano) {
        bebida.setTamano(tamano);
    }
}
