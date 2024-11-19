// A byte is an 8-bit signed integer.
// A short is a 16-bit signed integer.
// An int is a 32-bit signed integer.
// A long is a 64-bit signed integer.
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    ArrayList<Long> inputNumbers = new ArrayList<Long>();
    ArrayList<String> dataTypesCanBeFitted = new ArrayList<String>();

    for(int i = 0; i < n; i++){
      inputNumbers.add(scanner.nextLong());
    }

    for(int i = 0; i < inputNumbers.size(); i++){
      // Size for Byte
      if(inputNumbers.get(i) >= -128 && inputNumbers.get(i) <= 127){
        dataTypesCanBeFitted.add("* byte");
      } 
      // Size for short
      else if(inputNumbers.get(i) >= -32768 && inputNumbers.get((i)) <= 32767){
        dataTypesCanBeFitted.add("* short");
      } 
      // Size for int
      else if(inputNumbers.get(i) >= Math.pow(-2, 31) && inputNumbers.get((i)) <= Math.pow(2,31)-1){
        dataTypesCanBeFitted.add("* int");
      }
      
      // size for long
      else if(inputNumbers.get(i) >= Math.pow(-2, 63) && inputNumbers.get((i)) <= Math.pow(2,63)-1){
        dataTypesCanBeFitted.add("* long");
      }
      else {
        dataTypesCanBeFitted.add("can't be fitted anywhere.");
      }
      
      if(dataTypesCanBeFitted.size() == 0){
        System.out.println(inputNumbers.get(i) + "\s" + "can't be fitted anywhere");
      } 
      else{
        System.out.println(inputNumbers.get(i) + " can be fitted in:");
        for(int y = 0; y < dataTypesCanBeFitted.size(); y++){
          System.out.println(dataTypesCanBeFitted.get(y) + "\n");
        }
      }

      dataTypesCanBeFitted.clear();
    }
    
    scanner.close();
  }  
}
