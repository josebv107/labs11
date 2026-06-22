package complementos;

import modelo.Bebida;

public class Leche extends Complemento {

    public Leche(Bebida bebida) {
        super(bebida, 0.10, 0.15, 0.20);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Leche";
    }

}
