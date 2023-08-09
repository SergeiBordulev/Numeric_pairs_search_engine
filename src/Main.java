import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int[][] convert_ArrayToArrayList(ArrayList<int[]> result){
        int[][] resultPairs = new int[result.size()][2];

        for(int i = 0; i < result.size(); i++){
            int[] temp = result.get(i);
            resultPairs[i][0] = temp[0];
            resultPairs[i][1] = temp[1];
        }

        return resultPairs;
    }

    public static int[][] getPairs(int[] a, int x){
        ArrayList<int[]> result = new ArrayList<>();

        for(int i = a.length - 1; i > 0; i--){
            for (int k : a) {
                if (k + a[i] == x) {
                    int[] pair = {k, a[i]};
                    result.add(pair);
                }
            }
        }

        return convert_ArrayToArrayList(result);
    }

    public static void main(String[] args) {
        int[] a = new int[]{-2,-1,0,1,2,3,4,5,6,7,8,11};

        System.out.println(Arrays.toString(a));

        int[][] arrayPairs = getPairs(a, 9);

        System.out.println(Arrays.deepToString(arrayPairs));
    }
}
