public class hashSet<T> {
    private T[] hashSet;
    private static int length;


    public hashSet() {
        T[] hashSet = (T[]) new Object[0];
        this.hashSet = hashSet;
    }
    
    public void add(T item) {
        T[] temp = (T[]) new Object[hashSet.length + 1];
        for (int i = 0; i < hashSet.length; i++) {
            temp[i] = hashSet[i];
        }
        temp[temp.length - 1] = item;
        hashSet = temp;
    }

    public void remove(T item) {
        T[] temp = (T[]) new Object[hashSet.length - 1];
        int index = 0;
        for (int i = 0; i < hashSet.length; i++) {
            if (hashSet[i] != item) {
                temp[index] = hashSet[i];
                index++;
            }
        }
        hashSet = temp;
    }

    public boolean contains(T item) {
        for (int i = 0; i < hashSet.length; i++) {
            if (hashSet[i] == item) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return hashSet.length;
    }

    public void iterator() {
        for (T t : hashSet) {
            System.out.println(t);
        }
    }

    public void isEmpty() {
        if (hashSet.length == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
}
