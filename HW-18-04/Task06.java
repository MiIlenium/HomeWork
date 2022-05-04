//Определить количество слов в списке, которые совпадают с первым (последним) словом списка.

import java.util.LinkedList;

public class Task06 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("qwerty");
        list.add("qecond Valub");
        list.add("qwerty");
        list.add("Fourth Valud");
        list.add("qwerty");
        list.add("qwerty");

        int count = 0;
        String firstElement = (String) list.getFirst(); //для последнего элемента list.getLast();
        for(int i = 0; i < list.size() - 1; i++){
            if(firstElement.equals(list.get(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
