public class RelationalOperatorsDemo {
  public static void main(String[] args) {
      int a = 10;
      int b = 5;
      int c = 10;
      
      // Equal to (==)
      System.out.println(a + " == " + b + " : " + (a == b));  // false
      System.out.println(a + " == " + c + " : " + (a == c));  // true
      
      // Not equal to (!=)
      System.out.println(a + " != " + b + " : " + (a != b));  // true
      System.out.println(a + " != " + c + " : " + (a != c));  // false
      
      // Greater than (>)
      System.out.println(a + " > " + b + " : " + (a > b));    // true
      System.out.println(b + " > " + a + " : " + (b > a));    // false
      
      // Less than (<)
      System.out.println(b + " < " + a + " : " + (b < a));    // true
      System.out.println(a + " < " + b + " : " + (a < b));    // false
      
      // Greater than or equal to (>=)
      System.out.println(a + " >= " + b + " : " + (a >= b));  // true
      System.out.println(a + " >= " + c + " : " + (a >= c));  // true
      System.out.println(b + " >= " + a + " : " + (b >= a));  // false
      
      // Less than or equal to (<=)
      System.out.println(b + " <= " + a + " : " + (b <= a));  // true
      System.out.println(a + " <= " + c + " : " + (a <= c));  // true
      System.out.println(a + " <= " + b + " : " + (a <= b));  // false
      
      // Comparing different data types
      double d = 10.0;
      System.out.println(a + " == " + d + " : " + (a == d));  // true (int vs double)
      
      char ch = 'A';
      System.out.println(ch + " > " + 64 + " : " + (ch > 64));  // true (ASCII comparison)
  }
}
