import java.util.Scanner;

class cetak1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\"Value\"");
		
		System.out.print("\tVar A\t= ");
		double vara = sc.nextDouble();
		
		System.out.print("\tVar B\t= ");
		double varb = sc.nextDouble();
		
		System.out.println("\"Calc\"");
		
		double plus, minus, multiply, division, mod;
		
		plus = vara+varb;
		minus = vara-varb;
		multiply = vara*varb;
		division = vara/varb;
		mod = vara%varb;
		
		System.out.println("\tPlus\t= " + plus);
		System.out.println("\tMinus\t= " + minus);
		System.out.println("\tMultiply= " + multiply);
		System.out.println("\tDivision= " + division);
		System.out.println("\tMod\t= " + mod);
		
	}
}