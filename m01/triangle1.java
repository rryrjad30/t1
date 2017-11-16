import java.util.Scanner;
class triangle1{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Input X : ");
		int x = sc.nextInt();
		for (int i = 1;i <= x;i++){
			for(int j = 1;j <= i;j++){
				if(i >= 2 && i!=x && j!=i && j!=1){
					System.out.print("#");
				}else{
					System.out.print("0");
				}
				
			}
			System.out.println(" ");
		}
	}
}