public class Arrays {
    public static void main (String [] args){
        
        myMethod();

    }
    public static void myMethod(){
        int [] arrayA = new int [10];
        int data = 5;
        System.out.println("Orignal array: ");
        
        for(int i=0; i<10; i++){
           
            arrayA [i] = data;
            data = data +1;
            
            
            System.out.print(" "+ arrayA[i]);
        
        }
        System.out.println();
        System.out.println("Array Multiplied by 10: ");
        
        for(int i=0; i<10; i++){
            
            arrayA [i] = arrayA[i]*10;
            System.out.print(" " + arrayA[i]);
        }
    }
}