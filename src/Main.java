import java.util.Arrays;

public class Main {
    public static void getPare (int[] a, int x){
        // Надо чтобы возвращал массив массивов int[][]
        System.out.println(a.length);

        for(int i = a.length - 1; i > 0; i--){
            for (int k : a) {
                if (k + a[i] == x) {
                    System.out.println(k + " - " + a[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{-2,-1,0,1,2,3,4,5,6,7,8,11};
        // -- or
        // int[] b = {-2,-1,0,1,2,3,4,5,6,7,8,11};

        System.out.println(Arrays.toString(a));
        getPare(a, 9);

    }
}
