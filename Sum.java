

public class Sum
{
    public static void main(String [] args){
    
        System.out.println(myMethod(1, 2, 1));
    }
    public static int myMethod(int a, int b, int c)
    {
       int t1 = a-b;
       int t2 = b-c;
       int t3 = a-c;
       
       if(t1==0){
           if(t3==0){
               a = 0;
               b = 0;
               c = 0;
               int result = a+b+c;
               //System.out.println("haha the problem is here");
               return result;
               
           }
           else if(t3!=0){
               a = 0;
               b = 0;
               
               int result = a+b+c;
               //System.out.println("haha 2222");
               return result; 
            }   
       }
       else if(t1!=0){
           if(t3!=0){
               
               if (t2==0){
                   b = 0;
                   c = 0;
                   int result = a+b+c;
                   return result;
                
                }
                else if(t2!=0){
                    
                   int result = a+b+c;
                   return result;
                
                }
                
                b = 0;
                c = 0;
                //System.out.println("haha 5555555555");
                int result = a+b+c;
                 
            }

               int result = a+b+c;
               //System.out.println("haha 333333");
               return result;
       }
       else if (t3==0) {
           
           if(t2!=0){
               
               a = 0;
               c = 0;
               int result = a+b+c;
               //System.out.println("h444444444");
               return result;
               
           }
           else if(t2==0){
               
               a = 0;
               b = 0;
               c = 0;
                int result = a+b+c;
                //System.out.println("h444444444");
                return result;
               
            }
               
       }
       else if(t2==0){
                
           b = 0;
           c = 0;
           //System.out.println("haha 5555555555");
           int result = a+b+c;
                 
       }
       
       else if(t3!=0){
           b = 0;
           c = 0;
           int result = a+b+c;
           //System.out.println("6666666");
           return result;
           
        }
       else if (t1==0 & t3==0){
           a = 0;
           b = 0;
           c = 0;
           int result = a+b+c;
           //System.out.println("h7777777");
           return result;
       }
       return 1;
    }           
}    
    

