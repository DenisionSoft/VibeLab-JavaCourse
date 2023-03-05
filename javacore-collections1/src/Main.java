public class Main {
    public static void main(String[] args) {
        arrayList<String> list = new arrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("!");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.remove(1);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.remove("Hello");

        System.out.println(list.get(0));

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        System.out.println(list.contains("Hello"));

        System.out.println(list.isEmpty());

    }
}