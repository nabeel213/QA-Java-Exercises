
public class AddingArrays{
    public static void main(String [] args){
       
       int [] arrayA = {2,4,6} ;
       myMethod(arrayA);
       
    }
    public static int [] myMethod(int [] arrayA){
        
        int [] arrayB = {1,3,5};
        int [] arrayC = new int [arrayA.length];
        
        for(int i=0; i<arrayA.length; i++){
            
            
            arrayC [i] = arrayA[i] + arrayB[i];
            System.out.println(arrayC[i]);
            //return arrayC;
            
        }
        
        //System.out.println(arrayC);
        return arrayC;
        
    }
}
