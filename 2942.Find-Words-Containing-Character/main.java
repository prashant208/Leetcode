import java.util.Scanner;

public class main {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> resultwords = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(char ch : words[i].toCharArray()){
                if(ch == x){
                    resultwords.add(i);
                    break;
                }
            }
        }
        return resultwords;
    }
}
