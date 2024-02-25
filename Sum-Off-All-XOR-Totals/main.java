import java.util.Scanner;

public class main {

    public static int subsetXORSum(int[] arr){
        int n = arr.length;
        int result = 0;
        for(int st=0; st<n; st++){
            for(int end = st; end<n; end++){
                for(int k=st; k<=end; k++){
                    result += arr[k];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int ans = subsetXORSum(arr);
        System.out.println(ans);
    }
}
