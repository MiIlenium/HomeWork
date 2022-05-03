package Task06;

public class Array implements IMath{

    int arr[] = {5,3,5,1};

    @Override
    public int Max() {
        int max = arr[0];
        for(int i = 0; i <=arr.length - 1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    @Override
    public int Min() {
        int min = arr[0];
        for(int i = 0; i <=arr.length - 1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        int avg = 0;
        for(int i = 0; i < arr.length; i++){
            avg += arr[i];
        }
        return avg;
    }
}
