package TpUml.diez;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear producto
        Producto p = new Producto(1, "Semillas", 1500.0, 50.0);

        // Mostrar descripción
        System.out.println("Descripción del producto: " + p.getDescripcion());

        // Calcular costo
        System.out.print("Ingrese cantidad en kilos: ");
        double cantidad = scanner.nextDouble();

        double costo = p.calcularCosto(cantidad);
        System.out.println("Costo total: $" + costo);

        // Restar stock
        System.out.print("Ingrese cantidad a retirar del stock: ");
        double retirar = scanner.nextDouble();

        p.restarStock(retirar);

        System.out.println("Stock restante: " + p.getStockKilos() + " kg");

        scanner.close();
    }
}
