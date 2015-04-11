import java.util.Random;

public class Bubblesort{
    
    public static void main(String[] args){
        
        /*
         * 
         *  TEST WITH 10 ELEMENTS
         * 
         */
        
        //create dataset using rng
        int[] a10 = new int[11];
        for(int i = 0; i < (a10.length); i++){
            a10[i] = getrnd10000();
            System.out.println(a10[i]);
        }
        
        System.out.println("Sorted Data: \n");
        final long startTime10 = System.currentTimeMillis();
        bubblesort(a10);
        final long endTime10 = System.currentTimeMillis();
        for(int i = 0; i < (a10.length); i++){
            System.out.println(a10[i]);
        }
        
        /*
         * 
         * 
         * TEST WITH 100 ELEMENTS 
         * 
         */
        
        //create dataset using rng
        int[] a1h = new int[101];
        for(int i = 0; i < (a1h.length); i++){
            a1h[i] = getrnd10000();
            System.out.println(a1h[i]);
        }
        
        System.out.println("Sorted Data: \n");
        final long startTime1h = System.currentTimeMillis();
        bubblesort(a1h);
        final long endTime1h = System.currentTimeMillis();
        for(int i = 0; i < (a1h.length); i++){
            System.out.println(a1h[i]);
        }
       
        /*
         * 
         * 
         * TEST WITH 1000 ELEMENTS
         * 
         * 
         */
        
        //create dataset using rng
        int[] a1K = new int[1001];
        for(int i = 0; i < (a1K.length); i++){
            a1K[i] = getrnd10000();
            System.out.println(a1K[i]);
        }
        
        System.out.println("Sorted Data: \n");
        final long startTime1K = System.currentTimeMillis();
        bubblesort(a1K);
        final long endTime1K = System.currentTimeMillis();
        for(int i = 0; i < (a1K.length); i++){
            System.out.println(a1K[i]);
        }
        
        /*
         * 
         * 
         * TEST WITH 10,000 ELEMENTS
         * 
         */
        
        //create dataset using rng
        int[] a10k = new int[10001];
        for(int i = 0; i < (a10k.length); i++){
            a10k[i] = getrnd10000();
            System.out.println(a10k[i]);
        }
        
        System.out.println("Sorted Data: \n");
        final long startTime10k = System.currentTimeMillis();
        bubblesort(a10k);
        final long endTime10k = System.currentTimeMillis();
        for(int i = 0; i < (a10k.length); i++){
            System.out.println(a10k[i]);
        }
        
        //print time data
        System.out.println("Total execution time with 10 elements: " + (endTime10 - startTime10));
        System.out.println("Total execution time with 100 elements: " + (endTime1h - startTime1h));
        System.out.println("Total execution time with 1000 elements: " + (endTime1K - startTime1K));
        System.out.println("Total execution time with 10,000 elements: " + (endTime10k - startTime10k));
    }
    
    public static int getrnd10000() {
        Random rand = new Random();
        return rand.nextInt(100000);
    }
    
    public static int[] bubblesort(int[] numbers) {
    boolean swapped = true;
    for(int i = numbers.length - 1; i > 0 && swapped; i--) {
        swapped = false;
        for (int j = 0; j < i; j++) {
            if (numbers[j] > numbers[j+1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
                swapped = true;
            }
        }
    }
    return numbers;
    }
    
}