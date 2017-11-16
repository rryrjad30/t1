import java.util.Scanner;
class trianglex{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input X : ");
		int x = sc.nextInt();
		int k = 0;
		int twoD[][]=new int[x][x];
		/*for (int i = 1;i <= x;i++){
			for(int j = 1;j <= i;j++){
			twoD[i][j]=k;
			k++;
			System.out.printf("%02d ", twoD[i][j]);
			}
		}*/
		for(int i=0; i<x; i++){
			for(int j=0; j<=i;j++){
				twoD[i][j]=k;
				k++;
				System.out.printf("%02d ", twoD[i][j]);
			}System.out.println(" ");
		}
			
	}
}