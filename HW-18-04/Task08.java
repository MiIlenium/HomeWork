//Определить, входит ли список L1 в L2.

import java.util.LinkedList;

public class Task08 {
    public static void main(String[] args) {
        LinkedList firstList = new LinkedList();
        LinkedList secondList = new LinkedList();

        firstList.add("fdg");
        firstList.add("kfdjfdbfbgf");
        firstList.add("jfdnjvf");

        secondList.add("Contains");
        secondList.add("Not Contains");
        secondList.add("Contains Not Contains");
        secondList.add("UberContasdf");
        secondList.add("asfwqe");

        System.out.println(isContains(firstList, secondList));
    }

    public static boolean isContains(LinkedList l1, LinkedList l2){
        boolean isContains = false;

        for(int i = 0; i<=l1.size() - 1; i++){
            for(int j = 0; j <= l2.size() - 1; j++){
                if(l1.contains(l2.get(j))){
                    isContains = true;
                }
            }
        }

        return isContains;
    }
}
