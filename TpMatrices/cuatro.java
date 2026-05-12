package TpMatrices;

import java.util.Scanner;

public class cuatro {
    public static void cargarMatriz(double[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Cargar notas del alumno " + j + " en el examen " + i);
                matriz[i][j] = sc.nextDouble();
            }
        }
    }

    public static double[] calcularPromedio(double[][] matriz) {
        double[] promNotas = new double[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                promNotas[i] += matriz[j][i];
            }
            promNotas[i] = promNotas[i] / 6;
        }
        return promNotas;
    }

    public static void mostrarNotas(double[][] matriz, int alum) {
        System.out.println("Las notas del alumno " + alum + " son");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(i + ": " + matriz[i][alum] + " ");
        }
    }

    public static void mostrarMaxNotas(double[][] matriz) {
        for (int i = 0; i < 10; i++) {
            double[] max = { -1000, 0 };
            for (int j = 0; j < 6; j++) {
                if (matriz[j][i] > max[0]) {
                    max[0] = matriz[j][i];
                    max[1] = j;
                }
            }
            System.out.println("La mejor nota del examen " + max[1] + " es " + max[0]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = true;
        double[][] notas = new double[6][10];
        cargarMatriz(notas);
        while (end) {
            System.out.println("Escribe para elegir que hacer");
            System.out.println("1.Mostrar notas de un alumno");
            System.out.println("2.Mostrar promedio");
            System.out.println("3.Mostrar mejores notas");
            System.out.println("0.Terminar programa");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    boolean valido = true;
                    int alum = 0;
                    while (valido) {
                        System.out.println("¿Las notas de que alumno quieres revisar?");
                        alum = sc.nextInt();
                        if (alum >= 1 && alum <= 10) {
                            valido = false;
                        } else {
                            System.out.println("Los alumnos van del 1 al 10");
                        }
                    }
                    mostrarNotas(notas, alum - 1);
                    break;
                case 2:
                    double[] res = calcularPromedio(notas);
                    for (int i = 0; i < 10; i++) {
                        System.out.println("El promedio del alumno " + i + " es de " + res[i]);
                    }
                    break;
                case 3:
                    mostrarMaxNotas(notas);
                    break;
                case 0:
                    System.out.println("Terminando programa . . .");
                    end = false;
                    break;

                default:
                    System.out.println("Selecciona una opcion valida");
                    break;
            }

        }
    }
}