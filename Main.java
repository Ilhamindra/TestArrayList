package LatihanOOP;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Mahasiwa Mahasiswa = new Mahasiwa();
		Scanner input = new Scanner(System.in);
		byte pilih, hapus, update;
		do{
			System.out.println();
			System.out.println("------Data Universitas Mercubuana------");
			System.out.println("1. Input Data Mahasiswa               +");
			System.out.println("2. View Data Mahasiswa                +");
			System.out.println("3. Update Data Mahasiswa              +");
			System.out.println("4. Delete Data Mahasiswa              +");			
			System.out.println("5. Prodi Fakultas                     +");
			System.out.println("6. END                                +");
			System.out.println("---------------------------------------");
			System.out.print("pilih Menu : ");
			pilih = input.nextByte();
			
			switch (pilih){
			case 1:
				Mahasiswa.pilih();
				break;
			case 2:
				Mahasiswa.tampil();
				break;
			case 3:
				Mahasiswa.update();
				break;
			case 4:
				Mahasiswa.hapus();
				break;
			case 5:
				Mahasiswa.tugas();
				break;
				
			
			}
		}while (pilih !=6);
		input.close();
		

	}

}
