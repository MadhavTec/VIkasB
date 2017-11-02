import java.util.Scanner;
import java.io.IOException;

public class PsychometricTest
{
    static int[]jobOffers(int[]scores,int[]lowerLimits,int[] upperLimits)
    {
		int[] count = new int[lowerLimits.length];
        for(int i=0;i<lowerLimits.length;i++)
        {
            for(int j=0;j<scores.length;j++)
            {
                if(scores[j]>=lowerLimits[i] && scores[j]<=upperLimits[i])
                    count[i]++;
            }
        }
        return count;
    }

    public static void main(String[]args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int q;
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        q = sc.nextInt();
        int[] lower = new int[q];
        for (int i = 0; i < q; i++) {
            lower[i] = sc.nextInt();
        }
        q = sc.nextInt();
        int[] upper = new int[q];
        for (int i = 0; i < q; i++) {
            upper[i] = sc.nextInt();
        }
        int[] job_offers = jobOffers(scores, lower, upper);
        for (int offer:job_offers) {
            System.out.println(offer);
        }
	}
}