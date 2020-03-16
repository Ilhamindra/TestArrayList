package LatihanOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mahasiwa {
	Scanner input = new Scanner(System.in);
	byte pilih, hapus, update, pilihMhs;
	String nama, alamat, nim, umur;
	List<FakultasTeknik> teknik = new ArrayList<FakultasTeknik>();
	List<FakultasIlmuKomputer> komputer = new ArrayList<FakultasIlmuKomputer>();
	List<FakultasIlmuKomunikasi> komunikasi = new ArrayList<FakultasIlmuKomunikasi>();
	
	
	public void pilih (){
		System.out.println("-----------------------------");
		System.out.println("Tambah Data Untuk:          +");
		System.out.println("1. Fakultas Teknik          +");
		System.out.println("2. Fakultas Ilmu Komputer   +");
		System.out.println("3. Fakultas Ilmu Komunikasi +");
		System.out.println("-----------------------------");
		System.out.print("Pilih: "); pilihMhs = input.nextByte();
		if(pilihMhs == 1) {
			FakultasTeknik MhsAdd = new FakultasTeknik();
			MhsAdd.insert();
			teknik.add(MhsAdd);	
		}
		else if(pilihMhs == 2) {
			FakultasIlmuKomputer MhsAdd = new FakultasIlmuKomputer();
			MhsAdd.insert();
			komputer.add(MhsAdd);
		}
		else if(pilihMhs == 3) {
			FakultasIlmuKomunikasi MhsAdd = new FakultasIlmuKomunikasi();
			MhsAdd.insert();
			komunikasi.add(MhsAdd);
		}
		System.out.println("\nData Mahasiswa Berhasil Diinput!\n\n");
	}
	
	public void insert (){
		System.out.println("masukan Data Mahasiswa");
		System.out.print("Masukkan Nama     : "); nama = input.next();
		System.out.print("Masukkan umur     : "); umur = input.next();
		System.out.print("Masukkan Alamat   : "); alamat = input.next();
		System.out.print("Masukkan NIM      : "); nim = input.next();
		
		
		
	}

	public void FakultasTeknik (List<FakultasTeknik> data) {
		for(int i = 0 ; i <data.size()  ; i++) {
			System.out.println("===============Mahasiswa Ke-"+(i+1)+"===================");
			System.out.println("Nama Mahasiswa           : "+data.get(i).getNama());
			System.out.println("Umur Mahasiswa           : "+data.get(i).getUmur());
			System.out.println("Alamat Mahasiswa         : "+data.get(i).getAlamat());
			System.out.println("NIM Mahasiswa            : "+data.get(i).getNim());
		}
		
	}
	
	public void Spv (List<FakultasIlmuKomputer> data) {
		for(int i = 0 ; i <data.size()  ; i++) {
			System.out.println("===============Mahasiswa Ke-"+(i+1)+"===================");
			System.out.println("Nama Mahasiswa           : "+data.get(i).getNama());
			System.out.println("Umur Mahasiswa           : "+data.get(i).getUmur());
			System.out.println("Alamat Mahasiswa         : "+data.get(i).getAlamat());
			System.out.println("NIM Mahasiswa            : "+data.get(i).getNim());
		}
		
	}
	
	public void Staff(List<FakultasIlmuKomunikasi> data) {
		for(int i = 0 ; i <data.size()  ; i++) {
			System.out.println("===============Mahasiswa Ke-"+(i+1)+"===================");
			System.out.println("Nama Mahasiswa: "+data.get(i).getNama());
			System.out.println("NIK Mahasiswa: "+data.get(i).getUmur());
			System.out.println("Alamat Mahasiswa: "+data.get(i).getAlamat());
			System.out.println("Nomor Rekening Mahasiswa: "+data.get(i).getNim());
		}
		
	}
	
	public void hapus (){
		System.out.println("------------------------------");
		System.out.println("Hapus Data Untuk:            +");
		System.out.println("1. Fakultas Teknik           +");
		System.out.println("2. Fakultas Ilmu Komputer    +");
		System.out.println("3. Fakultas Ilmu Komunikasi  +");
		System.out.println("------------------------------");
		System.out.print("Pilih: "); pilihMhs = input.nextByte();
		System.out.print("Pilih Mahasiswa Ke-berapa yang ingin Dihapus: ");
		hapus = input.nextByte();
		if(pilihMhs == 1)
			teknik.remove((hapus-1));
		else if(pilihMhs == 2)
			komputer.remove((hapus-1));
		else if(pilihMhs == 3)
			komunikasi.remove((hapus-1));
		
		System.out.println("\nData Mahasiswa ke-"+hapus+" Berhasil Dihapus\n\n");
	}
	
	public void tampil (){
		System.out.println("-------------------------");
		System.out.println("Tampilkan Data Untuk:           +");
		System.out.println("1. Fakultas Teknik              +");
		System.out.println("2. Fakultas Ilmu Komputer       +");
		System.out.println("3. Fakultas Ilmu Komunikasi     +");
		System.out.println("-------------------------");
		System.out.print("Pilih: "); pilihMhs = input.nextByte();
		if(pilihMhs == 1) {
			FakultasTeknik tek = new FakultasTeknik();
			tek.FakultasTeknik(teknik);
		}
		else if(pilihMhs == 2) {
			FakultasIlmuKomputer komp = new FakultasIlmuKomputer();
			komp.Spv(komputer);
		}
		else if(pilihMhs == 3) {
			FakultasIlmuKomunikasi komu = new FakultasIlmuKomunikasi();
			komu.Staff(komunikasi);
		}
	}
	public void update(){
		System.out.println("-----------------------------------");
		System.out.println("Update Data Untuk:                +");
		System.out.println("1. Fakultas Teknik                +");
		System.out.println("2. Fakultas Ilmu Komputer         +");
		System.out.println("3. Fakultas Ilmu Komunikasi       +");
		System.out.println("-----------------------------------");
		System.out.print("Pilih: "); pilihMhs = input.nextByte();
		System.out.print("Pilih Mahasiswa Ke-berapa yang ingin Diupdate: ");
		update = input.nextByte();
		if(pilihMhs == 1) {
			FakultasTeknik TekUpdate = new FakultasTeknik();
			TekUpdate.insert();
			teknik.set((update-1), TekUpdate);
		}
		else if(pilihMhs == 2) {
			FakultasIlmuKomputer KompUpdate = new FakultasIlmuKomputer();
			KompUpdate.insert();
			komputer.set((update-1), KompUpdate);
		}
		else if(pilihMhs == 3) {
			FakultasIlmuKomunikasi KomuUpdate = new FakultasIlmuKomunikasi();
			KomuUpdate.insert();
			komunikasi.set((update-1), KomuUpdate);
		}
		System.out.println("\nData Mahasiswa Ke-"+(update)+" Berhasil Diupdate!\n\n");
		
	}
	
	public void tugas (){
		System.out.println("------------------------------");
		System.out.println("Lihat Tugas dari:            +");
		System.out.println("1. Fakultas Teknik           +");
		System.out.println("2. Fakultas Ilmu Komputer    +");
		System.out.println("3. Fakultas Ilmu Komunikasi  +");
		System.out.println("------------------------------");
		System.out.print("Pilih: "); pilihMhs = input.nextByte();
		if(pilihMhs == 1) {
			FakultasTeknik prodi = new FakultasTeknik();
			prodi.ProdiTeknik();
		} else if(pilihMhs == 2) {
			FakultasIlmuKomputer prodi = new FakultasIlmuKomputer();
			prodi.ProdiKomputer();
		} else if(pilihMhs == 3) {
			FakultasIlmuKomunikasi prodi = new FakultasIlmuKomunikasi();
			prodi.ProdiKomunikasi();
		}
	}
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getUmur() {
		return umur;
	}

	public void setUmur(String umur) {
		this.umur = umur;
	}
	
}
