import java.util.Scanner;

/**
 * 5) Otros:
 * a) Una red de mensajes en cadena ha encontrado una forma de repartir los
 * mismos de manera que se pueda cubrir a la mayor gente posible. Para ello han
 * decidido usar una teoría, la misma que empieza enviando X mensajes, y a
 * partir de este número se van enviando los mensajes de acuerdo a una teoría
 * progresiva.
 * Se termina de entregar los mensajes una vez que se encuentra 1. Sin embargo,
 * no se sabe a ciencia cierta la teoría, lo único que se tiene son algunas
 * fórmulas sueltas:
 * X/2 y X * 3 + 1 y ejemplos de cómo se aplica:
 * 
 * CASO 1: 5, 16, 8, 4, 2, 1
 * CASO2: 9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2,1
 * CASO 3: 10, 5, 16, 8, 4, 2, 1
 * CASO 4: 6, 3, 10, 5, 16, 8, 4, 2, 1
 * CASO 5: 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
 * 
 * a. En base a los casos deduce la teoría que se aplica para enviar los
 * mensajes.
 * b. Escribe el (los) método(s) RECURSIVO(S) necesario(s) para saber cuántos
 * mensajes se han enviado en total si se empieza con X mensajes. Este resultado
 * se obtiene sumando la cantidad de mensajes sucesivos que se envían. Para dar
 * un ejemplo: en el CASO 1: se envían 36 mensajes.
 * 
 */

public class cincoA {
    public static int recurMensajes(int num) {
        if (num != 1) {
            if (num % 2 == 0) {
                System.out.print(num / 2 + " ");
                num += recurMensajes(num / 2);
            } else {
                System.out.print(num * 3 + 1 + " ");
                num += recurMensajes(num * 3 + 1);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero base");
        int num = sc.nextInt();
        System.out.println("------------");
        System.out.print(num + " ");
        int mensajes = recurMensajes(num);

        System.out.println();
        System.out.println("Se enviaron " + mensajes + " mensajes dou");
    }
}