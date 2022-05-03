//Определить количество слов в списке, которые начинаются и заканчиваются на одну букву.
import java.util.LinkedList;


public class Task04 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("QiviQ");
        list.add("Qovqe");
        list.add("adsfasd");
        list.add("qwertyq");
        int count = 0;
        for (int i = 0; i <= list.size() - 1; i++) {
            String ch = (String) list.get(i);
            String firstChar = String.valueOf(ch.charAt(0));
            String lastChar = String.valueOf(ch.charAt(ch.length() - 1));

            if(firstChar.contains(lastChar)){
                count++;
            }

        }
        System.out.println(count);
    }
}
