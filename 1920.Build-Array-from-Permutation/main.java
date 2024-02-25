import java.util.Scanner;

public class main {

    public static int buildArray(int []arr){
        int []num = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            num[i] = arr[arr[i]];
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int ans = buildArray(arr);
        System.out.println(ans);
    }
}
