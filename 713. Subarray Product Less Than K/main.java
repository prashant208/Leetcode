import java.util.Scanner;

public class main {
    public static int numSubarrayProductLessThanK(int []arr, int k){
        int count = 0;
        int i, j, prod;
        for(i=0; i<arr.length; i++){
            if(arr[i] < k){
                count++;
            }
            prod = arr[i];

            for(j=i+1; j<arr.length; j++){
                prod = prod * arr[j];
                if(prod < k){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int ans = numSubarrayProductLessThanK(arr, k);
        System.out.println(ans);
    }
}
