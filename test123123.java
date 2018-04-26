import java.util.Random;
public class test123123
{
    public static void main(String [] args)
    {
        for(int i = 0; i<20; i++){
      Random randNum = new Random();
        int  n = randNum.nextInt(3) + 1;
        System.out.println(n);
    }
    }
}
