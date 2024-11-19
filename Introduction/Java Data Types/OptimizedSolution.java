import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class OptimizedSolution {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      int n = scanner.nextInt();

      ArrayList<BigInteger> inputNumbers = new ArrayList<BigInteger>();

      // Get input number
      for(int i=0; i<n; i++){
        inputNumbers.add(scanner.nextBigInteger());
      }

      // Defining the range for each type
      BigInteger byte_min = BigInteger.valueOf(Byte.MIN_VALUE);
      BigInteger byte_max = BigInteger.valueOf(Byte.MAX_VALUE);

      BigInteger short_min = BigInteger.valueOf(Short.MIN_VALUE);
      BigInteger short_max = BigInteger.valueOf(Short.MAX_VALUE);

      BigInteger int_min = BigInteger.valueOf(Integer.MIN_VALUE);
      BigInteger int_max = BigInteger.valueOf(Integer.MAX_VALUE);

      BigInteger long_min = BigInteger.valueOf(Long.MIN_VALUE);
      BigInteger long_max = BigInteger.valueOf(Long.MAX_VALUE);
      
      for(BigInteger num : inputNumbers){
        boolean canBeFitted = false;
        StringBuilder result = new StringBuilder(num + " can be fitted in:\n");

        // compare if it fits in the range of byte
        if(num.compareTo(byte_min) >= 0 && num.compareTo(byte_max) <= 0 ){
          result.append("* byte\n");
          canBeFitted = true;
        }
        if(num.compareTo(short_min) >= 0 && num.compareTo(short_max) <= 0 ){
          result.append("* short\n");
          canBeFitted = true;
        }
        if(num.compareTo(int_min) >= 0 && num.compareTo(int_max) <= 0 ){
          result.append("* int\n");
          canBeFitted = true;
        }
        if(num.compareTo(long_min) >= 0 && num.compareTo(long_max) <= 0 ){
          result.append("* long");
          canBeFitted = true;
        }
        
        
        if(!canBeFitted){
          System.out.println(num + " can't be fitted anywhere.");
        } else{
          System.out.println(result);
        }
      }

      scanner.close();
    }
}
