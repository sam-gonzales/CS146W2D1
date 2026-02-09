public class App {
    public static void lomuto (int [] arr){
        int length = arr.length;
        int pivot = arr[length - 1];

        int i = -1; // tracker

        for(int j = 0; j < length; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr[j], arr[i]);
            }
        }

        swap(arr[i], arr[pivot]);

    }


    public static void hoare(int [] arr){

    }


    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
