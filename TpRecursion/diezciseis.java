package TpRecursion;

import TpUml.diez.Producto;

/**
 * 16. Dado un arreglo de TDA producto realizado en el práctico 3, diseñar e
 * implementar un algoritmo recursivo que permita retornar la cantidad de
 * productos con precio unitario menor a un valor dado.
 */
public class diezciseis {
    public static int encontrarProdUnitarios(Producto[] arr, double precio) {
        return recurEnconProdUnit(arr, precio, 0);
    }

    public static int recurEnconProdUnit(Producto[] arr, double precio, int i) {
        int prods = 0;
        if (i < arr.length) {
            if (arr[i].getPrecioPorKilo() < precio) {
                prods = 1;
            }
            prods += recurEnconProdUnit(arr, precio, i + 1);
        }

        return prods;
    }

    public static void main(String[] args) {
        Producto[] arr = {
                new Producto(1, "Semillas", 1500.0, 50.0),
                new Producto(2, "Harina integral", 800.0, 30.0),
                new Producto(3, "Condimentos", 2000.0, 20.0),
                new Producto(4, "Frutos secos", 3500.0, 15.0),
                new Producto(5, "Avena", 1200.0, 40.0)
        };
        System.out.println(encontrarProdUnitarios(arr, 1600));
    }
}
