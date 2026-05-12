package TpRecursion;

//6. Diseñar e implementar un algoritmo recursivo para 
// obtener el número mayor de un arreglo numérico.
public class seis {
    public static int mayor(int[] nums) {
        return pasoRecursivo(nums, 0, nums[0]);
    }

    public static int pasoRecursivo(int[] nums, int i, int mayor) {
        if (i < nums.length) {
            mayor = pasoRecursivo(nums, i + 1, Math.max(mayor, nums[i]));
        }
        return mayor;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6, 733, 7, 8, 1, 3, 35, 123 };
        System.out.println(mayor(nums));
    }
}
