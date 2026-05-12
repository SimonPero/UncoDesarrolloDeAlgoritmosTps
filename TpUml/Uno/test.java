package TpUml.Uno;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el codigo del terreno");
        int codigo = sc.nextInt();
        System.out.println("Ingresa la base del terreno");
        double base = sc.nextDouble();
        System.out.println("Ingresa la altura del terreno");
        double altura = sc.nextDouble();
        System.out.println("Ingresa la manzana del terreno");
        int manzana = sc.nextInt();

        Terreno ter = new Terreno(codigo, base, altura, manzana);
        System.out.println("el perimetro del terreno es de " + ter.perimetro() + "metros");
        System.out.println("se necesita una alambre de " + ter.perimetro() * 3 + " largo para darle la vuelta 3 veces");
        System.out.println("Limpiar el terreno cuesta " + ter.superficie() * 150);

        System.out.println("Cual es el cosot por metro cuadrado del terreno?");
        double precio = sc.nextDouble();

        System.out.println("El precio del terreno es " + ter.superficie() * precio);

    }
}
