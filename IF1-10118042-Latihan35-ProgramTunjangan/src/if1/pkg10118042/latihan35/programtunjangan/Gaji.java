/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan35.programtunjangan;

/**
 *
 * @author Alienware
 */
public class Gaji {
 public double gajiPokok;
    public String status;
    public double tunjangan;
    public double totalGaji;
    
    public double hitungTunjangan(double parGajiPokok, String parStatus){
        
        return tunjangan = parStatus.equals("Menikah")? 0.35*parGajiPokok:0;     
    }
    
    public double hitungTotalGaji (double parGajiPokok,double parTunjangan){
       
        return totalGaji=parGajiPokok + parTunjangan;
    }
    
    public void hasilHitung(String parStatus, double parGajiPokok){
        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.printf("Gaji Pokok\t: Rp. %.1f",gajiPokok);
        System.out.printf("%nTunjangan\t: Rp. %.1f",hitungTunjangan(parGajiPokok, parStatus));
        System.out.printf("%nTotal Gaji\t: Rp. %.1f",hitungTotalGaji(parGajiPokok, tunjangan));
        System.out.println("\nDeveloped by\t: Fatahillah Satria Bima Seno");
    }
}