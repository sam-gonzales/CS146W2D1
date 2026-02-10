public class App {
    public static void lomuto (int [] arr){
        int length = arr.length;
        // last elem of arr is pivot
        int pivot = arr[length - 1]; 

        int i = -1; // tracker

        // swap i and j if j <= pivot, increment i
        for(int j = 0; j < length; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // pivot will be at the last elem
        // swap i, with pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[length - 1];
        arr[length - 1] = temp;

    }


    public static void hoare(int [] arr){
        int length = arr.length;
        int i = -1;
        int j = length;
        int pivot = arr[0];

        while(true){

            // move i to the right until an elem greater/equal to pivot
            do { 
                i++;
            } while (arr[i] < pivot);

            // move j to the left until an elem lesser/equal to pivot
            do { 
                j--;
            } while (arr[j] > pivot);

            // 
            if(i > j){
                break;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
    }

}
