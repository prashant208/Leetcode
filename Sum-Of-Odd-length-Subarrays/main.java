import java.util.Scanner;

public class main {
    public static int sumOddLengthSubarrays(int []arr){
        int n = arr.length;
        int sum = 0;
        for(int st=0; st<n; st++){
            for(int end=st; end<n; end += 2){
                for(int k=st; k<=end; k++){
                    sum += arr[k];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int ans = sumOddLengthSubarrays(arr);
        System.out.println(ans);
    }
}
