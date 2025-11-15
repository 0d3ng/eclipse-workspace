package persegiPanjangApp;

import java.util.Scanner;

public class PersegiPanjang {

	public static void main(String[] args) {
//		menginisialisasi variabel
		float panjang, lebar, keliling, luas;

//		input dari user
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan panjang: ");
		panjang = input.nextFloat();

//		cek apakah panjang < 0
		if (panjang < 0) {
			System.out.println("Panjang tidak boleh < 0");
			return;
		}

		System.out.print("Masukkan lebar: ");
		lebar = input.nextFloat();
		if (lebar < 0) {
			System.out.println("Lebar tidak boleh < 0");
			return;
		}

//		hitung luas dan keliling
		luas = panjang * lebar;
		keliling = 2 * (panjang + lebar);

//		tampilan hasil perhitungan
		System.out.println("Luas 	= " + luas);
		System.out.println("Keliling= " + keliling);
	}
}
