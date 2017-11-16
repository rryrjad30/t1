import java.util.Scanner;
class fibonacci{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int x , i, a = 0, b = 1, c;
		System.out.print("Input x : ");
		x = sc.nextInt();
		
		for(i = 1;i <= x; i++){
			c = a + b;
			System.out.println("Iteration-"+i+" = "+c);
			if (i!=1){
				a=b;
				b=c;
			}
		}
	}
}