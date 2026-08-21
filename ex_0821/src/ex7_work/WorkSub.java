package ex7_work;

public class WorkSub {
    
    public int big(int []arr){

        int biggest = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] > biggest)
            biggest = arr[i];
        }

        return biggest;
    }
}
