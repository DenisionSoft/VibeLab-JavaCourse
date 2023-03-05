public class Main {
    public static void main(String[] args) {
        
        hashSet<Integer> set = new hashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        set.iterator();
        System.out.println("size: " + set.size());
        set.isEmpty();

        set.remove(3);
        set.iterator();
        System.out.println("size: " + set.size());
        set.isEmpty();

        System.out.println("contains 3: " + set.contains(3));
        System.out.println("contains 4: " + set.contains(4));

    }
}