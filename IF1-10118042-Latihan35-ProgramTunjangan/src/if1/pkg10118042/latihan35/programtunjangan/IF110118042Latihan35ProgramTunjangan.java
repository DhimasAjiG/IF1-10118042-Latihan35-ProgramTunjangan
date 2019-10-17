
package if1.pkg10118042.latihan35.programtunjangan;

import java.util.Scanner;
/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk menampilkan tunjangan dari karyawan
 * 
 */
public class IF110118042Latihan35ProgramTunjangan {
    
    public static void main(String[] args) {
      Scanner masuk = new Scanner(System.in);
        Gaji Gajih= new Gaji();
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda per bulan?\t: Rp. ");
        Gajih.gajiPokok= masuk.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        Gajih.status = masuk.next();

        Gajih.hasilHitung(Gajih.status, Gajih.gajiPokok);
    }

}