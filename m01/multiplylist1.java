import java.util.Scanner;
class multiplylist1{
	public static int calc(int A, int B){
		return A * B;
	}
	public static void printCalc(int Z, int B){
		System.out.println(Z + " X " + B + " = " + calc(Z, B));
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("X : ");
		int x = sc.nextInt();
		for(int i = 1; i <= x; i++){
			System.out.println("Base "+ i);
			for(int j = 1;j <= x; j++){
				printCalc(i, j);
			}
			System.out.println();
		}
		System.out.println("Reuse 2 x 6");
		printCalc(2, 6);
	}
}