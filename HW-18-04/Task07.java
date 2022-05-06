//Проверить, упорядочены ли элементы списка по алфавиту.

import java.util.Collections;
import java.util.LinkedList;


public class Task07 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();


        list.add("Aboba");
        //list.add("Sergei");
        list.add("Biba");
        list.add("Sergei");

        if(isSorted(list) == true){
            System.out.println("List is sorted");
        }else{
            System.out.println("List is not sorted");
        }
    }

    public static boolean isSorted(LinkedList toCheck){
        int count = 0;
        //инициализируем возвращаемую переменную
        boolean isSorted = false;
        LinkedList listToSort = new LinkedList<>();
        //создаем лист и записываем в него значения из передаваемого листа
        for (int i = 0; i <=toCheck.size() - 1; i++){
            listToSort.add(toCheck.get(i));
        }
        //сортируем лист чтобы потом сравнить по элементам
        Collections.sort(listToSort);
        //если первые элементы не совпадают то лист не отсортирован и сразу возвращаем false
        if(!toCheck.getFirst().equals(listToSort.getFirst())){
            isSorted = false;
        }else{
            //каждый элемент передаваемого массива сравнивается с отсортированным и если элементы совпадают
            //то добавляем +1 к count, а далее сравниваем, если count меньше размера листа, то лист не отсортирован,
            //а если равно - отсортирован
            for(int i = 0; i <= toCheck.size() - 1; i++){
                if(listToSort.get(i).equals(toCheck.get(i))){
                    count++;
                    if(count == toCheck.size()){
                        isSorted = true;
                    }
                }
            }
        }
        return isSorted;
    }
}
