public class arrayList<T> {
    private T[] values;

    public arrayList(){
        values = (T[]) new Object[0];
    }

    public void add(T value){
        T[] temp = (T[]) new Object[values.length + 1];
        System.arraycopy(values, 0, temp, 0, values.length);
        temp[values.length] = value;
        values = temp;
    }

    public T get(int index){
        return values[index];
    }

    public void remove(int index){
        T[] temp = (T[]) new Object[values.length - 1];
        System.arraycopy(values, 0, temp, 0, index);
        System.arraycopy(values, index + 1, temp, index, values.length - index - 1);
        values = temp;
    }

    public void remove(T value){
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(value)){
                remove(i);
                break;
            }
        }
    }

    public int size(){
        return values.length;
    }

    public void clear(){
        values = (T[]) new Object[0];
    }

    public boolean contains(T value){
        for (T t : values) {
            if (t.equals(value)){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        return values.length == 0;
    }
}
