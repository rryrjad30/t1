import java.util.Scanner;
class arrayindexoperator{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int x >= 0; x <=11;
		System.out.print("Enter : ");
		x = sc.nextInt();
		int month_days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("This month has "+ month_days[x] + " days.");
		System.out.println("Previous month has "+ month_days[x-1] + " days.");
		System.out.println("Next month has "+ month_days[x+1] + " days.");
	}
}