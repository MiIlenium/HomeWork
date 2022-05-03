import java.util.LinkedList;

public class Task02 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("First Value");
        list.add("Second Value");
        list.add("Third Value");
        list.add("Fourth Value");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        String last = (String) list.getLast();

        list.addFirst(last);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
