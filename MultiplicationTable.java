import java.util.Scanner;

public class MultiplicationTable{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("welcome to multipliction table: ");
    System.out.println("Enter a number: ");
    int num = scanner.nextInt();
    printMultiplicationTable(num);
  }
  public static void printMultiplicationTable(int num){
     int i = 1;
     while(i<=10){
      System.out.println(num + "x" +i+ " = " +(num * i));
      i++;
     }
  }
}