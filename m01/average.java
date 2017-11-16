import java.util.Scanner;
class average{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int x, y;
		double z;
		System.out.print("Array Length = ");
		x = sc.nextInt();
		int[] arr= new int[x];
		for(int i=0;i<arr.length;i++){
			
			System.out.print("Index-"+i+ " = ");
			arr[i] =sc.nextInt();
		}
		System.out.println("Average = " + average(arr));
	}
	
	public static double average(int[] arr) {
		double total = 0;
		for (int i=0;i<arr.length;i++) {
			total += arr[i];
		
		}
		return (total/arr.length);
		
	}
}