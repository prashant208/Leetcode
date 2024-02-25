import java.util.Scanner;

public class main {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String operation : operations){
            if (operation.charAt(1) == '+'){
                result++;
            }else{
                result--;
            }
        }
        return result;
    }
}
