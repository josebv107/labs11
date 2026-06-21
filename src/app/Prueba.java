package app;

import bebidas.Batido;
import bebidas.Descafeinado;
import bebidas.Expreso;
import bebidas.TostadoNegro;
import complementos.Crema;
import complementos.Leche;
import complementos.Moca;
import complementos.Soya;
import modelo.Bebida;
import modelo.Tamano;

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

        imprimirPedido(p1);
        imprimirPedido(p2);
        imprimirPedido(p3);
        imprimirPedido(p4);

        System.out.println("\nPARTE 2 (IMPLEMENTACIÓN DE TAMAÑOS)");

        Bebida p5 = new Expreso();
        p5.setTamano(Tamano.GRANDE);
        p5 = new Leche(p5);
        p5 = new Soya(p5);
        p5 = new Crema(p5);
        p5 = new Moca(p5);

        Bebida p6 = new Descafeinado();
        p6.setTamano(Tamano.MEDIANO);
        p6 = new Moca(p6);
        p6 = new Moca(p6);
        p6 = new Soya(p6);
        p6 = new Leche(p6);

        Bebida p7 = new Batido();
        p7.setTamano(Tamano.NORMAL);
        p7 = new Crema(p7);
        p7 = new Crema(p7);
        p7 = new Leche(p7);
        p7 = new Leche(p7);
        p7 = new Soya(p7);
        p7 = new Soya(p7);
        p7 = new Moca(p7);
        p7 = new Moca(p7);

        Bebida p8 = new TostadoNegro();
        p8.setTamano(Tamano.GRANDE);
        p8 = new Crema(p8);
        p8 = new Crema(p8);
        p8 = new Soya(p8);
        p8 = new Soya(p8);
        p8 = new Soya(p8);

        imprimirPedido(p5);
        imprimirPedido(p6);
        imprimirPedido(p7);
        imprimirPedido(p8);
    }

    private static void imprimirPedido(Bebida bebida) {
        System.out.println(bebida.getDescripcion());
        System.out.printf("TOTAL: %.2f%n", bebida.getCosto());
        System.out.println("--------------\n");
    }
}
