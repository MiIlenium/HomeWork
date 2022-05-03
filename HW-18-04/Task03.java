import java.util.LinkedList;

public class Task03 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("First Value");
        list.add("Second Value");
        list.add("Third Value");
        list.add("Fourth Value");

        String last = (String) list.getLast();
        String first = (String) list.getFirst();

        list.set(0, last);
        list.set(list.size() - 1, first);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
