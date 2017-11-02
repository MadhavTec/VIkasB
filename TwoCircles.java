import java.util.Arrays;
import java.util.Scanner;

public class TwoCircles {
	private static String[] circles(String[] info) {
		String[] result=new String[info.length];
		for (int i = 0; i < info.length; i++) {
			String[] data=info[i].trim().split(" ");
			int xOfCircle1=0;
			int yOfCircle1=0;
			int rOfCircle1=0;
			int xOfCircle2=0;
			int yOfCircle2=0;
			int rOfCircle2=0;
			try{
				xOfCircle1=Integer.parseInt(data[0]);
				yOfCircle1=Integer.parseInt(data[1]);
				rOfCircle1=Integer.parseInt(data[2]);
				xOfCircle2=Integer.parseInt(data[3]);
				yOfCircle2=Integer.parseInt(data[4]);
				rOfCircle2=Integer.parseInt(data[5]);
			}catch(NumberFormatException e){
				System.out.println("Invalid Number encountered while processing input data!");
			}
			int rSum=rOfCircle1+rOfCircle2;
			int rDiff=rOfCircle1-rOfCircle2 > 0 ? rOfCircle1-rOfCircle2 : rOfCircle2-rOfCircle1;
			double distance = Math.pow((xOfCircle1 - xOfCircle2) * (xOfCircle1 - xOfCircle2) + (yOfCircle1 - yOfCircle2) * (yOfCircle1 - yOfCircle2), 0.5);
			if((xOfCircle1==xOfCircle2) &&(yOfCircle1==yOfCircle2)) {
				result[i]="Concentric";
			}
			else if(distance>rDiff && distance<rSum) {
				result[i]="Intersecting";
			}
			else if(distance==rSum||distance==rDiff) {
				result[i]="Touching";
			}
			else if (distance<(rOfCircle1 > rOfCircle2 ? rOfCircle1 : rOfCircle2)) {
				result[i] = "Disjoint-Inside";
			}
			else if (distance > rSum) {
				result[i]="Disjoint-Outside";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfTestCase=sc.nextInt();
		sc.nextLine();
		String info[]=new String[noOfTestCase];
		for (int i = 0; i < info.length; i++) {
			info[i]=sc.nextLine();
		}
		String result[]=circles(info);
		for (String s : result) {
			System.out.println(s);
		}
	}
}