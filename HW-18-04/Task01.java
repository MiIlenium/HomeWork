import java.util.LinkedList;

public class AvgArithmetic {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        double avg = 0;
        for(int i = 0; i <= 100; i++){
            list.add(Math.random() * 100);
            avg += (double)list.get(i);
        }
        System.out.println(avg);
    }
}
