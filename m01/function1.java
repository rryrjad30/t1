class function1 {
	public static void main(String[]args){
		System.out.println("a=5 b=3, a*b = " + multiply (5, 3, 3));
		System.out.println("a=2 b=10, a*b = " + multiply (2, 10,2));
	}
	public static int multiply (int a, int b, int x){
		int c;
		c=a*b*x;
		String abx = "Hello";
		System.out.println(abx);
		return c;
	}
}