/**
 * 3) Con String
 * a) Retorne un texto en jeringoza agregándole p+la vocal cada vez que se
 * utilice una vocal. No se consideran mayúsculas o minúsculas.
 * Palabra jeringoza
 * Ejemplo epejepemplopo
 * Fui fupuipi
 * 
 */
public class tresA {
    public static String recurJeringozo(String pal, int i, int largo) {
        String res = "";
        if (i < largo) {
            char carac = pal.charAt(i);
            if ("aeiou".indexOf(carac) != -1) {
                System.out.println(pal.charAt(i));
                res = (res + carac + "p" + carac) + recurJeringozo(pal, i + 1, largo);
            } else {
                res = (res + carac) + recurJeringozo(pal, i + 1, largo);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String palabra = "Ejemplo";
        System.out.println(recurJeringozo(palabra.toLowerCase(), 0, palabra.length()));
    }
}