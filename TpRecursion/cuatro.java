package TpRecursion;

// 4. Diseñar e implementar un algoritmo recursivo para verificar si todos los
// dígitos de un número son iguales (por ejemplo si el número es 111 debe
// retornar true, si el número es 12111 debe retornar false).
public class cuatro {
    public static boolean cadenaIguales(int num) {
        int digito = num % 10;
        return recurIguales(num / 10, digito);
    }

    public static boolean recurIguales(int num, int dig) {
        boolean res = true;
        if (num > 0) {
            int digito = num % 10;
            res = (digito == dig);
            if (res) {
                res = recurIguales(num / 10, dig);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(cadenaIguales(99919));
        System.out.println(cadenaIguales(11112));
    }
}
