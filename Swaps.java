public class Swaps{
    
    public static void main(String[] args){
        int[] a = {0, 1, 2, 3, 4, 5};
        
        swap1(a, 0, 1);
        System.out.println("Array should be: 1, 0, 2, 3, 4, 5");
        System.out.println("Array is:\n");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
        
        swap2(a, 0, 1);
        System.out.println("Array should be: 0, 1, 2, 3, 4, 5");
        System.out.println("Array is :\n");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
        
        swap3(a, 0, 1);
        System.out.println("Array should be: 1, 0, 2, 3, 4, 5");
        System.out.println("Array is:\n");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
    
    }
    
    public static void swap1(int[] a, int i, int j){
        
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        
    }
    
    public static void swap2(int[] a, int i, int j){
        
        a[i] = a[i] + a[j];
        a[j] = a[i] - a[j];
        a[i] = a[i] - a[j];
        
    }
    
    public static void swap3(int[] a, int i, int j){
        
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
        
    }
}