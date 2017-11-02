import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

class LargestSubsetSum
{
	private static long[] maxSubsetSum(int[] k) {
		long[] max_result = new long[k.length];
		int i = 0;
		int max_sum = 0;
		for(int n : k)
		{
			max_sum = 0;
			for (int j = 1; j < (n / 2) + 1; j++) {
				if (n % j != 0) {
					continue;
				}
				else {
					max_sum = max_sum + j;
				}
			}
			max_result[i] = max_sum + n;
			i++;
		}
		return max_result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int[] k = new int[no];
		for (int i = 0; i < no; i++) {
			k[i] = sc.nextInt();
		}
		long[] result = maxSubsetSum(k);
		for (long s : result) {
			System.out.println(s);
		}
	}
}