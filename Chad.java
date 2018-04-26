public class Chad{
    public static void main (String [] args){
        
        //myMethod(4,4);
        
        myMethod(3,3, true);
        
        //System.exit(0);
    }
    public static int myMethod(int a, int b, boolean bool){
        
        
        for(int i=0; i <=a; i++){
            if(bool==true){
            
                int c = a+b;
                
                System.out.println(c);
                
            }
            else {
            
                //(bool==false){
            
            
                int c = a * b;
                System.out.println(c);
                //return c;
               
            }
        }
       
        /*
        if(a==0 & b!=0){
            
            return b;
            
        }
        else if(b==0 & a!=0){
            
            System.out.println(a);
            return a;
            
        }
        */
        
       return a;
    
   }
}