import java.util.Scanner;

public class main {
    public static void input(int [][]arr){
        Scanner scn = new Scanner(System.in);
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static int minTimeToVisitAllPoints(int [][]arr){
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        input(arr);
        int ans = minTimeToVisitAllPoints(arr);
        System.out.println(ans);
    }
}
