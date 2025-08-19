import java.util.Scanner;
 class oddsum{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("enter a number: ");
  int num = input.nextInt();
  int sum = oddsum(num);
  System.out.println("oddsum till" + num + "is: " + sum);
  }
   public static int oddsum(int num){
    int sum = 0;
    int i = 1;
    while (i <= num){
      sum = sum +i;
      i += 2;
    } 
    return sum;
   }
  }
