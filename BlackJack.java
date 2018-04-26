

public class BlackJack
{
  
    public static void main(String [] args){
    
        System.out.println(myMethod(18, 18));
    }
    public static int myMethod(int a, int b)
    {
        
       if (a>21 & b>21){
           System.out.println("both bust");
            return 0;
       }
       else if(a>b & a<=21){
           System.out.println("2");
           return a;  
       }
       else if(b>a & b<=21){
           
           System.out.println("3");
           return b;
       }
       
       
        return 0;
        
    }
}
