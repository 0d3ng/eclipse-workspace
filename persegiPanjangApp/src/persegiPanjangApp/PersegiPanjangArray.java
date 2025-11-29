package persegiPanjangApp;

import java.util.Scanner;

public class PersegiPanjangArray {

	public static void main(String[] args) {
//		how to use array
		/*
		 * char golonganA = 'A'; char golonganB = 'B'; char golonganC = 'C';
		 * System.out.println("GolonganA: " + golonganA + " GolonganB: " + golonganB +
		 * " GolonganC: " + golonganC);
		 * 
		 * char gols[] = new char[3]; gols[0] = 'A'; gols[1] = 'B'; gols[2] = 'C';
		 * System.out.println("GolonganA: " + gols[0] + " GolonganB: " + gols[1] +
		 * " GolonganC: " + gols[2]);
		 * 
		 * char golongans[] = { 'A', 'B', 'C' }; for (char gol : golongans) {
		 * System.out.println("golongan: " + gol); }
		 * 
		 * for (int i = 0; i < gols.length; i++) { System.out.println("golongan ke-" +
		 * (i + 1) + ": " + gols[i]); }
		 */

//		menginisialisasi variabel array 1 dimensi
		/*
		 * float vars[] = new float[4];
		 * 
		 * // input dari user Scanner input = new Scanner(System.in);
		 * System.out.print("Masukkan panjang: "); // panjang = input.nextFloat();
		 * vars[0] = input.nextFloat();
		 * 
		 * // cek apakah panjang < 0 if (vars[0] < 0) {
		 * System.out.println("Panjang tidak boleh < 0"); return; }
		 * 
		 * System.out.print("Masukkan lebar: "); vars[1] = input.nextFloat(); if
		 * (vars[1] < 0) { System.out.println("Lebar tidak boleh < 0"); return; }
		 * 
		 * // hitung luas dan keliling vars[2] = vars[0] * vars[1]; vars[3] = 2 *
		 * (vars[0]+ vars[1]);
		 * 
		 * // tampilan hasil perhitungan System.out.println("\n----------------------");
		 * System.out.println("Luas 	= " + vars[2]); System.out.println("Keliling= "
		 * + vars[3]); System.out.println("----------------------");
		 */

//		menginisialisasi variabel array 2 dimensi
		float vars[][] = new float[2][2];// baris pertama(panjang dan lebar), baris kedua(luas dan keliling)

//		input dari user
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan panjang: ");
//		panjang = input.nextFloat();
		vars[0][0] = input.nextFloat();

//		cek apakah panjang < 0
		if (vars[0][0] < 0) {
			System.out.println("Panjang tidak boleh < 0");
			return;
		}

		System.out.print("Masukkan lebar: ");
		vars[0][1] = input.nextFloat();
		if (vars[0][1] < 0) {
			System.out.println("Lebar tidak boleh < 0");
			return;
		}

//		hitung luas dan keliling
		vars[1][0] = vars[0][0] * vars[0][1];
		vars[1][1] = 2 * (vars[0][0] + vars[0][1]);

//		tampilan hasil perhitungan
		System.out.println("\n----------------------");
		System.out.println("Luas 	= " + vars[1][0]);
		System.out.println("Keliling= " + vars[1][1]);
		System.out.println("----------------------");
	}

}
