package nilaiMahasiswaApp;

import java.util.Scanner;

public class NilaiMahasiswaArray {
	public static void main(String[] arg) {
//		deklarasi variabel
		String nilaiHuruf;
		float nilaiAngka;// index 0
		float nilaiUTS;// index 1
		float nilaiUAS;// index 2
		float nilaiTugas;// index 3
		
//		deklarasi dengan array
		float scores[]=new float[4];

//		masukan dari keyboard
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan nilai tugas	: ");
		scores[3] = scanner.nextFloat();
		System.out.print("Masukkan nilai UTS	: ");
		scores[1] = scanner.nextFloat();
		System.out.print("Masukkan nilai UAS	: ");
		scores[2] = scanner.nextFloat();

//		hitung nilai angka
		scores[0] = (float) ((scores[3] * 0.2) + (scores[1] * 0.3) + (scores[2] * 0.5));

//		ubah nilai angka ke nilai huruf
		if (scores[0] >= 80) {
			nilaiHuruf = "A";
		}else if(scores[0] >= 60 && scores[0] < 80) {
			nilaiHuruf="B";
		}else if(scores[0] >= 50 && scores[0] < 60) {
			nilaiHuruf="C";
		}else if(scores[0] >= 25 && scores[0] < 50) {
			nilaiHuruf="D";
		}else {
			nilaiHuruf="F";
		}
		
//		tampilkan nilai huruf
		System.out.println("\n-------------------------------");
		System.out.println("Nilai Angka Anda adalah "+scores[0]);
		System.out.println("Nilai Huruf Anda adalah "+nilaiHuruf);
		System.out.println("---------------------------------");

	}
}
