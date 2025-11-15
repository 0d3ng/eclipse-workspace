package nilaiMahasiswaApp;

import java.util.Scanner;

public class NilaiMahasiswa {
	public static void main(String[] arg) {
//		deklarasi variabel
		String nilaiHuruf;
		float nilaiAngka;
		float nilaiUTS;
		float nilaiUAS;
		float nilaiTugas;

//		masukan dari keyboard
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan nilai tugas	: ");
		nilaiTugas = scanner.nextFloat();
		System.out.print("Masukkan nilai UTS	: ");
		nilaiUTS = scanner.nextFloat();
		System.out.print("Masukkan nilai UAS	: ");
		nilaiUAS = scanner.nextFloat();

//		hitung nilai angka
		nilaiAngka = (float) ((nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.5));

//		ubah nilai angka ke nilai huruf
		if (nilaiAngka >= 80) {
			nilaiHuruf = "A";
		}else if(nilaiAngka >= 60 && nilaiAngka < 80) {
			nilaiHuruf="B";
		}else if(nilaiAngka >= 50 && nilaiAngka < 60) {
			nilaiHuruf="C";
		}else if(nilaiAngka >= 25 && nilaiAngka < 50) {
			nilaiHuruf="D";
		}else {
			nilaiHuruf="F";
		}
		
//		tampilkan nilai huruf
		System.out.println("\n-------------------------------");
		System.out.println("Nilai Angka Anda adalah "+nilaiAngka);
		System.out.println("Nilai Huruf Anda adalah "+nilaiHuruf);

	}
}
