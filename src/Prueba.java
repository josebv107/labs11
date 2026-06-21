public class Prueba {
    static void main() {
        Bebida p1 = new Expreso();
        p1 = new Leche(p1);
        p1 = new Soya(p1);
        p1 = new Crema(p1);
        p1 = new Moca(p1);

        Bebida p2 = new Descafeinado();
        p2 = new Moca(p2);
        p2 = new Moca(p2);
        p2 = new Soya(p2);
        p2 = new Leche(p2);

        Bebida p3 = new Batido();
        p3 = new Crema(p3);
        p3 = new Crema(p3);
        p3 = new Leche(p3);
        p3 = new Leche(p3);
        p3 = new Soya(p3);
        p3 = new Soya(p3);
        p3 = new Moca(p3);
        p3 = new Moca(p3);

        Bebida p4 = new TostadoNegro();
        p4 = new Crema(p4);
        p4 = new Crema(p4);
        p4 = new Soya(p4);
        p4 = new Soya(p4);
        p4 = new Soya(p4);

        System.out.println(p1.getDescripcion() + " " + p1.getCosto() + "\n");
        System.out.println(p2.getDescripcion() + " " + p2.getCosto() + "\n");
        System.out.println(p3.getDescripcion() + " " + p3.getCosto() + "\n");
        System.out.println(p4.getDescripcion() + " " + p4.getCosto());
    }

    private static void imprimirPedido(Bebida bebida) {
        System.out.println(bebida.getDescripcion() + " " + bebida.getCosto());
        System.out.printf("TOTAL: %.2f%n", bebida.getCosto());
        System.out.println("--------------\n");
    }
}
