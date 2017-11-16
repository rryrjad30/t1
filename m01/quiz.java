import java.util.Scanner;

class quiz{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan tanggal lahir : ");
		int x = sc.nextInt();
		System.out.print("Masukkan bulan lahir : ");
		int y = sc.nextInt();
		String zodiak = "";
		if(x >= 1 && x <= 21 && y ==3 || y ==4){
			if(y == 3 || y == 4){
			zodiak = "Aries";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: suka menonjolkan diri, senang beraktifitas, menyukai kepemimpinan.");
			}
			
		}else if(x >= 1 && x <= 21 && y ==4 || y ==5){
			if(y == 4 || y == 5){
			zodiak = "Taurus";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: suka hak milik dan tanah.");
			}
		}else if(x >= 1 && x <= 20 && y ==5 || y ==6){
			if(y == 5 || y == 6){
			zodiak = "Gamini";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: menjadi penjual jasa");
			}
		}else if(x >= 1 && x <= 22 && y ==6 || y ==7){
			if(y == 6 || y == 7){
			zodiak = "Cancer";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: sangat peduli urusan rumah");
			}
		}else if(x >= 1 && x <= 23 && y ==7 || y ==8){
			if(y == 7 || y == 8){
			zodiak = "Leo";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: suka hak milik dan tanah.");
			}
		}else if(x >= 1 && x <= 23 && y ==8 || y ==9){
			if(y == 8 || y == 9){
			zodiak = "Virgo";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: suka hak milik dan tanah.");
			}
		}else if(x >= 1 && x <= 21 && y ==9 || y ==10){
			if(y == 9 || y == 10){
			zodiak = "Libra";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: suka hak milik dan tanah.");
			}
		}else if(x >= 1 && x <= 21 && y ==10 || y ==11){
			if(y == 10 || y == 11){
			zodiak = "Scorpio";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: suka hak milik dan tanah.");
			}
		}else if(x >= 1 && x <= 21 && y ==11 || y ==12){
			if(y == 11 || y == 12){
			zodiak = "Sagitarius";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: suka hak milik dan tanah.");
			}
		}else if(x >= 1 && x <= 21 && y ==12 || y ==1){
			if(y == 12 || y == 1){
			zodiak = "Capricorn";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: suka hak milik dan tanah.");
			}
		}else if(x >= 1 && x <= 21 && y ==1 || y ==2){
			if(y == 1 || y == 2){
			zodiak = "Aquarius";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: suka hak milik dan tanah.");
			}
		}else if(x >= 1 && x <= 21 && y ==2 || y ==3){
			if(y == 2 || y == 3){
			zodiak = "Pisces";
			System.out.println("Tanggal Lahir "+ x +"Bulan "+ y +"Zodiak Anda adalah: "+ zodiak);
			System.out.println("Sifat Umum: suka hak milik dan tanah.");
			}
		}
	}
}
