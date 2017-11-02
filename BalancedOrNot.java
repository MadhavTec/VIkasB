import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedOrNot {
	public static int[] balancedOrNot(String[] expressions, int[] maxReplacements){
		int [] res = new int[expressions.length];
		for (int i = 0; i < expressions.length; i++) {
			res[i]=passing(expressions[i],maxReplacements[i]);
		}
		return res;
	}

	private static int passing(String expres, int maxRep) {
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		for(char ch : expres.toCharArray()){
			if(ch == '<'){
				stack.push('<');
			}
			else if(stack.empty()){
				count++;
			}
			else
				stack.pop();
		}
		return (stack.isEmpty() && count <= maxRep) ? 1 : 0;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] input = new String[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.next();
		}
		int m = sc.nextInt();
		int [] maxReplacements = new int[m];
		for (int i = 0; i < m; i++) {
			maxReplacements[i] = sc.nextInt();
		}
		for(int i : balancedOrNot(input, maxReplacements)) {
			System.out.println(i);
		}
	}
}