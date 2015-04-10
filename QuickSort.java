import java.util.Random;

public class QuickSort{
    
    public static void main(String[] args){
        
        //create dataset using rng
        int[] a10 = new int[10];
        for(int i = 0; i < (a10.length-1); i++){
            a10[i] = getrnd10000();
            System.out.println(a10[i]);
        }
        
        System.out.println("Sorted List: \n");
        quicksort(a10, 0, a10.length);
        for(int i = 0; i < (a10.length-1); i++){
            System.out.println(a10[i]);
        }
        
    }
    
    public static void quicksort(int array[], int start, int end)
    {
        int i = start;                          
        int k = end;                            

        if (end - start >= 1)               
        {
            int pivot = array[start];       

            while (k > i)                 
            {
                while (array[i] <= pivot && i <= end && k > i){ 
                    i++;                                  
                }
                while (array[k] > pivot && k >= start && k >= i){ 
                    k--;                                        
                    if (k > i)                                    
                        swap(array, i, k);
                }
            }
            swap(array, start, k);         
                                                
            quicksort(array, start, k - 1); 
            quicksort(array, k + 1, end);  
        }
        
        else
        {
                return;  
        }
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