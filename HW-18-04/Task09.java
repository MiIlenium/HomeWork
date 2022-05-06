//Перевернуть список наоборот.

import java.util.LinkedList;

public class Task09 {
    public static void main(String[] args) {
        LinkedList secondList = new LinkedList();

        secondList.add("Contains");
        secondList.add("Not Contains");
        secondList.add("Contains Not Contains");
        secondList.add("UberContasdf");
        secondList.add("asfwqe");

        System.out.println(makeReverse(secondList));

    }

    public static LinkedList makeReverse(LinkedList list){

        LinkedList reversed = new LinkedList();

        for(int i = list.size() - 1; i >= 0; i--){
            reversed.add(list.get(i));
        }
        return reversed;
    }

}
