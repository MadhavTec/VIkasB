import java.util.Scanner;

public class InTheFuture {
	static int minNum(int A, int K, int P) {
		if (A < K) {
			int d = 1;
			for (; A + P >= K; d++) {
				P += A - K;
			}
			return d;
		}
		else {
			return -1;
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int asha = sc.nextInt();
		int kelly = sc.nextInt();
		int ahead = sc.nextInt();
		System.out.println(minNum(asha, kelly, ahead));
	}
}