import java.util.Scanner;

class loopfor{
	public static void main(String[]args){
		int i, number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		for(i=1;i <= number; i++){
			if(i % 2 ==0){
				System.out.println(i + "\"Even\"");
			} else{
				System.out.println(i + "\"Odd\"");
			}
		}
	}
}