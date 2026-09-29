import java.util.Scanner;

public class SistemaDescuentos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");

        double compra = entrada.nextDouble();

        double porcentajeDescuento;
        

        if (compra >= 300000) {

            porcentajeDescuento = 0.20;

        } else if (compra >= 200000) {

            porcentajeDescuento = 0.15;

        } else if (compra >= 100000) {

            porcentajeDescuento = 0.10;

        } else {

            porcentajeDescuento = 0;

        }
        double descuento = compra * porcentajeDescuento;
        double totalPagar = compra - descuento;

        System.out.println("Porcentaje de descuento: " + (porcentajeDescuento * 100) + "%");
        System.out.println("Valor del descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);

    }

}