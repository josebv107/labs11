package complementos;

import modelo.Bebida;

public class Moca extends Complemento {

    public Moca(Bebida bebida) {
        super(bebida, 0.20, 0.25, 0.30);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + complementos.Moca";
    }

}
