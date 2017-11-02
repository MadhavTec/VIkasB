import java.util.Arrays;
import java.util.Scanner;

class BuyingShowTicket{
	public static long times( int[] tickets, int p) {
	    long times = 0;
	    int[] temp = Arrays.copyOf(tickets, tickets.length); 
	    for(int i = 0; i < tickets.length; i++ ) {
	       temp[i] = tickets[i] - tickets[p];
	    }
	    for(int i = 0; i < tickets.length; i++ ) {
	       if(temp[i] < 0)
	    	   times += tickets[i];
	       else {
	          if(i <= p) 
	        	  times += tickets[p];
	          else times += tickets[p] - 1;
	       }
	    }
	    return times;
	} 

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int no =sc.nextInt();
		int tickets[]= new int[no];
		for (int i = 0; i < no; i++) {
			tickets[i]=sc.nextInt();
		}
		int pos=sc.nextInt();
		System.out.println(times(tickets,pos));
	}
}