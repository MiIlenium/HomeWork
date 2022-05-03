package Task07;

import java.util.Arrays;

public abstract class SortArray implements ISort{
    @Override
    public void SortAsc(int[] num) {
        Arrays.sort(num);
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }

    @Override
    public void SortDesc(int[] num) {
        Arrays.sort(num);
        for(int i = num.length-1; i >= 0; i--){
            System.out.println(num[i] + "");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 7};

        SortArray sortArray = new SortArray(){};
        sortArray.SortAsc(arr);
        sortArray.SortDesc(arr);


    }
}


