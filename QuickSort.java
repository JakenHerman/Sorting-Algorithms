import java.util.Random;

public class QuickSort{
    
    public static void main(String[] args){
        
        //create dataset using rng
        int[] a10 = new int[11];
        for(int i = 0; i < (a10.length-1); i++){
            a10[i] = getrnd10000();
            System.out.println(a10[i]);
        }
        
        System.out.println("Sorted List: \n");
        quicksort(a10, 0, a10.length);
        for(int i = 0; i < a10.length; i++){
            System.out.println(a10[i]);
        }
        
    }
    
    public static void quicksort(int[] A, int left, int right) {
        int pivot = A[left + (right - left) / 2];
        int i = left;
        int j = right;
        while (i <= j) {
            while (A[i] < pivot) {
                i++;
            }
            while (A[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(A, i, j);
                i++;
                j--;
            }
        }

        if(left < j)
            quicksort(A,left,j);
        if(i < right)
            quicksort(A,i,right);
    }
    
    public static void swap(int a[], int i, int j){
        
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        
    }
    
    public static int getrnd10000() {
        Random rand = new Random();
        return rand.nextInt(100000);
    }
    
}