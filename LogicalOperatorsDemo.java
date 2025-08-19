public class LogicalOperatorsDemo {
  public static void main(String[] args) {
    int a = 10, b = 20;

    System.out.println("a = " + a + ", b = " + b);
    System.out.println("(a > 5 && b > 15): " + (a > 5 && b > 15));  // true && true → true
    System.out.println("(a > 15 || b > 15): " + (a > 15 || b > 15)); // false || true → true
    System.out.println("!(a > b): " + !(a > b));  // !(false) → true
  }
}
