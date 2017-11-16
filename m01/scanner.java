import java.util.Scanner;
class scanner{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lenght : ");
		double lenght = sc.nextDouble();
		
		System.out.print("Width : ");
		double width = sc.nextDouble();
		
		double rectangle;
		rectangle = lenght * width;
		
		System.out.println("Rectangle : "+rectangle);
		
	}
}