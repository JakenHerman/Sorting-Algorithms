import java.util.Random;

public class SelectionSort{
    
    public static void main(String[] args){
      
        //
        //
        //
        //  TEST FOR ARRAY LENGTH OF 100
        //
        //
        //
        
        //create the dataset using RNG
        int[] a10 = new int[100];
        System.out.println("\n \n \n The Unsorted Data: \n \n \n");
        for(int i = 0; i < a10.length; i++){
            a10[i] = getrnd10000();
            //print unsorted data so we can check it before sorting
            System.out.println(a10[i]);
        }
        
        final long startTime10 = System.currentTimeMillis();
        //sort the data
        selection_sort(a10, a10.length);
        final long endTime10 = System.currentTimeMillis();
      
        //print the sorted data
        System.out.println("\n \n \n The Sorted Data: \n \n \n");
        for(int i = 0; i < a10.length; i++){
            System.out.println(a10[i]);
        } 
        
        
        //
        //
        //
        //  TEST FOR ARRAY LENGTH OF 100
        //
        //
        //
        
        //create the dataset using RNG
        int[] a1h = new int[100];
        System.out.println("\n \n \n The Unsorted Data: \n \n \n");
        for(int i = 0; i < a1h.length; i++){
            a1h[i] = getrnd10000();
            //print unsorted data so we can check it before sorting
            System.out.println(a1h[i]);
        }
        
        final long startTime1h = System.currentTimeMillis();
        //sort the data
        selection_sort(a1h, a1h.length);
        final long endTime1h = System.currentTimeMillis();
      
        //print the sorted data
        System.out.println("\n \n \n The Sorted Data: \n \n \n");
        for(int i = 0; i < a1h.length; i++){
            System.out.println(a1h[i]);
        }
        
        
        
        //
        //
        //
        //  TEST FOR ARRAY LENGTH OF 1000
        //
        //
        //
        
        //create the dataset using RNG
        int[] a1k = new int[1000];
        System.out.println("\n \n \n The Unsorted Data: \n \n \n");
        for(int i = 0; i < a1k.length; i++){
            a1k[i] = getrnd10000();
            //print unsorted data so we can check it before sorting
            System.out.println(a1k[i]);
        }
        
        final long startTime1K = System.currentTimeMillis();
        //sort the data
        selection_sort(a1k, a1k.length);
        final long endTime1K = System.currentTimeMillis();
      
        //print the sorted data
        System.out.println("\n \n \n The Sorted Data: \n \n \n");
        for(int i = 0; i < a1k.length; i++){
            System.out.println(a1k[i]);
        }
        
        
        //
        //
        //
        //
        //  TEST FOR ARRAY LENGTH OF 10000K
        //
        //
        //
        
        //create the dataset using RNG
        int[] a10k = new int[10000];
        System.out.println("\n \n \n The Unsorted Data: \n \n \n");
        for(int i = 0; i < a10k.length; i++){
            a10k[i] = getrnd10000();
            //print unsorted data so we can check it before sorting
            System.out.println(a10k[i]);
        }
        
        final long startTime10K = System.currentTimeMillis();
        //sort the data
        selection_sort(a10k, a10k.length);
        final long endTime10K = System.currentTimeMillis();
      
        //print the sorted data
        System.out.println("\n \n \n The Sorted Data: \n \n \n");
        for(int i = 0; i < a10k.length; i++){
            System.out.println(a10k[i]);
        }
  
        //print time data
        System.out.println("Total execution time with 10 elements: " + (endTime10 - startTime10));
        System.out.println("Total execution time with 100 elements: " + (endTime1h - startTime1h));
        System.out.println("Total execution time with 1,000 elements: " + (endTime1K - startTime1K));
        System.out.println("Total execution time with 10,000 elements: " + (endTime10K - startTime10K));
        
    }
    
    //create RNG for the dataset
    
    public static int getrnd10000() {
        Random rand = new Random();
        return rand.nextInt(100000);
    }
    
    //sort the data using selection sort
    
    public static void selection_sort(int a[], int n)
    {
    
        for(int last = (n-1); last >= 1; last--){
            
            int largest = index_of_largest(a, (last+1));
            
            //swap a[largest] with a([last])
            swap(a, largest, last);
            
        }
        
    }
    
    //find the index of the largest int in array a[]
    
    public static int index_of_largest(int a[], int size){
        
        int largest = 0;
        for(int i = 1; i < size; ++i){
            if(a[i] > a[largest]){
                largest = i;
            }
        }
        
        return largest;
        
    }
    
    //create a method to swap values of a[j] and a[i]
    
    public static void swap(int a[], int i, int j){
        
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        
    }
    
}