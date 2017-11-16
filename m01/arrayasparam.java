class arrayasparam{
	public static void main(String[]args){
		int[] intArr={1,2,3,4,5};
		process1(intArr);
		process1(new int[]{6,7,8,9,10});
		process2(11,12,13,14,15);
		process3("Apel","Jeruk","Mangga");
	}
	public static void process1(int[]arr){
		for(int i=0; i<arr.length;i++){
			System.out.printf("%05d ", arr[i]);
		}System.out.println("");
	}
	public static void process2(int ... arr){
		for(int n :arr){
			System.out.printf("%02d ", n);
		}System.out.println("");
	}
	public static void process3(String ... arr){
		for(String n :arr){
			System.out.printf(n+ " ");
		}System.out.println("");
	}
}
//%.2f%n
//%,.2f%n
