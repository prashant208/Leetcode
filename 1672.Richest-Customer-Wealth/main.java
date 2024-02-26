import java.util.Scanner;

public class main {
    public static int maximumWealth(int[][] arr) {
        int[] result = new int[arr.length];
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i][j];
            }
            result[i] = total;
        }
        int max = result[0];
        for (int k = 1; k < arr.length; k++) {
            if (result[k] > max) {
                max = result[k];
            }
        }
        return max;

    }

    public static void input(int[][] arr) {
        Scanner scn = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }
}
