import java.util.Random;

public class InsertionSort{

    public static void main(String[] args){
    
        
        //create dataset using RNG
        int[] a10 = new int[11];
        for(int i = 0; i < a10.length; i++)
        {
            a10[i] = getrnd10000();
            //print unsorted data so we can check it before sorting
            System.out.println(a10[i]);
        }
        
        final long startTime10 = System.currentTimeMillis();
        //sort the dataset
        insertion_sort(a10);
        final long endTime10 = System.currentTimeMillis();
        
        System.out.println("Sorted Data \n");
        for(int i = 0; i < a10.length; i++)
        {
            System.out.println(a10[i]);
        }
        
        
        /*
         
         TEST FOR ARRAY LENGTH OF 100
         
         */
        
        //create dataset using RNG
        int[] a1H = new int[101];
        for(int i = 0; i < a1H.length; i++)
        {
            a1H[i] = getrnd10000();
            //print unsorted data so we can check it before sorting
            System.out.println(a1H[i]);
        }
        
        final long startTime1H = System.currentTimeMillis();
        //sort the dataset
        insertion_sort(a1H);
        final long endTime1H = System.currentTimeMillis();
        
        System.out.println("Sorted Data \n");
        for(int i = 0; i < a1H.length; i++)
        {
            System.out.println(a1H[i]);
        }
        
        /*
         
         TEST FOR ARRAY LENGTH OF 1000
         
         */
        
        //create dataset using RNG
        int[] a1k = new int[1001];
        for(int i = 0; i < a1k.length; i++)
        {
            a1k[i] = getrnd10000();
            //print unsorted data so we can check it before sorting
            System.out.println(a1k[i]);
        }
        
        final long startTime1k = System.currentTimeMillis();
        //sort the dataset
        insertion_sort(a1k);
        final long endTime1k = System.currentTimeMillis();
        
        System.out.println("Sorted Data \n");
        for(int i = 0; i < a1k.length-1; i++)
        {
            System.out.println(a1k[i]);
        }
        
        /*
         
         TEST FOR ARRAY LENGTH OF 10000
         
         */
        
        //create dataset using RNG
        int[] a10k = new int[10001];
        for(int i = 0; i < a10k.length; i++)
        {
            a10k[i] = getrnd10000();
            //print unsorted data so we can check it before sorting
            System.out.println(a10k[i]);
        }
        
        final long startTime10k = System.currentTimeMillis();
        //sort the dataset
        insertion_sort(a10k);
        final long endTime10k = System.currentTimeMillis();
        
        System.out.println("Sorted Data \n");
        for(int i = 0; i < a10k.length-1; i++)
        {
            System.out.println(a10k[i]);
        }
        
        
        //print time data
        System.out.println("Total execution time with 10 elements: " + (endTime10 - startTime10));
        System.out.println("Total execution time with 100 elements " + (endTime1H - startTime1H));
        System.out.println("Total execution time with 1000 elements " + (endTime1k - startTime1k));
        System.out.println("Total execution time with 10000 elements " + (endTime10k - startTime10k));
    
    }
    
    public static void insertion_sort(int a[]){
        for(int i = 1; i < a.length-1; i++){
            int x = a[i];
            int j = i;
            while (j > 0 && (a[j-1] > x)){
                a[j] = a[j-1];
                j = j - 1;
            }
            a[j] = x;
        }
    }
    
    //create random number generator for the dataset
    public static int getrnd10000(){
        Random rand = new Random();
        return rand.nextInt(100000);
    }
    

}