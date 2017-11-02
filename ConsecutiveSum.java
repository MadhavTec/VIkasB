import java.util.Scanner;


public class SumConsecutiveNum
{    
    
    static int countConsecutive(long num)
    {
        int count = 0;
        for (int L = 1; L * (L + 1) < 2 * num; L++)
        {
            float a = (float) ((1.0 * num-(L * (L + 1)) / 2) / (L + 1));
            if (a-(int)a == 0.0) 
                count++;        
        }
        return count;
    }
     
   
    public static void main(String[] args) {
    	 System.out.println("Please enter no");
    	Scanner sc = new Scanner(System.in);
    	 long N = sc.nextLong();
    	
        System.out.println(countConsecutive(N));
      
    }
}