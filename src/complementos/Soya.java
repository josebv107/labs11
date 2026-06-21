package complementos;

import modelo.Bebida;

public class Soya extends Complemento {

    public Soya(Bebida bebida) {
        super(bebida, 0.15, 0.20, 0.25);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + complementos.Soya";
    }

}
