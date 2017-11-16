import java.util.Scanner;
class ketupat{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input X : ");
		int x = sc.nextInt();
		for(int i=1;i<=x;i++){
			for(int j=1;j<=i;j++){
				System.out.print("@");
			}System.out.println("");
		}for(int i=x;i<=x;i++){
			for(int j=1;j<=i;j--){
				System.out.print("@");
			}System.out.println("");
		}
	}
}