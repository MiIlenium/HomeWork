package Task06;

public class Array implements IMath{

    @Override
    public int Max(int arr[]) {
        int max = arr[0];
        for(int i = 0; i <=arr.length - 1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    @Override
    public int Min(int arr[]) {
        int min = arr[0];
        for(int i = 0; i <=arr.length - 1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public float Avg(int arr[]) {
        int avg = 0;
        for(int i = 0; i < arr.length; i++){
            avg += arr[i];
        }
        return avg;
    }
}
