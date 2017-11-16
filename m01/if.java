class ternary{
	public static void main(String[]args){
		int a= 5; int b= 6;
		if(a<b){
			System.out.println("Regular if : a < b");
		}
		else{
			System.out.println("Regular if : a > b");
		}
		// System.out.println(a<b ? "Ternary : a < b" : "Ternary : a > b");
		
		String hasil = a<b ? "Ternary : a < b" : "Ternary : a > b";
		System.out.println(hasil);
	}
}