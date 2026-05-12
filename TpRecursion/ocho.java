package TpRecursion;

public class ocho {
    // Diseñar e implementar un algoritmo recursivo que retorne true si una oración
    // es un palíndromo.
    // Un palíndromo es una oración capicúa
    // (no se contabiliza las mayúsculas y minúsculas ni los espacios en blanco):
    // Ejemplos de palíndromos: “NEUQUEN”; “Somos o no somos”; “Yo hago yoga hoy”
    // “Anita lava la tina”
    // ; “Sé verlas al revés”.

    public static boolean checkPalindromo(String pal) {
        pal = pal.toLowerCase().replaceAll(" ", "");
        System.out.println(pal);
        return recurPalin(pal, 0, pal.length() - 1, true);
    }

    public static boolean recurPalin(String pal, int in, int fin, boolean res) {
        if (in < fin && res) {
            res = recurPalin(pal, in + 1, fin - 1, pal.charAt(in) == pal.charAt(fin));
        }
        return res;
    }

    public static void main(String[] args) {
        String papa = "Sé verlas al         revés";
        System.out.println(checkPalindromo(papa));
    }
}