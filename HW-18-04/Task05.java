//Проверить, что каждое следующее слово в списке начинается с последней буквы предыдущего.

/*
не самый очевидный способ решить эту задачу. Я даже комменты оставлю чтобы было проще читать
 */


import java.util.LinkedList;

public class Task05 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("airst Valua");
        list.add("qecond Valub");
        list.add("qhird Valuc");
        list.add("Fourth Valud");

        //Задаем последнюю букву для 0 элемента (так проще)
        String firstString = (String) list.get(0);
        String lastChar = String.valueOf(firstString.charAt(firstString.length() - 1));
        //Переменные которые я буду использовать для записи строки и вычленения буквы
        String lastString;
        String firstChar;

        int iterator = 1; //итератор с 1, потому что 0 значение мы записали на 20, 21 строке
        while(list.size() > iterator) {
            lastString = (String) list.get(iterator); //получаю строку iterator
            firstChar = String.valueOf(lastString.charAt(0)); // получаю первую букву из строки
            //тут проверка на метч
            if(lastChar.contains(firstChar)){
                System.out.println("Контейнс");;
            }
            //перезаписываю предефайнд букву нулевой строки на последнюю букву итерируемой строки
            lastChar = String.valueOf(lastString.charAt(lastString.length() - 1));

            iterator++;
        }
    }
}
