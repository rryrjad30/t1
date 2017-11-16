import java.util.Scanner;

class fibonacci1{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int i = 1;
		int n = 0, n1 = 0, n2 = 0;
		System.out.print("Input X : ");
		int x = sc.nextInt();
		do{
			n = n1+n2;
			if(n == 0){
				n = 1;
			}
		System.out.println("Iteration-" + i + " = " + n);
		i++;
		n2 = n1;
		n1 = n;
		}while(i <= x);
	}
}