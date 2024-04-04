class Solution {
    public boolean isThree(int n) {
       int count = 0;
       for(int i=1; i<=n/i; i++){
            if(n%i==0){
                count += (n / i == i) ? 1 : 2;
            }
        }
        return count == 3;
    }
}