import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myStrArray = new ArrayList<>();        
        ArrayList<Integer> myIntArray = new ArrayList<>();
        
        for(int i = 0; i < 3; i++){
            String language = scanner.next();
            Integer myInt = scanner.nextInt();
            
            myStrArray.add(language);
            myIntArray.add(myInt);
        }       
        
        System.out.println("================================");
        
        for(int y=0; y < 3; y++){
            System.out.println(String.format("%-15s", myStrArray.get(y)) + String.format("%03d", myIntArray.get(y)));
        }
        
        System.out.println("================================");
        scanner.close();
}
}
