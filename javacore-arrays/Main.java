public class Main {
  public static void main(String[] args) {
    int[] array = new int[8];
    boolean order = true;
  
    for (int i = 0; i < 8; i++) {
        double randNumber = Math.random();
        array[i] = (int)((randNumber * 10) + 1);
        if (i > 0 && array[i] <= array[i-1]) {
            order = false;
        }
    }
    
    for (int i : array) {
        System.out.print(i + " ");
    }
    
    if (order) {
        System.out.println("- строго возрастающая последовательность");
    } else {
        System.out.println("- не строго возрастающая последовательность");
    }
    
    for (int i = 0; i < 8; i++) {
      if (i % 2 != 0) {
        array[i] = 0;
      }
    }

    System.out.println();
    for (int i : array) {
        System.out.print(i + " ");
    }
  }
}

