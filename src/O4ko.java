import java.util.Random;

public class O4ko {
    public static int[]
    getRandomArray(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
        array[i] = random.nextInt();
        }
        return array;
        }
        public static void main(String[]args){
        int[]arr = getRandomArray(n);
            System.out.println(arr);
        }
        }