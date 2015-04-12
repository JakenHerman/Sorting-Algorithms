import java.util.Random;

public class RadixSort{
    
    public static void main(String[] args){
        
        //create the dataset using rng
        int[] a10 = new int[11];
        for(int i = 0; i < a10.length; i++){
            a10[i] = getrnd10000();
            System.out.println(a10[i]);
        }
        
        radix_sort(a10, 5);
        for(int i = 0; i < a10.length; i++){
            System.out.println(i + ": " + a10[i]);
        }
        
    }
    
    public static int getrnd10000(){
        Random rand = new Random(); 
        return rand.nextInt(10000);
        
    }
    
 
    public static void radix_sort(int[] array, int maxDigitSymbols) {
        int mod = 10;
        int dev = 1;
        for (int i = 0; i < maxDigitSymbols; i++, dev *= 10, mod *= 10) {
            for(int j = 0; j < array.length; j++) {
                int bucket = (array[j] % mod) / dev;
                counter[bucket].add(array[j]);
            }
            int pos = 0;
            for(int j = 0; j < counter.length; j++) {
                Integer value = null;
                while ((value = counter[j].poll()) != null) {
                    array[pos++] = value;
                }
            }
        }
 
    }
    
}