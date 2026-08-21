package ex7_work;

public class WorkMain {
    public static void main(String[] args) {
         
        //가장 큰 값 : 20
        int [] arr ={1,11,7,20,13,15};

        // int biggest = 0;

        // for (int i = 0; i < arr.length; i++) {
            
        //     if(arr[i] > biggest)
        //     biggest = arr[i];
        // } ----> Sub로 넘김

        WorkSub ws = new WorkSub();
        int answer = ws.big(arr);

        System.out.println("가장 큰 값 : "+ answer);
    }
}
