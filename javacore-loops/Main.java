public class Main {
  public static void main(String[] args) {
    int n1 = 1, n2 = 1;
    fib_while(n1, n2);
    System.out.println();
    fib_for(n1, n2);
  }

  public static void fib_while(int n1, int n2) {
    System.out.print(n1 + " " + n2);
    int i = 0;
    while (i < 9) {
      System.out.print(" " + (n1 + n2));
      int t = n1;
      n1 = n2;
      n2 = t + n2;
      i++;
    }
  }
  
  public static void fib_for(int n1, int n2) {
    System.out.print(n1 + " " + n2);
    for (int i = 0; i < 9; i++) {
      System.out.print(" " + (n1 + n2));
      int t = n1;
      n1 = n2;
      n2 = t + n2;
    }
  }
}