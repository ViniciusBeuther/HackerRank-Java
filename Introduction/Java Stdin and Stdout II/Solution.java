import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        double firstDouble = scanner.nextDouble();
        scanner.nextLine();
        
        String myString = scanner.nextLine();
        scanner.close();
        
        System.out.println("String: " + myString);
        System.out.println("Double: " + firstDouble);
        System.out.println("Int: " + firstInt);
    }
}
