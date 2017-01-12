import java.util.Arrays; 

class Main {
  public static void main(String[] args) {
  //  System.out.println(blackJack(19, 22));
  System.out.println(sameDiff(2, 4, 6));
  }
  
 
public static boolean sameDiff(int num1, int num2, int num3) {
  int[] diffArray = {num1, num2, num3};
  Arrays.sort(diffArray);
  
  for(int i=0; i<diffArray.length; i++) {
      System.out.println(diffArray[i]);
  }
  System.out.println(" ");
  
  int diff1 = diffArray[1] - diffArray[0];
  int diff2 = diffArray[2] - diffArray[1];
   System.out.println("diff 1 is: " + diff1);
   System.out.println("diff 2 is: " + diff2);
  
  if (diff1 == diff2) {
    return true;
  } else {
    return false;
  }
 // return false;
} 