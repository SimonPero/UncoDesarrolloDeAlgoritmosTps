package TpRecursion;

public class ocho {
    // Diseñar e implementar un algoritmo recursivo que retorne true si una oración
    // es un palíndromo.
    // Un palíndromo es una oración capicúa
    // (no se contabiliza las mayúsculas y minúsculas ni los espacios en blanco):
    // Ejemplos de palíndromos: “NEUQUEN”; “Somos o no somos”; “Yo hago yoga hoy”
    // “Anita lava la tina”
    // ; “Sé verlas al revés”.

    /**
     * //Esta funcion esta mal, por que usa el recurPalin erroneo
     * public static boolean checkPalindromo(String pal) {
     * pal = pal.toLowerCase().replaceAll(" ", "");
     * System.out.println(pal);
     * return recurPalin(pal, 0, pal.length() - 1, true);
     * }
     * 
     * //Esta funcion esta mal por que usa res como parametro y es lo que
     * devolvemos.
     * public static boolean recurPalin(String pal, int in, int fin, boolean res) {
     * if (in < fin && res) {
     * res = recurPalin(pal, in + 1, fin - 1, pal.charAt(in) == pal.charAt(fin));
     * }
     * return res;
     * }
     */
    public static boolean checkPalindromo(String pal) {
        pal = pal.toLowerCase().replaceAll(" ", "");
        System.out.println(pal);
        return recurPalin(pal, 0, pal.length() - 1);
    }

    public static boolean recurPalin(String pal, int in, int fin) {
        boolean res;
        if (in >= fin) {
            res = true; // caso base
        } else if (pal.charAt(in) != pal.charAt(fin)) {
            res = false; // caso de corte
        } else {
            res = recurPalin(pal, in + 1, fin - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String papa = "Sé verlas al         revés";
        String papa2 = "Anita lava la tiha";
        String papa3 = "Somos o no somos";
        String papa4 = "Yo hago yoga hoy";
        System.out.println(checkPalindromo(papa));
        System.out.println(checkPalindromo(papa2));
        System.out.println(checkPalindromo(papa3));
        System.out.println(checkPalindromo(papa4));

    }
}