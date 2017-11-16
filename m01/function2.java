import java.util.Scanner;
class function2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int x ; int menu;
		printA();
		System.out.print("Selection : ");
		x = sc.nextInt();
		if(x == 1){
			triangleA();
		}else if (x == 2){
			triangleB();
		}else if(x == 3){
			exit();
		}
	}
	public static void printA(){
		System.out.println("Menu : ");
		System.out.println("1. Triangle A");
		System.out.println("2. Triangle B");
		System.out.println("3. Exit");	
	}

	public static void triangleA(){
		Scanner sc = new Scanner(System.in);
			System.out.print("Input X = ");
			int z = sc.nextInt();
			for (int i = 1;i <= z;i++){
				for(int j = 1;j <= i;j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("X = "++" Unit");
	}
	public static void triangleB(){
		Scanner sc = new Scanner(System.in);
			System.out.print("Input X = ");
			int y = sc.nextInt();
			for (int i = y;i > 0;i--){
				for(int j = 1;j <= i;j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("X = "++" Unit");
	}
	
}
